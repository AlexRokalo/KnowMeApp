package alex.mrrok.presentation.base.recycler;

import android.support.annotation.NonNull;
import android.view.ViewGroup;

import alex.mrrok.domain.entity.UserInformation;
import alex.mrrok.domain.entity.UserNews;
import alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserpage.UserNewsViewHolder;
import alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserpage.UserNewsViewModel;

public class UserNewsAdapter extends BaseRecyclerViewAdapter<UserNews, UserNewsViewModel> {

    @NonNull
    @Override
    public BaseItemViewHolder<UserNews, UserNewsViewModel, ?>
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return UserNewsViewHolder.create(parent, new UserNewsViewModel());
    }
}
