package alex.mrrok.knowmeapp.databinding;

import alex.mrrok.presentation.screens.user.list.addnews.AddNewsViewModel;
import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

public abstract class ActivityAddNewsBinding extends ViewDataBinding {
  @NonNull
  public final ImageView userNewsPhoto;

  @NonNull
  public final EditText userNewsText;

  @Bindable
  protected AddNewsViewModel mViewModel;

  protected ActivityAddNewsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView userNewsPhoto, EditText userNewsText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.userNewsPhoto = userNewsPhoto;
    this.userNewsText = userNewsText;
  }

  public abstract void setViewModel(@Nullable AddNewsViewModel viewModel);

  @Nullable
  public AddNewsViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityAddNewsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityAddNewsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityAddNewsBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.activity_add_news, root, attachToRoot, component);
  }

  @Nullable
  public static ActivityAddNewsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityAddNewsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityAddNewsBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.activity_add_news, null, false, component);
  }

  @NonNull
  public static ActivityAddNewsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityAddNewsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityAddNewsBinding)bind(component, view, alex.mrrok.knowmeapp.R.layout.activity_add_news);
  }
}
