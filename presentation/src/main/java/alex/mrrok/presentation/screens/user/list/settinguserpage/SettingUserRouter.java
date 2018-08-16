package alex.mrrok.presentation.screens.user.list.settinguserpage;

import android.content.Intent;

import alex.mrrok.presentation.base.BaseRouter;
import alex.mrrok.presentation.screens.user.list.datachangepage.DataChangeActivity;
import alex.mrrok.presentation.screens.user.list.mainpage.MainPageActivity;

public class SettingUserRouter extends BaseRouter<SettingUserActivity> {

    public SettingUserRouter(SettingUserActivity activity) {
        super(activity);
    }

    public void startMainPageActivity() {
        Intent intent = new Intent(getActivity(), MainPageActivity.class);
        getActivity().startActivity(intent);
    }

    public void startDataChangeActivity() {
        Intent intent = new Intent(getActivity(), DataChangeActivity.class);
        getActivity().startActivity(intent);
    }

    @Override
    public void goBack() {
        startMainPageActivity();
        finish();
    }
}
