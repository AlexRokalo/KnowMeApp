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

public abstract class ActivityFragmentmapBinding extends ViewDataBinding {
  @Bindable
  protected MapsFragmentViewModel mViewModel;

  protected ActivityFragmentmapBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable MapsFragmentViewModel viewModel);

  @Nullable
  public MapsFragmentViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityFragmentmapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityFragmentmapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityFragmentmapBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.activity_fragmentmap, root, attachToRoot, component);
  }

  @Nullable
  public static ActivityFragmentmapBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityFragmentmapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityFragmentmapBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.activity_fragmentmap, null, false, component);
  }

  @NonNull
  public static ActivityFragmentmapBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityFragmentmapBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityFragmentmapBinding)bind(component, view, alex.mrrok.knowmeapp.R.layout.activity_fragmentmap);
  }
}
