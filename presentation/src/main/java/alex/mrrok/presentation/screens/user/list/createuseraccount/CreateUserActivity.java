package alex.mrrok.presentation.screens.user.list.createuseraccount;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;

import alex.mrrok.knowmeapp.R;
import alex.mrrok.knowmeapp.databinding.ActivitySignupBinding;
import alex.mrrok.presentation.base.BaseMvvmActivity;

public class CreateUserActivity extends BaseMvvmActivity<CreateUserViewModel,
        ActivitySignupBinding, CreateUserRouter> {

    @Override
    protected CreateUserViewModel provideViewModel() {
        return ViewModelProviders.of(this).get(CreateUserViewModel.class);
    }

    @Override
    protected int provideLayoutID() {
        return R.layout.activity_signup;
    }

    @Override
    protected CreateUserRouter provideRouter() {
        return new CreateUserRouter(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel.nameText.set(binding.inputName);
        viewModel.nicknameText.set(binding.inputSurname);
        viewModel.emailText.set(binding.inputEmail);
        viewModel.passwordText.set(binding.inputPassword);
    }
}
