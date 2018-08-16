package alex.mrrok.knowmeapp.databinding;
import alex.mrrok.knowmeapp.R;
import alex.mrrok.knowmeapp.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemNewsBindingImpl extends ItemNewsBinding  {

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
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemNewsBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemNewsBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[1]
            );
        this.imageView11.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
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
            setViewModel((alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserpage.UserNewsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserpage.UserNewsViewModel ViewModel) {
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
                return onChangeViewModelTitle((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelPhoto((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelTitle(android.databinding.ObservableField<java.lang.String> ViewModelTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPhoto(android.databinding.ObservableField<java.lang.String> ViewModelPhoto, int fieldId) {
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
        android.databinding.ObservableField<java.lang.String> viewModelTitle = null;
        java.lang.String viewModelTitleGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelPhoto = null;
        java.lang.String viewModelPhotoGet = null;
        alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserpage.UserNewsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.title
                        viewModelTitle = viewModel.title;
                    }
                    updateRegistration(0, viewModelTitle);


                    if (viewModelTitle != null) {
                        // read viewModel.title.get()
                        viewModelTitleGet = viewModelTitle.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.photo
                        viewModelPhoto = viewModel.photo;
                    }
                    updateRegistration(1, viewModelPhoto);


                    if (viewModelPhoto != null) {
                        // read viewModel.photo.get()
                        viewModelPhotoGet = viewModelPhoto.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            alex.mrrok.presentation.screens.user.view.PiccaloLoadImage.loadImage(this.imageView11, viewModelPhotoGet);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelTitleGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.title
        flag 1 (0x2L): viewModel.photo
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}