package alex.mrrok.knowmeapp.databinding;
import alex.mrrok.knowmeapp.R;
import alex.mrrok.knowmeapp.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAnotheUserBindingImpl extends ActivityAnotheUserBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView9, 4);
        sViewsWithIds.put(R.id.button3, 5);
        sViewsWithIds.put(R.id.textView5, 6);
        sViewsWithIds.put(R.id.textView8, 7);
        sViewsWithIds.put(R.id.frameLayout2, 8);
        sViewsWithIds.put(R.id.frameLayout, 9);
        sViewsWithIds.put(R.id.recyclerViewUsersNews, 10);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAnotheUserBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityAnotheUserBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.Button) bindings[5]
            , (android.widget.FrameLayout) bindings[9]
            , (android.widget.FrameLayout) bindings[8]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (android.support.v7.widget.RecyclerView) bindings[10]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[4]
            );
        this.imageView2.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
            setViewModel((alex.mrrok.presentation.screens.user.list.userpage.UserPageViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable alex.mrrok.presentation.screens.user.list.userpage.UserPageViewModel ViewModel) {
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
        android.databinding.ObservableField<java.lang.String> viewModelPhoto = null;
        android.databinding.ObservableField<java.lang.String> viewModelName = null;
        java.lang.String viewModelNickNameGet = null;
        java.lang.String viewModelPhotoGet = null;
        java.lang.String viewModelNameGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelNickName = null;
        alex.mrrok.presentation.screens.user.list.userpage.UserPageViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


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

            alex.mrrok.presentation.screens.user.view.PiccaloLoadImage.loadImage(this.imageView2, viewModelPhotoGet);
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