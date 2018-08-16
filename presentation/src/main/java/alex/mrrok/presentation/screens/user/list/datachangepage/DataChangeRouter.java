package alex.mrrok.presentation.screens.user.list.datachangepage;

import android.content.Intent;

import alex.mrrok.presentation.base.BaseRouter;
import alex.mrrok.presentation.screens.user.list.settinguserpage.SettingUserActivity;

public class DataChangeRouter extends BaseRouter<DataChangeActivity> {
    public DataChangeRouter(DataChangeActivity activity) {
        super(activity);
    }

    public void startSettingUserActivity() {
        Intent intent = new Intent(getActivity(), SettingUserActivity.class);
        getActivity().startActivity(intent);
    }

    @Override
    public void goBack() {
        startSettingUserActivity();
        finish();
    }
}