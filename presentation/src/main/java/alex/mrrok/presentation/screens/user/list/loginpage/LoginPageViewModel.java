package alex.mrrok.presentation.screens.user.list.loginpage;

import android.app.ProgressDialog;
import android.databinding.ObservableField;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
;

import javax.inject.Inject;

import alex.mrrok.app.App;
import alex.mrrok.data.phonedata.SaveUserKey;
import alex.mrrok.data.repository.UserRepositoryImp;
import alex.mrrok.domain.entity.UserRegister;
import alex.mrrok.domain.usecases.LogInUserUseCase;
import alex.mrrok.knowmeapp.R;
import alex.mrrok.presentation.base.BaseViewModel;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import static alex.mrrok.presentation.screens.user.list.mainpage.MainPageActivity.DELAY_MILLIS;

public class LoginPageViewModel extends BaseViewModel<LoginPageRouter> {

    @Inject
    public LogInUserUseCase logInUserUseCase;

    public ObservableField<String> email = new ObservableField<>("");
    public ObservableField<String> password = new ObservableField<>("");

    public ObservableField<EditText> emailText = new ObservableField<>();
    public ObservableField<EditText> passwordText = new ObservableField<>();


    @Override
    protected void runInject() {
        App.getAppComponent().inject(this);
    }

    private String validateEmail(String email) {
        email.replace("@", "%40");
        String result = "email%3D'" + email + "'";
        return result;
    }

    public View.OnClickListener signUp = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            router.startCreateUserActivity();
            router.finish();
        }
    };

    public void startUserPageActivity() {
        final ProgressDialog progressDialog = new ProgressDialog(router.getActivity(),
                R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Authenticating...");
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


    public View.OnClickListener login = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!validate()) {
                return;
            }
            logInUserUseCase.login(validateEmail(email.get()))
                    .subscribe(new Observer<UserRegister>() {
                        @Override
                        public void onSubscribe(Disposable d) {

                            getCompositeDisposable().add(d);
                        }
                        @Override
                        public void onNext(UserRegister user) {
                            if (checkEmail(user) && checkPassword(user)) {
                                startUserPageActivity();
                                SaveUserKey.saveUserKey(user.getEmail());
                            }

                        }
                        @Override
                        public void onError(Throwable e) {
                            Log.e("onErrorLOGIN", e.toString());
                        }
                        @Override
                        public void onComplete() {
                        }
                    });
        }
    };

    private boolean validate() {
        boolean valid = true;

        String email = emailText.get().getText().toString();
        String password = passwordText.get().getText().toString();

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            emailText.get().setError("enter a valid email address");
            valid = false;
        } else {
            emailText.get().setError(null);
        }

        if (password.isEmpty() || password.length() < 3 || password.length() > 10) {
            passwordText.get().setError("between 3 and 10 alphanumeric characters");
            valid = false;
        } else {
            passwordText.get().setError(null);
        }

        return valid;

    }

    private boolean checkEmail(UserRegister user) {
        if (user.getEmail().equals(UserRepositoryImp.WRONG_EMAIL)) {
            emailText.get().setError("wrong email");
            return false;
        }
        return true;
    }

    private boolean checkPassword(UserRegister user) {
        if (!user.getPassword().equals(password.get())) {
            passwordText.get().setError("wrong password");
            return false;
        }
        return true;
    }

}
