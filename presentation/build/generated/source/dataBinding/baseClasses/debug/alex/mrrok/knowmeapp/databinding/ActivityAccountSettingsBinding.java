package alex.mrrok.knowmeapp.databinding;

import alex.mrrok.presentation.screens.user.list.datachangepage.DataChangeViewModel;
import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.Guideline;
import android.support.design.widget.AppBarLayout;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import de.hdodenhof.circleimageview.CircleImageView;

public abstract class ActivityAccountSettingsBinding extends ViewDataBinding {
  @NonNull
  public final Toolbar accountToolbar;

  @NonNull
  public final CircleImageView addPhotoCircle;

  @NonNull
  public final AppBarLayout appBarLayout2;

  @NonNull
  public final EditText editText;

  @NonNull
  public final EditText editText2;

  @NonNull
  public final EditText editText3;

  @NonNull
  public final EditText editText4;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final ImageView imageView7;

  @NonNull
  public final ImageView imageViewBack;

  @NonNull
  public final ImageView imageViewSave;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView11;

  @Bindable
  protected DataChangeViewModel mViewModel;

  protected ActivityAccountSettingsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Toolbar accountToolbar, CircleImageView addPhotoCircle,
      AppBarLayout appBarLayout2, EditText editText, EditText editText2, EditText editText3,
      EditText editText4, Guideline guideline2, Guideline guideline3, ImageView imageView4,
      ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageViewBack,
      ImageView imageViewSave, TextView textView10, TextView textView11) {
    super(_bindingComponent, _root, _localFieldCount);
    this.accountToolbar = accountToolbar;
    this.addPhotoCircle = addPhotoCircle;
    this.appBarLayout2 = appBarLayout2;
    this.editText = editText;
    this.editText2 = editText2;
    this.editText3 = editText3;
    this.editText4 = editText4;
    this.guideline2 = guideline2;
    this.guideline3 = guideline3;
    this.imageView4 = imageView4;
    this.imageView5 = imageView5;
    this.imageView6 = imageView6;
    this.imageView7 = imageView7;
    this.imageViewBack = imageViewBack;
    this.imageViewSave = imageViewSave;
    this.textView10 = textView10;
    this.textView11 = textView11;
  }

  public abstract void setViewModel(@Nullable DataChangeViewModel viewModel);

  @Nullable
  public DataChangeViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityAccountSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityAccountSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityAccountSettingsBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.activity_account_settings, root, attachToRoot, component);
  }

  @Nullable
  public static ActivityAccountSettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityAccountSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityAccountSettingsBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.activity_account_settings, null, false, component);
  }

  @NonNull
  public static ActivityAccountSettingsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityAccountSettingsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityAccountSettingsBinding)bind(component, view, alex.mrrok.knowmeapp.R.layout.activity_account_settings);
  }
}
