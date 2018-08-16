package alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserlist;

import android.databinding.ObservableField;

import alex.mrrok.domain.entity.UserInformation;
import alex.mrrok.presentation.base.recycler.BaseItemViewModel;

public class UserItemViewModel extends BaseItemViewModel<UserInformation> {

    public ObservableField<String> username = new ObservableField<>("");
    public ObservableField<String> nickName = new ObservableField<>("");
    public ObservableField<String> photo = new ObservableField<>("");


    @Override
    public void setItem(UserInformation userInformation, int position) {
        username.set(userInformation.getName());
        nickName.set(userInformation.getNickName());
        photo.set(userInformation.getPhoto());
    }
}
