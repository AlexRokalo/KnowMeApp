package alex.mrrok.presentation.screens.user.list.mainpage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import alex.mrrok.knowmeapp.R;
import alex.mrrok.presentation.base.BaseRouter;
import alex.mrrok.presentation.screens.user.list.addnews.AddNewsActivity;
import alex.mrrok.presentation.screens.user.list.loginpage.LoginPageActivity;
import alex.mrrok.presentation.screens.user.list.loginpage.LoginPageViewModel;
import alex.mrrok.presentation.screens.user.list.settinguserpage.SettingUserActivity;
import alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserpage.FragmentRouter;
import alex.mrrok.presentation.screens.user.list.userpage.UserPageAcitvity;

public class MainPageRouter extends BaseRouter<MainPageActivity> implements FragmentRouter {
    
    public MainPageRouter(MainPageActivity activity) {
        super(activity);
    }

    public void startLoginPageActivity() {
        Intent intent = new Intent(getActivity(), LoginPageActivity.class);
        getActivity().startActivity(intent);
    }

    public void startSettingUserActivity() {
        Intent intent = new Intent(getActivity(), SettingUserActivity.class);
        getActivity().overridePendingTransition(R.anim.right_in, R.anim.left_out);
        getActivity().startActivity(intent);
    }

    public void startUserPageActivity(String id) {
        Intent intent = new Intent(getActivity(), UserPageAcitvity.class);
        intent.putExtra("userId", id);
        getActivity().startActivity(intent);
    }

    public void startAddNewsActivity() {
        Intent intent = new Intent(getActivity(), AddNewsActivity.class);
        getActivity().overridePendingTransition(R.anim.right_in, R.anim.left_out);
        getActivity().startActivity(intent);
    }

}