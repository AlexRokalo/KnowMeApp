package alex.mrrok.knowmeapp.databinding;

import alex.mrrok.presentation.screens.user.list.mainpage.fragmentmaps.MapsFragmentViewModel;
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

public abstract class CustomMarkerLayoutBinding extends ViewDataBinding {
  @NonNull
  public final ImageView customIcon;

  @Bindable
  protected MapsFragmentViewModel mViewModel;

  protected CustomMarkerLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView customIcon) {
    super(_bindingComponent, _root, _localFieldCount);
    this.customIcon = customIcon;
  }

  public abstract void setViewModel(@Nullable MapsFragmentViewModel viewModel);

  @Nullable
  public MapsFragmentViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static CustomMarkerLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CustomMarkerLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CustomMarkerLayoutBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.custom_marker_layout, root, attachToRoot, component);
  }

  @Nullable
  public static CustomMarkerLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CustomMarkerLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CustomMarkerLayoutBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.custom_marker_layout, null, false, component);
  }

  @NonNull
  public static CustomMarkerLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CustomMarkerLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (CustomMarkerLayoutBinding)bind(component, view, alex.mrrok.knowmeapp.R.layout.custom_marker_layout);
  }
}
