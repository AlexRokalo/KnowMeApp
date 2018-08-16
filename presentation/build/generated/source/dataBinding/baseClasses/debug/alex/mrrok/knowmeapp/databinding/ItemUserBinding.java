package alex.mrrok.knowmeapp.databinding;

import alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserlist.UserItemViewModel;
import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import de.hdodenhof.circleimageview.CircleImageView;

public abstract class ItemUserBinding extends ViewDataBinding {
  @NonNull
  public final CircleImageView imageView8;

  @NonNull
  public final TextView textView14;

  @Bindable
  protected UserItemViewModel mViewModel;

  protected ItemUserBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, CircleImageView imageView8, TextView textView14) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView8 = imageView8;
    this.textView14 = textView14;
  }

  public abstract void setViewModel(@Nullable UserItemViewModel viewModel);

  @Nullable
  public UserItemViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ItemUserBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemUserBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemUserBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.item_user, root, attachToRoot, component);
  }

  @Nullable
  public static ItemUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemUserBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.item_user, null, false, component);
  }

  @NonNull
  public static ItemUserBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemUserBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
    return (ItemUserBinding)bind(component, view, alex.mrrok.knowmeapp.R.layout.item_user);
  }
}
