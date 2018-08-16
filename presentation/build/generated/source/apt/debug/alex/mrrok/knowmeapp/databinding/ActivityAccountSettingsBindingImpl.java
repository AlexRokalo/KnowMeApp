package alex.mrrok.knowmeapp.databinding;
import alex.mrrok.knowmeapp.R;
import alex.mrrok.knowmeapp.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAccountSettingsBindingImpl extends ActivityAccountSettingsBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appBarLayout2, 8);
        sViewsWithIds.put(R.id.accountToolbar, 9);
        sViewsWithIds.put(R.id.textView10, 10);
        sViewsWithIds.put(R.id.textView11, 11);
        sViewsWithIds.put(R.id.imageView4, 12);
        sViewsWithIds.put(R.id.imageView5, 13);
        sViewsWithIds.put(R.id.imageView6, 14);
        sViewsWithIds.put(R.id.imageView7, 15);
        sViewsWithIds.put(R.id.guideline2, 16);
        sViewsWithIds.put(R.id.guideline3, 17);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener editTextandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.name.get()
            //         is viewModel.name.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editText);
            // localize variables for thread safety
            // viewModel.name.get()
            java.lang.String viewModelNameGet = null;
            // viewModel.name != null
            boolean viewModelNameJavaLangObjectNull = false;
            // viewModel.name
            android.databinding.ObservableField<java.lang.String> viewModelName = null;
            // viewModel
            alex.mrrok.presentation.screens.user.list.datachangepage.DataChangeViewModel viewModel = mViewModel;
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
    private android.databinding.InverseBindingListener editText2androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.nickName.get()
            //         is viewModel.nickName.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editText2);
            // localize variables for thread safety
            // viewModel.nickName != null
            boolean viewModelNickNameJavaLangObjectNull = false;
            // viewModel.nickName
            android.databinding.ObservableField<java.lang.String> viewModelNickName = null;
            // viewModel
            alex.mrrok.presentation.screens.user.list.datachangepage.DataChangeViewModel viewModel = mViewModel;
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
    private android.databinding.InverseBindingListener editText3androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.phone.get()
            //         is viewModel.phone.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editText3);
            // localize variables for thread safety
            // viewModel.phone != null
            boolean viewModelPhoneJavaLangObjectNull = false;
            // viewModel
            alex.mrrok.presentation.screens.user.list.datachangepage.DataChangeViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.phone
            android.databinding.ObservableField<java.lang.String> viewModelPhone = null;
            // viewModel.phone.get()
            java.lang.String viewModelPhoneGet = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPhone = viewModel.phone;

                viewModelPhoneJavaLangObjectNull = (viewModelPhone) != (null);
                if (viewModelPhoneJavaLangObjectNull) {




                    viewModelPhone.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener editText4androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.userInfo.get()
            //         is viewModel.userInfo.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editText4);
            // localize variables for thread safety
            // viewModel.userInfo
            android.databinding.ObservableField<java.lang.String> viewModelUserInfo = null;
            // viewModel.userInfo != null
            boolean viewModelUserInfoJavaLangObjectNull = false;
            // viewModel.userInfo.get()
            java.lang.String viewModelUserInfoGet = null;
            // viewModel
            alex.mrrok.presentation.screens.user.list.datachangepage.DataChangeViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelUserInfo = viewModel.userInfo;

                viewModelUserInfoJavaLangObjectNull = (viewModelUserInfo) != (null);
                if (viewModelUserInfoJavaLangObjectNull) {




                    viewModelUserInfo.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityAccountSettingsBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private ActivityAccountSettingsBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.support.v7.widget.Toolbar) bindings[9]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[3]
            , (android.support.design.widget.AppBarLayout) bindings[8]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[7]
            , (android.support.constraint.Guideline) bindings[16]
            , (android.support.constraint.Guideline) bindings[17]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            );
        this.addPhotoCircle.setTag(null);
        this.editText.setTag(null);
        this.editText2.setTag(null);
        this.editText3.setTag(null);
        this.editText4.setTag(null);
        this.imageViewBack.setTag(null);
        this.imageViewSave.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
            setViewModel((alex.mrrok.presentation.screens.user.list.datachangepage.DataChangeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable alex.mrrok.presentation.screens.user.list.datachangepage.DataChangeViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelUserInfo((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelPhone((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelPhoto((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelNickName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelUserInfo(android.databinding.ObservableField<java.lang.String> ViewModelUserInfo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPhone(android.databinding.ObservableField<java.lang.String> ViewModelPhone, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPhoto(android.databinding.ObservableField<java.lang.String> ViewModelPhoto, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelName(android.databinding.ObservableField<java.lang.String> ViewModelName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelNickName(android.databinding.ObservableField<java.lang.String> ViewModelNickName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        java.lang.String viewModelPhoneGet = null;
        java.lang.String viewModelUserInfoGet = null;
        android.view.View.OnClickListener viewModelGoBack = null;
        android.databinding.ObservableField<java.lang.String> viewModelUserInfo = null;
        android.databinding.ObservableField<java.lang.String> viewModelPhone = null;
        android.databinding.ObservableField<java.lang.String> viewModelPhoto = null;
        android.view.View.OnClickListener viewModelAddPhoto = null;
        android.databinding.ObservableField<java.lang.String> viewModelName = null;
        android.view.View.OnClickListener viewModelSave = null;
        java.lang.String viewModelNickNameGet = null;
        java.lang.String viewModelPhotoGet = null;
        java.lang.String viewModelNameGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelNickName = null;
        alex.mrrok.presentation.screens.user.list.datachangepage.DataChangeViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x60L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.goBack
                        viewModelGoBack = viewModel.goBack;
                        // read viewModel.addPhoto
                        viewModelAddPhoto = viewModel.addPhoto;
                        // read viewModel.save
                        viewModelSave = viewModel.save;
                    }
            }
            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.userInfo
                        viewModelUserInfo = viewModel.userInfo;
                    }
                    updateRegistration(0, viewModelUserInfo);


                    if (viewModelUserInfo != null) {
                        // read viewModel.userInfo.get()
                        viewModelUserInfoGet = viewModelUserInfo.get();
                    }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.phone
                        viewModelPhone = viewModel.phone;
                    }
                    updateRegistration(1, viewModelPhone);


                    if (viewModelPhone != null) {
                        // read viewModel.phone.get()
                        viewModelPhoneGet = viewModelPhone.get();
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.photo
                        viewModelPhoto = viewModel.photo;
                    }
                    updateRegistration(2, viewModelPhoto);


                    if (viewModelPhoto != null) {
                        // read viewModel.photo.get()
                        viewModelPhotoGet = viewModelPhoto.get();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.name
                        viewModelName = viewModel.name;
                    }
                    updateRegistration(3, viewModelName);


                    if (viewModelName != null) {
                        // read viewModel.name.get()
                        viewModelNameGet = viewModelName.get();
                    }
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.nickName
                        viewModelNickName = viewModel.nickName;
                    }
                    updateRegistration(4, viewModelNickName);


                    if (viewModelNickName != null) {
                        // read viewModel.nickName.get()
                        viewModelNickNameGet = viewModelNickName.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            this.addPhotoCircle.setOnClickListener(viewModelAddPhoto);
            this.imageViewBack.setOnClickListener(viewModelGoBack);
            this.imageViewSave.setOnClickListener(viewModelSave);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            alex.mrrok.presentation.screens.user.view.PiccaloLoadImage.loadImage(this.addPhotoCircle, viewModelPhotoGet);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editText, viewModelNameGet);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editText, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editText2, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editText2androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editText3, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editText3androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editText4, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editText4androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editText2, viewModelNickNameGet);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editText3, viewModelPhoneGet);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editText4, viewModelUserInfoGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.userInfo
        flag 1 (0x2L): viewModel.phone
        flag 2 (0x3L): viewModel.photo
        flag 3 (0x4L): viewModel.name
        flag 4 (0x5L): viewModel.nickName
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}