package alex.mrrok.presentation.screens.user.list.settinguserpage;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

import alex.mrrok.knowmeapp.R;
import alex.mrrok.knowmeapp.databinding.ActivitySettingsBinding;
import alex.mrrok.presentation.base.BaseMvvmActivity;

public class SettingUserActivity extends BaseMvvmActivity<SettingUserViewModel,
        ActivitySettingsBinding, SettingUserRouter> {
    @Override
    protected SettingUserViewModel provideViewModel() {
        return ViewModelProviders.of(this).get(SettingUserViewModel.class);
    }

    @Override
    protected int provideLayoutID() {
        return R.layout.activity_settings;
    }

    @Override
    protected SettingUserRouter provideRouter() {
        return new SettingUserRouter(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar = binding.toolBar;
        setSupportActionBar(toolbar);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        viewModel.goBackPress();
    }
}
