package alex.mrrok.knowmeapp.databinding;
import alex.mrrok.knowmeapp.R;
import alex.mrrok.knowmeapp.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySignupBindingImpl extends ActivitySignupBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
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
            alex.mrrok.presentation.screens.user.list.createuseraccount.CreateUserViewModel viewModel = mViewModel;
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
    private android.databinding.InverseBindingListener inputNameandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.name.get()
            //         is viewModel.name.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(inputName);
            // localize variables for thread safety
            // viewModel.name.get()
            java.lang.String viewModelNameGet = null;
            // viewModel.name != null
            boolean viewModelNameJavaLangObjectNull = false;
            // viewModel.name
            android.databinding.ObservableField<java.lang.String> viewModelName = null;
            // viewModel
            alex.mrrok.presentation.screens.user.list.createuseraccount.CreateUserViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelName = viewModel.name;

                viewModelNameJavaLangObjectNull = (viewModelName) != (null);
                if (viewModelNameJavaLangObjectNull) {




                    viewModelName.set(((java.lang.String) (callbackArg_0)));
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
            alex.mrrok.presentation.screens.user.list.createuseraccount.CreateUserViewModel viewModel = mViewModel;
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
    private android.databinding.InverseBindingListener inputSurnameandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.nickName.get()
            //         is viewModel.nickName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(inputSurname);
            // localize variables for thread safety
            // viewModel.nickName != null
            boolean viewModelNickNameJavaLangObjectNull = false;
            // viewModel.nickName
            android.databinding.ObservableField<java.lang.String> viewModelNickName = null;
            // viewModel
            alex.mrrok.presentation.screens.user.list.createuseraccount.CreateUserViewModel viewModel = mViewModel;
            // viewModel.nickName.get()
            java.lang.String viewModelNickNameGet = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelNickName = viewModel.nickName;

                viewModelNickNameJavaLangObjectNull = (viewModelNickName) != (null);
                if (viewModelNickNameJavaLangObjectNull) {




                    viewModelNickName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivitySignupBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivitySignupBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.support.v7.widget.AppCompatButton) bindings[5]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[2]
            , (android.widget.TextView) bindings[6]
            );
        this.btnSignup.setTag(null);
        this.inputEmail.setTag(null);
        this.inputName.setTag(null);
        this.inputPassword.setTag(null);
        this.inputSurname.setTag(null);
        this.linkLogin.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setViewModel((alex.mrrok.presentation.screens.user.list.createuseraccount.CreateUserViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable alex.mrrok.presentation.screens.user.list.createuseraccount.CreateUserViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
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
                return onChangeViewModelName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelPassword((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelNickName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
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
    private boolean onChangeViewModelName(android.databinding.ObservableField<java.lang.String> ViewModelName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPassword(android.databinding.ObservableField<java.lang.String> ViewModelPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelNickName(android.databinding.ObservableField<java.lang.String> ViewModelNickName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        android.view.View.OnClickListener viewModelCreateUser = null;
        android.databinding.ObservableField<java.lang.String> viewModelEmail = null;
        java.lang.String viewModelEmailGet = null;
        android.view.View.OnClickListener viewModelLinkLogin = null;
        android.databinding.ObservableField<java.lang.String> viewModelName = null;
        java.lang.String viewModelNickNameGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelPassword = null;
        java.lang.String viewModelPasswordGet = null;
        java.lang.String viewModelNameGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelNickName = null;
        alex.mrrok.presentation.screens.user.list.createuseraccount.CreateUserViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x30L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.createUser
                        viewModelCreateUser = viewModel.createUser;
                        // read viewModel.linkLogin
                        viewModelLinkLogin = viewModel.linkLogin;
                    }
            }
            if ((dirtyFlags & 0x31L) != 0) {

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
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.name
                        viewModelName = viewModel.name;
                    }
                    updateRegistration(1, viewModelName);


                    if (viewModelName != null) {
                        // read viewModel.name.get()
                        viewModelNameGet = viewModelName.get();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.password
                        viewModelPassword = viewModel.password;
                    }
                    updateRegistration(2, viewModelPassword);


                    if (viewModelPassword != null) {
                        // read viewModel.password.get()
                        viewModelPasswordGet = viewModelPassword.get();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.nickName
                        viewModelNickName = viewModel.nickName;
                    }
                    updateRegistration(3, viewModelNickName);


                    if (viewModelNickName != null) {
                        // read viewModel.nickName.get()
                        viewModelNickNameGet = viewModelNickName.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.btnSignup.setOnClickListener(viewModelCreateUser);
            this.linkLogin.setOnClickListener(viewModelLinkLogin);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.inputEmail, viewModelEmailGet);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.inputEmail, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, inputEmailandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.inputName, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, inputNameandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.inputPassword, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, inputPasswordandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.inputSurname, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, inputSurnameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.inputName, viewModelNameGet);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.inputPassword, viewModelPasswordGet);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.inputSurname, viewModelNickNameGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.email
        flag 1 (0x2L): viewModel.name
        flag 2 (0x3L): viewModel.password
        flag 3 (0x4L): viewModel.nickName
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}