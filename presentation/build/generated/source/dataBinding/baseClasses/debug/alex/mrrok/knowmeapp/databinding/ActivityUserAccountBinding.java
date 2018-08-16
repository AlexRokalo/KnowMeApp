package alex.mrrok.knowmeapp.databinding;

import alex.mrrok.presentation.screens.user.list.mainpage.MainPageViewModel;
import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import devlight.io.library.ntb.NavigationTabBar;

public abstract class ActivityUserAccountBinding extends ViewDataBinding {
  @NonNull
  public final NavigationTabBar ntbHorizontal;

  @NonNull
  public final ViewPager viewPager;

  @Bindable
  protected MainPageViewModel mViewModel;

  protected ActivityUserAccountBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, NavigationTabBar ntbHorizontal, ViewPager viewPager) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ntbHorizontal = ntbHorizontal;
    this.viewPager = viewPager;
  }

  public abstract void setViewModel(@Nullable MainPageViewModel viewModel);

  @Nullable
  public MainPageViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityUserAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityUserAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityUserAccountBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.activity_user_account, root, attachToRoot, component);
  }

  @Nullable
  public static ActivityUserAccountBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityUserAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityUserAccountBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.activity_user_account, null, false, component);
  }

  @NonNull
  public static ActivityUserAccountBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityUserAccountBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityUserAccountBinding)bind(component, view, alex.mrrok.knowmeapp.R.layout.activity_user_account);
  }
}
