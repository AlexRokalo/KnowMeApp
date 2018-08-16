package alex.mrrok.presentation.screens.user.list.loginpage;

import android.content.Intent;

import alex.mrrok.presentation.base.BaseRouter;
import alex.mrrok.presentation.screens.user.list.createuseraccount.CreateUserActivity;
import alex.mrrok.presentation.screens.user.list.mainpage.MainPageActivity;

public class LoginPageRouter extends BaseRouter<LoginPageActivity> {

    public LoginPageRouter(LoginPageActivity activity) {
        super(activity);
    }

    public void startMainPageActivity() {
        Intent intent = new Intent(getActivity(), MainPageActivity.class);
        getActivity().startActivity(intent);
    }

    public void startCreateUserActivity() {
        Intent intent = new Intent(getActivity(), CreateUserActivity.class);
        getActivity().startActivity(intent);
    }
}
