package alex.mrrok.knowmeapp.databinding;

import alex.mrrok.presentation.screens.user.list.loginpage.LoginPageViewModel;
import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public abstract class ActivityLoginBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnLogin;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final ImageView imageView9;

  @NonNull
  public final EditText inputEmail;

  @NonNull
  public final EditText inputPassword;

  @NonNull
  public final TextView linkSignup;

  @NonNull
  public final TextInputLayout textInputLayout;

  @NonNull
  public final TextInputLayout textInputLayout2;

  @Bindable
  protected LoginPageViewModel mViewModel;

  protected ActivityLoginBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppCompatButton btnLogin, ConstraintLayout constraintLayout,
      ImageView imageView9, EditText inputEmail, EditText inputPassword, TextView linkSignup,
      TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnLogin = btnLogin;
    this.constraintLayout = constraintLayout;
    this.imageView9 = imageView9;
    this.inputEmail = inputEmail;
    this.inputPassword = inputPassword;
    this.linkSignup = linkSignup;
    this.textInputLayout = textInputLayout;
    this.textInputLayout2 = textInputLayout2;
  }

  public abstract void setViewModel(@Nullable LoginPageViewModel viewModel);

  @Nullable
  public LoginPageViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityLoginBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.activity_login, root, attachToRoot, component);
  }

  @Nullable
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityLoginBinding>inflate(inflater, alex.mrrok.knowmeapp.R.layout.activity_login, null, false, component);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityLoginBinding)bind(component, view, alex.mrrok.knowmeapp.R.layout.activity_login);
  }
}
