package alex.mrrok.knowmeapp.databinding;
import alex.mrrok.knowmeapp.R;
import alex.mrrok.knowmeapp.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingImpl extends ActivityLoginBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView9, 5);
        sViewsWithIds.put(R.id.constraintLayout, 6);
        sViewsWithIds.put(R.id.textInputLayout, 7);
        sViewsWithIds.put(R.id.textInputLayout2, 8);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener inputEmailandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.email.get()
            //         is viewModel.email.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(inputEmail);
            // localize variables for thread safety
            // viewModel.email.get()
            java.lang.String viewModelEmailGet = null;
            // viewModel.email
            android.databinding.ObservableField<java.lang.String> viewModelEmail = null;
            // viewModel
            alex.mrrok.presentation.screens.user.list.loginpage.LoginPageViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.email != null
            boolean viewModelEmailJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelEmail = viewModel.email;

                viewModelEmailJavaLangObjectNull = (viewModelEmail) != (null);
                if (viewModelEmailJavaLangObjectNull) {




                    viewModelEmail.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener inputPasswordandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.password.get()
            //         is viewModel.password.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(inputPassword);
            // localize variables for thread safety
            // viewModel.password != null
            boolean viewModelPasswordJavaLangObjectNull = false;
            // viewModel.password.get()
            java.lang.String viewModelPasswordGet = null;
            // viewModel
            alex.mrrok.presentation.screens.user.list.loginpage.LoginPageViewModel viewModel = mViewModel;
            // viewModel.password
            android.databinding.ObservableField<java.lang.String> viewModelPassword = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPassword = viewModel.password;

                viewModelPasswordJavaLangObjectNull = (viewModelPassword) != (null);
                if (viewModelPasswordJavaLangObjectNull) {




                    viewModelPassword.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityLoginBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.support.v7.widget.AppCompatButton) bindings[3]
            , (android.support.constraint.ConstraintLayout) bindings[6]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.support.design.widget.TextInputLayout) bindings[7]
            , (android.support.design.widget.TextInputLayout) bindings[8]
            );
        this.btnLogin.setTag(null);
        this.inputEmail.setTag(null);
        this.inputPassword.setTag(null);
        this.linkSignup.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((alex.mrrok.presentation.screens.user.list.loginpage.LoginPageViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable alex.mrrok.presentation.screens.user.list.loginpage.LoginPageViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelEmail((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelPassword((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelEmail(android.databinding.ObservableField<java.lang.String> ViewModelEmail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPassword(android.databinding.ObservableField<java.lang.String> ViewModelPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.view.View.OnClickListener viewModelSignUp = null;
        android.databinding.ObservableField<java.lang.String> viewModelEmail = null;
        java.lang.String viewModelEmailGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelPassword = null;
        java.lang.String viewModelPasswordGet = null;
        android.view.View.OnClickListener viewModelLogin = null;
        alex.mrrok.presentation.screens.user.list.loginpage.LoginPageViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.signUp
                        viewModelSignUp = viewModel.signUp;
                        // read viewModel.login
                        viewModelLogin = viewModel.login;
                    }
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.email
                        viewModelEmail = viewModel.email;
                    }
                    updateRegistration(0, viewModelEmail);


                    if (viewModelEmail != null) {
                        // read viewModel.email.get()
                        viewModelEmailGet = viewModelEmail.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.password
                        viewModelPassword = viewModel.password;
                    }
                    updateRegistration(1, viewModelPassword);


                    if (viewModelPassword != null) {
                        // read viewModel.password.get()
                        viewModelPasswordGet = viewModelPassword.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.btnLogin.setOnClickListener(viewModelLogin);
            this.linkSignup.setOnClickListener(viewModelSignUp);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.inputEmail, viewModelEmailGet);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.inputEmail, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, inputEmailandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.inputPassword, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, inputPasswordandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.inputPassword, viewModelPasswordGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.email
        flag 1 (0x2L): viewModel.password
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}