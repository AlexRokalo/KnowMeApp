package alex.mrrok.knowmeapp.databinding;

import alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserpage.UserPageFragmentViewModel;
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
import android.widget.TextView;
import de.hdodenhof.circleimageview.CircleImageView;

public abstract class ActivityVpuserBinding extends ViewDataBinding {
  @NonNull
  public final CircleImageView activityVpCircleImage;

  @NonNull
  public final Button button3;

  @NonNull
  public final FrameLayout frameLayout;

  @NonNull
  public final FrameLayout frameLayout2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView textView9;

  @Bindable
  protected UserPageFragmentViewModel mViewModel;

  protected ActivityVpuserBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, CircleImageView activityVpCircleImage, Button button3,
      FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView3, TextView textView4,
      TextView textView5, TextView textView8, TextView textView9) {
    super(_bindingComponent, _root, _localFieldCount);
    this.activityVpCircleImage = activityVpCircleImage;
    this.button3 = button3;
    this.frameLayout = frameLayout;
    this.frameLayout2 = frameLayout2;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.textView8 = textView8;
    this.textView9 = textView9;
  }

  public abstract void setViewModel(@Nullable UserPageFragmentViewModel viewModel);

  @Nullable
  public UserPageFragmentViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityVpuserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityVpuserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityVpuserBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.activity_vpuser, root, attachToRoot, component);
  }

  @Nullable
  public static ActivityVpuserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityVpuserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityVpuserBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.activity_vpuser, null, false, component);
  }

  @NonNull
  public static ActivityVpuserBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityVpuserBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityVpuserBinding)bind(component, view, alex.mrrok.knowmeapp.R.layout.activity_vpuser);
  }
}
