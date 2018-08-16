package alex.mrrok.knowmeapp.databinding;

import alex.mrrok.presentation.screens.user.list.settinguserpage.SettingUserViewModel;
import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public abstract class ActivitySettingsBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appBarLayout1;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView13;

  @NonNull
  public final Toolbar toolBar;

  @Bindable
  protected SettingUserViewModel mViewModel;

  protected ActivitySettingsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appBarLayout1, ImageView imageView3, ImageView imageView4,
      ImageView imageView6, TextView textView10, TextView textView11, TextView textView12,
      TextView textView13, Toolbar toolBar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appBarLayout1 = appBarLayout1;
    this.imageView3 = imageView3;
    this.imageView4 = imageView4;
    this.imageView6 = imageView6;
    this.textView10 = textView10;
    this.textView11 = textView11;
    this.textView12 = textView12;
    this.textView13 = textView13;
    this.toolBar = toolBar;
  }

  public abstract void setViewModel(@Nullable SettingUserViewModel viewModel);

  @Nullable
  public SettingUserViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivitySettingsBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.activity_settings, root, attachToRoot, component);
  }

  @Nullable
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivitySettingsBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.activity_settings, null, false, component);
  }

  @NonNull
  public static ActivitySettingsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivitySettingsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivitySettingsBinding)bind(component, view, alex.mrrok.knowmeapp.R.layout.activity_settings);
  }
}
