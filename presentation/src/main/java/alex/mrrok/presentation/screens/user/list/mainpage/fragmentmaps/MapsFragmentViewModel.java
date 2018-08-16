package alex.mrrok.presentation.screens.user.list.mainpage.fragmentmaps;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.databinding.ObservableField;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.location.Location;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import alex.mrrok.app.App;
import alex.mrrok.data.phonedata.SaveUserKey;
import alex.mrrok.domain.entity.UserGeoPosition;
import alex.mrrok.domain.entity.UserInformation;
import alex.mrrok.domain.usecases.DataBaseInfoUserCase;
import alex.mrrok.domain.usecases.GeoAllFiltreUseCase;
import alex.mrrok.domain.usecases.GeoIdUseCase;
import alex.mrrok.domain.usecases.UserLocationUseCase;
import alex.mrrok.knowmeapp.R;
import alex.mrrok.presentation.base.BaseViewModel;
import alex.mrrok.presentation.screens.user.list.mainpage.MainPageRouter;
import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;

public class MapsFragmentViewModel extends BaseViewModel<MainPageRouter> {

    @Inject
    public UserLocationUseCase locationUseCase;
    @Inject
    public GeoIdUseCase geoIdUseCase;
    @Inject
    public GeoAllFiltreUseCase geoAllFiltreUseCase;
    @Inject
    public DataBaseInfoUserCase dataBaseInfoUserCase;

    private static final float DEFAULT_ZOOM = 15f;

    public Observable timerecvest;
    public PublishSubject<Long> time = PublishSubject.create();

    public GoogleMap mMap;
    public Boolean mLocationPermissionsGranted = false;

    public ObservableField<Button> btnFind = new ObservableField<>();
    public ObservableField<FrameLayout> frmLayout = new ObservableField<>();
    public ObservableField<String> photo = new ObservableField<>("");

    private UserGeoPosition userGeoPositionOnline = new UserGeoPosition();
    private UserGeoPosition userGeoPositionOfline = new UserGeoPosition();

    @Override
    protected void runInject() {
        App.getAppComponent().inject(this);
    }

    public MapsFragmentViewModel() {
        Log.e("MapsFragmentViewModel", "WOKR");
    }

    public View.OnClickListener find = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!isGpsOn()) {
                showDialogWindow();
            } else {
                btnFind.get().setVisibility(View.INVISIBLE);
                frmLayout.get().setVisibility(View.VISIBLE);
                getOnlineUser();
                getDeviceLocation();
                setGeolacation(getUserGeoPositionOnline());

            }

        }
    };

    private void showDialogWindow() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(router.getActivity());
        builder.setMessage("Your GPS seems to be disabled, do you want to enable it?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(@SuppressWarnings("unused") final
                                        DialogInterface dialog, @SuppressWarnings("unused") final int id) {
                        router.getActivity()
                                .startActivityForResult(new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS),
                                        2);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(final DialogInterface dialog, @SuppressWarnings("unused") final int id) {
                        dialog.cancel();
                    }
                });
        final AlertDialog alert = builder.create();
        alert.show();
    }

    public boolean isGpsOn() {
        LocationManager locationManager = (LocationManager) router.getActivity()
                .getSystemService(router.getActivity().LOCATION_SERVICE);
        boolean enabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        return enabled;
    }

    public void addMarkerToMap(Double la, Double lo) {
        Log.e("addMarkerToMap", Double.toString(la));
//        Log.e("photo", photo.get());

      /*  View marker = ((LayoutInflater) router.getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.custom_marker_layout, null);*/
       /* TextView numTxt = (TextView) marker.findViewById(R.id.num_txt);
        numTxt.setText("27");*/


        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(la, lo)));
