package alex.mrrok.presentation.screens.user.list.loginpage;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import alex.mrrok.knowmeapp.R;
import alex.mrrok.knowmeapp.databinding.ActivityLoginBinding;
import alex.mrrok.presentation.base.BaseMvvmActivity;

public class LoginPageActivity extends
        BaseMvvmActivity<LoginPageViewModel, ActivityLoginBinding, LoginPageRouter> {

    @Override
    protected LoginPageViewModel provideViewModel() {
        return ViewModelProviders.of(this).get(LoginPageViewModel.class);
    }

    @Override
    protected int provideLayoutID() {
        return R.layout.activity_login;
    }

    @Override
    protected LoginPageRouter provideRouter() {
        return new LoginPageRouter(this);
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("LoginPageActivity", "WORK");
        viewModel.emailText.set(binding.inputEmail);
        viewModel.passwordText.set(binding.inputPassword);
    }

}