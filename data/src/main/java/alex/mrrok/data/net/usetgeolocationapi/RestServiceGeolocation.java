package alex.mrrok.data.net.usetgeolocationapi;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import alex.mrrok.data.BuildConfig;
import alex.mrrok.data.entity.GeoPoint;
import alex.mrrok.data.net.HttpConection;
import io.reactivex.Completable;
import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestServiceGeolocation  implements RestApiGeolocation {

    private RestApiGeolocation restApi;
    private Gson gson;
    private HttpConection httpConection;

    @Inject
    public RestServiceGeolocation() {
        httpConection = new HttpConection();
        httpConection.setOkHttp();

        gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        this.restApi = new Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl("https://api.backendless.com/5B4247FF-EC12-2AE1-FF4D-959409B77A00/" +
                        "BA4A29D5-DBC7-4F6A-FF7A-DFB1DBE86600/")
                .client(httpConection.getOkHttp())
                .build()
                .create(RestApiGeolocation.class);
    }

    @Override
    public Completable setUser(GeoPoint geoPoint) {
        return restApi.setUser(geoPoint);
    }

    @Override
    public Completable setPoint(GeoPoint geoPoint,String id) {
        return restApi.setPoint(geoPoint,id);
    }

    @Override
    public Observable<List<GeoPoint>> getIndificator(String email) {
        return restApi.getIndificator(email);
    }

    @Override
    public Observable<List<GeoPoint>> getAll() {
        return restApi.getAll();
    }


}
