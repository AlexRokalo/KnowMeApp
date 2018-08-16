package alex.mrrok.knowmeapp.databinding;

import alex.mrrok.presentation.screens.user.list.userpage.UserPageViewModel;
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

public abstract class ActivityAnotheUserBinding extends ViewDataBinding {
  @NonNull
  public final Button button3;

  @NonNull
  public final FrameLayout frameLayout;

  @NonNull
  public final FrameLayout frameLayout2;

  @NonNull
  public final CircleImageView imageView2;

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
  protected UserPageViewModel mViewModel;

  protected ActivityAnotheUserBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button button3, FrameLayout frameLayout, FrameLayout frameLayout2,
      CircleImageView imageView2, TextView textView3, TextView textView4, TextView textView5,
      TextView textView8, TextView textView9) {
    super(_bindingComponent, _root, _localFieldCount);
    this.button3 = button3;
    this.frameLayout = frameLayout;
    this.frameLayout2 = frameLayout2;
    this.imageView2 = imageView2;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.textView8 = textView8;
    this.textView9 = textView9;
  }

  public abstract void setViewModel(@Nullable UserPageViewModel viewModel);

  @Nullable
  public UserPageViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityAnotheUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityAnotheUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityAnotheUserBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.activity_anothe_user, root, attachToRoot, component);
  }

  @Nullable
  public static ActivityAnotheUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityAnotheUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityAnotheUserBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.activity_anothe_user, null, false, component);
  }

  @NonNull
  public static ActivityAnotheUserBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityAnotheUserBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityAnotheUserBinding)bind(component, view, alex.mrrok.knowmeapp.R.layout.activity_anothe_user);
  }
}
