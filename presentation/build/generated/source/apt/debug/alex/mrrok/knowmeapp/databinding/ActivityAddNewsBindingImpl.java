package alex.mrrok.knowmeapp.databinding;
import alex.mrrok.knowmeapp.R;
import alex.mrrok.knowmeapp.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAddNewsBindingImpl extends ActivityAddNewsBinding  {

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
    private final android.widget.Button mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener userNewsTextandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.title.get()
            //         is viewModel.title.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(userNewsText);
            // localize variables for thread safety
            // viewModel.title.get()
            java.lang.String viewModelTitleGet = null;
            // viewModel
            alex.mrrok.presentation.screens.user.list.addnews.AddNewsViewModel viewModel = mViewModel;
            // viewModel.title
            android.databinding.ObservableField<java.lang.String> viewModelTitle = null;
            // viewModel.title != null
            boolean viewModelTitleJavaLangObjectNull = false;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelTitle = viewModel.title;

                viewModelTitleJavaLangObjectNull = (viewModelTitle) != (null);
                if (viewModelTitleJavaLangObjectNull) {




                    viewModelTitle.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityAddNewsBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityAddNewsBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (android.widget.EditText) bindings[2]
            );
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.Button) bindings[3];
        this.mboundView3.setTag(null);
        this.userNewsPhoto.setTag(null);
        this.userNewsText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setViewModel((alex.mrrok.presentation.screens.user.list.addnews.AddNewsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable alex.mrrok.presentation.screens.user.list.addnews.AddNewsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelTitle((android.databinding.ObservableField<java.lang.String>) object, fieldId);
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

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.databinding.ObservableField<java.lang.String> viewModelTitle = null;
        java.lang.String viewModelTitleGet = null;
        android.view.View.OnClickListener viewModelAddPhoto = null;
        android.view.View.OnClickListener viewModelAddNews = null;
        alex.mrrok.presentation.screens.user.list.addnews.AddNewsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.title
                    viewModelTitle = viewModel.title;
                }
                updateRegistration(0, viewModelTitle);


                if (viewModelTitle != null) {
                    // read viewModel.title.get()
                    viewModelTitleGet = viewModelTitle.get();
                }
            if ((dirtyFlags & 0x6L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.addPhoto
                        viewModelAddPhoto = viewModel.addPhoto;
                        // read viewModel.addNews
                        viewModelAddNews = viewModel.addNews;
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(viewModelAddNews);
            this.userNewsPhoto.setOnClickListener(viewModelAddPhoto);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.userNewsText, viewModelTitleGet);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.userNewsText, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, userNewsTextandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.title
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}