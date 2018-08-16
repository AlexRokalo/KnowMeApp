package alex.mrrok.knowmeapp.databinding;

import alex.mrrok.presentation.screens.user.list.createuseraccount.CreateUserViewModel;
import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public abstract class ActivitySignupBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnSignup;

  @NonNull
  public final EditText inputEmail;

  @NonNull
  public final EditText inputName;

  @NonNull
  public final EditText inputPassword;

  @NonNull
  public final EditText inputSurname;

  @NonNull
  public final TextView linkLogin;

  @Bindable
  protected CreateUserViewModel mViewModel;

  protected ActivitySignupBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppCompatButton btnSignup, EditText inputEmail, EditText inputName,
      EditText inputPassword, EditText inputSurname, TextView linkLogin) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSignup = btnSignup;
    this.inputEmail = inputEmail;
    this.inputName = inputName;
    this.inputPassword = inputPassword;
    this.inputSurname = inputSurname;
    this.linkLogin = linkLogin;
  }

  public abstract void setViewModel(@Nullable CreateUserViewModel viewModel);

  @Nullable
  public CreateUserViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivitySignupBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.activity_signup, root, attachToRoot, component);
  }

  @Nullable
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivitySignupBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.activity_signup, null, false, component);
  }

  @NonNull
  public static ActivitySignupBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivitySignupBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivitySignupBinding)bind(component, view, alex.mrrok.knowmeapp.R.layout.activity_signup);
  }
}