//                .icon(BitmapDescriptorFactory.fromPath(photo.get())));
//                .icon(BitmapDescriptorFactory.fromBitmap(createDrawableFromView(router.getActivity(), marker))));
    }

    public static Bitmap createDrawableFromView(Context context, View view) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        view.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT));
        view.measure(displayMetrics.widthPixels, displayMetrics.heightPixels);
        view.layout(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        view.buildDrawingCache();
        Bitmap bitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);

        Canvas canvas = new Canvas(bitmap);
        view.draw(canvas);

        return bitmap;
    }

    @Override
    public void onPause() {
        super.onPause();
        btnFind.get().setVisibility(View.VISIBLE);
        frmLayout.get().setVisibility(View.INVISIBLE);
        setGeolacation(getUserGeoPositionOfline());
    }

    public String validateEmail(String email) {
        String result = "email%3D'" + email.replace("@", "%40") + "'";
        Log.e("validateEmail", result);
        return result;
    }

    public void setGeolacation(UserGeoPosition geo) {
        geoIdUseCase.getIndificator(validateEmail(SaveUserKey.getEmail()))
                .subscribe(new Observer<UserGeoPosition>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        getCompositeDisposable().add(d);
                    }

                    @Override
                    public void onNext(UserGeoPosition userGeoPosition) {
                        locationUseCase.setLocation(geo, userGeoPosition.getObjectId())
                                .subscribe(new CompletableObserver() {
                                    @Override
                                    public void onSubscribe(Disposable d) {
                                        getCompositeDisposable().add(d);
                                    }

                                    @Override
                                    public void onComplete() {
                                        Log.e("Complite", "Work");
                                    }

                                    @Override
                                    public void onError(Throwable e) {
                                        Log.e("onErrorLocation", e.toString());
                                    }
                                });
                    }

                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onComplete() {
                    }
                });
    }


    public void getDeviceLocation() {
        FusedLocationProviderClient fusedLocationProviderClient =
                LocationServices.getFusedLocationProviderClient(router.getActivity());
        try {
            if (mLocationPermissionsGranted) {
                final Task location = fusedLocationProviderClient.getLastLocation();
                location.addOnCompleteListener(new OnCompleteListener() {
                    @Override
                    public void onComplete(@NonNull Task task) {
                        if (task.isSuccessful()) {
                            Log.e("onComplete", "onComplete: found location!");
                            Location currentLocation = (Location) task.getResult();
                            if (currentLocation != null) {
                                setGeoTransaction(currentLocation.getLatitude()
                                        , currentLocation.getLongitude(), 1);
                                setOfflineGeo(currentLocation.getLatitude()
                                        , currentLocation.getLongitude(), 0);
                                Log.e("currentLocation", "currentLocation.getLatitude() = "
                                        + currentLocation.getLatitude() + "currentLocation.getLongitude() = " +
                                        currentLocation.getLongitude());
                                moveCamera(new LatLng(currentLocation.getLatitude(), currentLocation.getLongitude()),
                                        DEFAULT_ZOOM);
                            }

                        } else {
                            Toast.makeText(router.getActivity(), "unable to get current location", Toast.LENGTH_SHORT).show();
                        }
                    }

                });
            }
        } catch (SecurityException e) {
            Log.e("SecurityException", e.toString());
        }
    }

    public void getOnlineUser() {
        time.subscribe(new Observer<Long>() {
            @Override
            public void onSubscribe(Disposable d) {
                getCompositeDisposable().add(d);
            }

            @Override
            public void onNext(Long aLong) {
                Log.e("ПРИХОДИТ", Long.toString(aLong));
                geoAllFiltreUseCase.getAll()
                        .subscribe(new Observer<List<UserGeoPosition>>() {
                            @Override
                            public void onSubscribe(Disposable d) {
                                getCompositeDisposable().add(d);
                            }

                            @Override
                            public void onNext(List<UserGeoPosition> userGeoPositions) {
                                mMap.clear();
                                for (int i = 0; i < userGeoPositions.size(); i++) {
                                    dataBaseInfoUserCase
                                            .load(userGeoPositions.get(i).getEmail())
                                            .subscribe(new Observer<UserInformation>() {
                                                @Override
                                                public void onSubscribe(Disposable d) {

                                                }

                                                @Override
                                                public void onNext(UserInformation userInformation) {
                                                    Log.e("onError", userInformation.getPhoto());
                                                    photo.set(userInformation.getPhoto());

                                                }

                                                @Override
                                                public void onError(Throwable e) {
                                                    Log.e("onError", e.toString());
                                                }

                                                @Override
                                                public void onComplete() {
                                                    Log.e("onCompleteDataBase", "work");
                                                }
                                            });
                                    addMarkerToMap(Double.parseDouble(userGeoPositions.get(i).getLatitude())
                                            , Double.parseDouble(userGeoPositions.get(i).getLongitude()));
                                }
                            }

                            @Override
                            public void onError(Throwable e) {
                                Log.e("onErrorGeo", e.toString());
                            }

                            @Override
                            public void onComplete() {
                            }
                        });
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });

    }


    private void moveCamera(LatLng latLng, float zoom) {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoom));
    }

    private void setGeoTransaction(Double la, Double lo, int online) {
        userGeoPositionOnline.setLatitude(Double.toString(la));
        userGeoPositionOnline.setLongitude(Double.toString(lo));
        userGeoPositionOnline.setOnline(online);
    }

    private void setOfflineGeo(Double la, Double lo, int online) {
        userGeoPositionOfline.setLatitude(Double.toString(la));
        userGeoPositionOfline.setLongitude(Double.toString(lo));
        userGeoPositionOfline.setOnline(online);
    }


    private UserGeoPosition getUserGeoPositionOnline() {
        return userGeoPositionOnline;
    }

    public UserGeoPosition getUserGeoPositionOfline() {
        return userGeoPositionOfline;
    }
}
