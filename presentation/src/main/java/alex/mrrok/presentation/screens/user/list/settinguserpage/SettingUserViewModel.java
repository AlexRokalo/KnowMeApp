package alex.mrrok.presentation.screens.user.list.settinguserpage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;

import alex.mrrok.data.phonedata.SaveUserKey;
import alex.mrrok.presentation.base.BaseViewModel;
import alex.mrrok.presentation.screens.user.list.loginpage.LoginPageViewModel;

public class SettingUserViewModel extends BaseViewModel<SettingUserRouter> {

    @Override
    protected void runInject() {

    }

    public SettingUserViewModel() {
    }

    public View.OnClickListener goBack = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            router.startMainPageActivity();
            router.finish();
        }
    };

    public View.OnClickListener accountSetting = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            router.startDataChangeActivity();
            router.finish();
        }
    };

    public View.OnClickListener signOut = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            SaveUserKey.deleteUserKey();
            router.finish();
        }
    };

    public void goBackPress() {
        router.goBack();
    }

}
