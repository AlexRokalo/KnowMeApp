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
import android.widget.Button;
import android.widget.FrameLayout;

public abstract class ActivityMapBinding extends ViewDataBinding {
  @NonNull
  public final Button btnFind;

  @NonNull
  public final FrameLayout frameLayoutMap;

  @Bindable
  protected MapsFragmentViewModel mViewModel;

  protected ActivityMapBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button btnFind, FrameLayout frameLayoutMap) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnFind = btnFind;
    this.frameLayoutMap = frameLayoutMap;
  }

  public abstract void setViewModel(@Nullable MapsFragmentViewModel viewModel);

  @Nullable
  public MapsFragmentViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityMapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMapBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.activity_map, root, attachToRoot, component);
  }

  @Nullable
  public static ActivityMapBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMapBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.activity_map, null, false, component);
  }

  @NonNull
  public static ActivityMapBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMapBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityMapBinding)bind(component, view, alex.mrrok.knowmeapp.R.layout.activity_map);
  }
}
