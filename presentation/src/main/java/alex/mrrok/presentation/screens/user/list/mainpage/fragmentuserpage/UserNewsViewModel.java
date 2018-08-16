package alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserpage;

import android.databinding.ObservableField;

import alex.mrrok.domain.entity.UserInformation;
import alex.mrrok.domain.entity.UserNews;
import alex.mrrok.presentation.base.recycler.BaseItemViewModel;

public class UserNewsViewModel extends BaseItemViewModel<UserNews> {

    public ObservableField<String> photo = new ObservableField<>("");
    public ObservableField<String> title = new ObservableField<>("");

    @Override
    public void setItem(UserNews userNews, int position) {
        photo.set(userNews.getPhoto());
        title.set(userNews.getTitle());
    }
}
