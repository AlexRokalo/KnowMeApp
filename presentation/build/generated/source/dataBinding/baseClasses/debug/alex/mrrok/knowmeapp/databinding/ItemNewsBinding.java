package alex.mrrok.knowmeapp.databinding;

import alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserpage.UserNewsViewModel;
import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public abstract class ItemNewsBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageView11;

  @Bindable
  protected UserNewsViewModel mViewModel;

  protected ItemNewsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView imageView11) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView11 = imageView11;
  }

  public abstract void setViewModel(@Nullable UserNewsViewModel viewModel);

  @Nullable
  public UserNewsViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ItemNewsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemNewsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemNewsBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.item_news, root, attachToRoot, component);
  }

  @Nullable
  public static ItemNewsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemNewsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemNewsBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.item_news, null, false, component);
  }

  @NonNull
  public static ItemNewsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemNewsBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
    return (ItemNewsBinding)bind(component, view, alex.mrrok.knowmeapp.R.layout.item_news);
  }
}
