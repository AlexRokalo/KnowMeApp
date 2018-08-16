package alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserlist;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import alex.mrrok.domain.entity.UserInformation;
import alex.mrrok.knowmeapp.databinding.ItemUserBinding;
import alex.mrrok.presentation.base.recycler.BaseItemViewHolder;

public class UserItemViewHolder extends BaseItemViewHolder<UserInformation, UserItemViewModel, ItemUserBinding> {


    public UserItemViewHolder(UserItemViewModel viewModel, ItemUserBinding binding) {
        super(viewModel, binding);
    }

    public static UserItemViewHolder create(ViewGroup parent, UserItemViewModel viewModel) {
        ItemUserBinding binding = ItemUserBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false);
        return new UserItemViewHolder(viewModel, binding);
    }
}
