package alex.mrrok.presentation.screens.user.list.createuseraccount;

import android.content.Intent;

import alex.mrrok.presentation.base.BaseRouter;
import alex.mrrok.presentation.screens.user.list.loginpage.LoginPageActivity;
import alex.mrrok.presentation.screens.user.list.mainpage.MainPageActivity;

public class CreateUserRouter extends BaseRouter<CreateUserActivity> {

    public CreateUserRouter(CreateUserActivity activity) {
        super(activity);
    }

    public void startLoginPageActivity() {
        Intent intent = new Intent(getActivity(), LoginPageActivity.class);
        getActivity().startActivity(intent);
    }

    public void startMainPageActivity() {
        Intent intent = new Intent(getActivity(), MainPageActivity.class);
        getActivity().startActivity(intent);
    }
}
