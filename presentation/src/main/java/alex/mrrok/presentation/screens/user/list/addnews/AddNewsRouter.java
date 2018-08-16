package alex.mrrok.presentation.screens.user.list.addnews;

import android.content.Intent;

import alex.mrrok.presentation.base.BaseRouter;
import alex.mrrok.presentation.screens.user.list.mainpage.MainPageActivity;

public class AddNewsRouter extends BaseRouter<AddNewsActivity> {

    public AddNewsRouter(AddNewsActivity activity) {
        super(activity);
    }

    public void startMainPageActivity(){
        Intent intent = new Intent(getActivity(),MainPageActivity.class);
        getActivity().startActivity(intent);
    }
}
