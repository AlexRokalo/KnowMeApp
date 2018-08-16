package alex.mrrok.presentation.screens.user.list.datachangepage;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.squareup.picasso.Picasso;

import java.io.FileNotFoundException;
import java.io.InputStream;

import alex.mrrok.data.phonedata.SaveUserKey;
import alex.mrrok.knowmeapp.R;
import alex.mrrok.knowmeapp.databinding.ActivityAccountSettingsBinding;
import alex.mrrok.presentation.base.BaseMvvmActivity;
import alex.mrrok.presentation.screens.user.edit.CircleTransforme;
import alex.mrrok.presentation.screens.user.list.loginpage.LoginPageViewModel;

public class DataChangeActivity extends BaseMvvmActivity<DataChangeViewModel,
        ActivityAccountSettingsBinding, DataChangeRouter> {

    @Override
    protected DataChangeViewModel provideViewModel() {
        return ViewModelProviders.of(this).get(DataChangeViewModel.class);
    }

    @Override
    protected int provideLayoutID() {
        return R.layout.activity_account_settings;
    }

    @Override
    protected DataChangeRouter provideRouter() {
        return new DataChangeRouter(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar = binding.accountToolbar;
        setSupportActionBar(toolbar);
        getEmail();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            if (requestCode == 1) {
                Log.e("onActivityResult", data.getDataString());
                viewModel.photo.set(data.getDataString());
                Log.e("photo",viewModel.photo.get());
                Picasso.get().load(data.getData()).into(binding.addPhotoCircle);

            }
        }
    }

    public void getEmail() {
        viewModel.userEmail.onNext(SaveUserKey.getEmail());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        viewModel.goBackPrecc();
    }
}
