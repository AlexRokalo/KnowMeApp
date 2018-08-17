package alex.mrrok.presentation.screens.user.list.addnews;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.squareup.picasso.Picasso;

import alex.mrrok.knowmeapp.R;
import alex.mrrok.knowmeapp.databinding.ActivityAddNewsBinding;
import alex.mrrok.presentation.base.BaseMvvmActivity;

import static alex.mrrok.presentation.screens.user.list.addnews.AddNewsViewModel.REQUEST_PHOTO;

public class AddNewsActivity extends BaseMvvmActivity<AddNewsViewModel, ActivityAddNewsBinding,
        AddNewsRouter> {
    @Override
    protected AddNewsViewModel provideViewModel() {
        return ViewModelProviders.of(this).get(AddNewsViewModel.class);
    }

    @Override
    protected int provideLayoutID() {
        return R.layout.activity_add_news;
    }

    @Override
    protected AddNewsRouter provideRouter() {
        return new AddNewsRouter(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            if (requestCode == REQUEST_PHOTO) {
                viewModel.photo.set(data.getDataString());
                Picasso.get().load(data.getData()).into(binding.userNewsPhoto);
            }
        }
    }
}
