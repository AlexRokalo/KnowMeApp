package alex.mrrok.presentation.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;

import alex.mrrok.knowmeapp.BR;


public abstract class BaseMvvmActivity<VM extends BaseViewModel,
        B extends ViewDataBinding, R extends BaseRouter> extends BaseActivity {

    protected VM viewModel;
    protected B binding;
    private R router;

    protected abstract VM provideViewModel();

    protected abstract int provideLayoutID();

    protected abstract R provideRouter();

    public R getRouter() {
        return router;
    }


    @Override
    protected void onStart() {
        super.onStart();
        router = provideRouter();
        viewModel.addRouter(router);
    }

    @Override
    protected void onStop() {
        super.onStop();
        viewModel.removeRouter();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        viewModel = provideViewModel();
        binding = DataBindingUtil.setContentView(this, provideLayoutID());
        binding.setVariable(BR.viewModel, viewModel);

    }

}
