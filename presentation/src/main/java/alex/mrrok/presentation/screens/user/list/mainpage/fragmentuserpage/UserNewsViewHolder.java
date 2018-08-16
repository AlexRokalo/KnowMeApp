package alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserpage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import alex.mrrok.domain.entity.UserNews;
import alex.mrrok.knowmeapp.databinding.ItemNewsBinding;
import alex.mrrok.presentation.base.recycler.BaseItemViewHolder;


public class UserNewsViewHolder extends BaseItemViewHolder<UserNews,
        UserNewsViewModel, ItemNewsBinding> {

    public UserNewsViewHolder(UserNewsViewModel viewModel, ItemNewsBinding binding) {
        super(viewModel, binding);
    }

    public static UserNewsViewHolder create(ViewGroup parent, UserNewsViewModel viewModel) {
        ItemNewsBinding binding = ItemNewsBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false);
        return new UserNewsViewHolder(viewModel, binding);
    }
}
