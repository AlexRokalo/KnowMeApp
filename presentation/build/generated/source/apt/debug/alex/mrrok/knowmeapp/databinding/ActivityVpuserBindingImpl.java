package alex.mrrok.knowmeapp.databinding;
import alex.mrrok.knowmeapp.R;
import alex.mrrok.knowmeapp.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityVpuserBindingImpl extends ActivityVpuserBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView9, 6);
        sViewsWithIds.put(R.id.textView5, 7);
        sViewsWithIds.put(R.id.textView8, 8);
        sViewsWithIds.put(R.id.frameLayout2, 9);
        sViewsWithIds.put(R.id.frameLayout, 10);
        sViewsWithIds.put(R.id.recyclerViewNews, 11);
    }
    // views
    @NonNull
    private final android.support.v4.widget.NestedScrollView mboundView0;
    @NonNull
    private final android.widget.Button mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityVpuserBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityVpuserBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (android.widget.Button) bindings[4]
            , (android.widget.FrameLayout) bindings[10]
            , (android.widget.FrameLayout) bindings[9]
            , (android.support.v7.widget.RecyclerView) bindings[11]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[6]
            );
        this.activityVpCircleImage.setTag(null);
        this.button3.setTag(null);
        this.mboundView0 = (android.support.v4.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView5 = (android.widget.Button) bindings[5];
        this.mboundView5.setTag(null);
        this.textView3.setTag(null);
        this.textView4.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewModel((alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserpage.UserPageFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserpage.UserPageFragmentViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelPhoto((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelNickName((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPhoto(android.databinding.ObservableField<java.lang.String> ViewModelPhoto, int fieldId) {
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
    private boolean onChangeViewModelNickName(android.databinding.ObservableField<java.lang.String> ViewModelNickName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        android.view.View.OnClickListener viewModelSetting = null;
        android.databinding.ObservableField<java.lang.String> viewModelPhoto = null;
        android.databinding.ObservableField<java.lang.String> viewModelName = null;
        java.lang.String viewModelNickNameGet = null;
        android.view.View.OnClickListener viewModelAddNews = null;
        java.lang.String viewModelPhotoGet = null;
        java.lang.String viewModelNameGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelNickName = null;
        alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserpage.UserPageFragmentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x18L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.setting
                        viewModelSetting = viewModel.setting;
                        // read viewModel.addNews
                        viewModelAddNews = viewModel.addNews;
                    }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.photo
                        viewModelPhoto = viewModel.photo;
                    }
                    updateRegistration(0, viewModelPhoto);


                    if (viewModelPhoto != null) {
                        // read viewModel.photo.get()
                        viewModelPhotoGet = viewModelPhoto.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

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
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.nickName
                        viewModelNickName = viewModel.nickName;
                    }
                    updateRegistration(2, viewModelNickName);


                    if (viewModelNickName != null) {
                        // read viewModel.nickName.get()
                        viewModelNickNameGet = viewModelNickName.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            alex.mrrok.presentation.screens.user.view.PiccaloLoadImage.loadImage(this.activityVpCircleImage, viewModelPhotoGet);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.button3.setOnClickListener(viewModelSetting);
            this.mboundView5.setOnClickListener(viewModelAddNews);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.textView3, viewModelNameGet);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.textView4, viewModelNickNameGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.photo
        flag 1 (0x2L): viewModel.name
        flag 2 (0x3L): viewModel.nickName
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}