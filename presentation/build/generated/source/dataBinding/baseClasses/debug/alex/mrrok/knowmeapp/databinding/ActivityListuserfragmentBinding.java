package alex.mrrok.knowmeapp.databinding;

import alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserlist.UserListFragmentViewModel;
import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class ActivityListuserfragmentBinding extends ViewDataBinding {
  @NonNull
  public final Toolbar fragmentToolbar;

  @NonNull
  public final RecyclerView recyclerView;

  @Bindable
  protected UserListFragmentViewModel mViewModel;

  protected ActivityListuserfragmentBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Toolbar fragmentToolbar, RecyclerView recyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fragmentToolbar = fragmentToolbar;
    this.recyclerView = recyclerView;
  }

  public abstract void setViewModel(@Nullable UserListFragmentViewModel viewModel);

  @Nullable
  public UserListFragmentViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityListuserfragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityListuserfragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityListuserfragmentBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.activity_listuserfragment, root, attachToRoot, component);
  }

  @Nullable
  public static ActivityListuserfragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityListuserfragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityListuserfragmentBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.activity_listuserfragment, null, false, component);
  }

  @NonNull
  public static ActivityListuserfragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityListuserfragmentBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityListuserfragmentBinding)bind(component, view, alex.mrrok.knowmeapp.R.layout.activity_listuserfragment);
  }
}
