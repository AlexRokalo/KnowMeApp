package alex.mrrok.presentation.screens.user.list.createuseraccount;

import android.app.ProgressDialog;
import android.databinding.ObservableField;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import javax.inject.Inject;

import alex.mrrok.app.App;
import alex.mrrok.data.phonedata.SaveUserKey;
import alex.mrrok.domain.entity.UserGeoPosition;
import alex.mrrok.domain.entity.UserInformation;
import alex.mrrok.domain.entity.UserRegister;
import alex.mrrok.domain.usecases.CreateUserInfoUseCase;
import alex.mrrok.domain.usecases.GeoSetUserCase;
import alex.mrrok.domain.usecases.RegistrationUserUseCase;
import alex.mrrok.domain.usecases.UserDataBaseUseCase;
import alex.mrrok.knowmeapp.R;
import alex.mrrok.presentation.base.BaseViewModel;
import alex.mrrok.presentation.screens.user.edit.CreateUserTransaction;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;

import static alex.mrrok.presentation.screens.user.list.mainpage.MainPageActivity.DELAY_MILLIS;


public class CreateUserViewModel extends BaseViewModel<CreateUserRouter> {

    @Inject
    public RegistrationUserUseCase registrationUserUseCase;
    @Inject
    public CreateUserInfoUseCase createUserInfoUseCase;
    @Inject
    public GeoSetUserCase geoSetUserCase;
    @Inject
    public UserDataBaseUseCase dataBase;

    public ObservableField<String> name = new ObservableField<>();
    public ObservableField<String> nickName = new ObservableField<>();
    public ObservableField<String> email = new ObservableField<>();
    public ObservableField<String> password = new ObservableField<>();

    public ObservableField<EditText> nameText = new ObservableField<>();
    public ObservableField<EditText> nicknameText = new ObservableField<>();
    public ObservableField<EditText> emailText = new ObservableField<>();
    public ObservableField<EditText> passwordText = new ObservableField<>();


    @Override
    protected void runInject() {
        App.getAppComponent().inject(this);
    }



    public View.OnClickListener linkLogin = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            router.startLoginPageActivity();
            router.finish();
        }
    };



    public UserGeoPosition geoTransaction() {
        return new CreateUserTransaction().geoTransaction(email.get());
    }

    private UserInformation createUserInfo() {
        return new CreateUserTransaction()
                .createUserInfo(name.get(), nickName.get(), email.get());
    }

    private UserRegister createUser() {
        return new CreateUserTransaction().createUser(email.get(),password.get());
    }



    public void startMainPageActivity() {
        final ProgressDialog progressDialog = new ProgressDialog(router.getActivity(),
                R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Creating account...");
        progressDialog.show();

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        router.startMainPageActivity();
                        router.finish();
                        progressDialog.dismiss();
                    }
                }, DELAY_MILLIS);
    }


    public View.OnClickListener createUser = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!validate()) {
                return;
            }

            dataBase.addToDataBase(createUserInfo())
                    .subscribe(new CompletableObserver() {
                        @Override
                        public void onSubscribe(Disposable d) {
                            getCompositeDisposable().add(d);
                        }

                        @Override
                        public void onComplete() {
                            Log.e("onCompleteDataBase", "work");
                        }

                        @Override
                        public void onError(Throwable e) {
                            Log.e("onErrorDataBase", e.toString());
                        }
                    });


            registrationUserUseCase.register(createUser())
                    .subscribe(new CompletableObserver() {
                        @Override
                        public void onSubscribe(Disposable d) {
                            getCompositeDisposable().add(d);
                        }

                        @Override
                        public void onComplete() {
                            createUserInfoUseCase.createUserInfo(createUserInfo())
                                    .subscribe(new CompletableObserver() {
                                        @Override
                                        public void onSubscribe(Disposable d) {
                                            getCompositeDisposable().add(d);
                                        }

                                        @Override
                                        public void onComplete() {
                                        }

                                        @Override
                                        public void onError(Throwable e) {
                                            Log.e("onError", e.toString());
                                        }
                                    });

                            geoSetUserCase.setPoint(geoTransaction())
                                    .subscribe(new CompletableObserver() {
                                        @Override
                                        public void onSubscribe(Disposable d) {

                                        }

                                        @Override
                                        public void onComplete() {

                                        }

                                        @Override
                                        public void onError(Throwable e) {
                                            Log.e("onError", e.toString());
                                        }
                                    });
                            startMainPageActivity();
                            SaveUserKey.saveUserKey(email.get());
                        }

                        @Override
                        public void onError(Throwable e) {
                            Log.e("onError", e.toString());
                            emailText.get().setError("already existsn");
                        }
                    });


        }
    };

    private boolean validate() {
        boolean valid = true;

        String name = nameText.get().getText().toString();
        String surname = nicknameText.get().getText().toString();
        String email = emailText.get().getText().toString();
        String password = passwordText.get().getText().toString();

        if (name.isEmpty() || name.length() < 2) {
            nameText.get().setError("at least 2 characters");
            valid = false;
        } else {
            nameText.get().setError(null);
        }

        if (surname.isEmpty() || surname.length() < 2) {
            nicknameText.get().setError("at least 2 characters");
            valid = false;
        } else {
            nicknameText.get().setError(null);
        }

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            emailText.get().setError("enter a valid email address");
            valid = false;
        } else {
            emailText.get().setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
            passwordText.get().setError("between 3 and 10 alphanumeric characters");
            valid = false;
        } else {
            passwordText.get().setError(null);
        }

        return valid;
    }
}