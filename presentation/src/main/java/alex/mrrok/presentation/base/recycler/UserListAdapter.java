package alex.mrrok.presentation.base.recycler;

import android.support.annotation.NonNull;
import android.view.ViewGroup;

import alex.mrrok.domain.entity.UserInformation;
import alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserlist.UserItemViewHolder;
import alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserlist.UserItemViewModel;

public class UserListAdapter extends BaseRecyclerViewAdapter<UserInformation,UserItemViewModel> {

    @NonNull
    @Override
    public BaseItemViewHolder<UserInformation, UserItemViewModel, ?> onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return UserItemViewHolder.create(parent, new UserItemViewModel());
    }
}
