package alex.mrrok.presentation.screens.user.list.userpage;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import alex.mrrok.knowmeapp.R;
import alex.mrrok.knowmeapp.databinding.ActivityAnotheUserBinding;
import alex.mrrok.presentation.base.BaseMvvmActivity;

public class UserPageAcitvity extends BaseMvvmActivity<UserPageViewModel,
        ActivityAnotheUserBinding,UserPageRouter> {

    @Override
    protected UserPageViewModel provideViewModel() {
        return ViewModelProviders.of(this).get(UserPageViewModel.class);
    }

    @Override
    protected int provideLayoutID() {
        return R.layout.activity_anothe_user;
    }

    @Override
    protected UserPageRouter provideRouter() {
        return new UserPageRouter(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("UserPageAcitvity",getIntent().getExtras().getString("userId"));
        viewModel.userId.onNext(getIntent().getExtras().getString("userId"));

     }
}
