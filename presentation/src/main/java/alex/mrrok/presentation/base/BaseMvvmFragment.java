package alex.mrrok.presentation.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import alex.mrrok.knowmeapp.BR;


public abstract class BaseMvvmFragment<
        VM extends BaseViewModel,
        B extends ViewDataBinding,
        R >
        extends BaseFragment {

    protected VM viewModel;
    protected B binding;
    protected R router;

    /**
     * Use ViewModelProviders.of(this).get(ViewModel.class);
     */
    protected abstract VM provideViewModel();

    protected abstract int provideLayoutId();

    protected abstract R provideRouter();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        viewModel = provideViewModel();

        binding = DataBindingUtil.inflate(inflater,
                provideLayoutId(), container, false);
        binding.setVariable( BR.viewModel, viewModel);

        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        router = provideRouter();
    }

    @Override
    public void onStart() {
        super.onStart();
        viewModel.addRouter((BaseRouter) router);
    }

    @Override
    public void onStop() {
        super.onStop();
        viewModel.removeRouter();
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        viewModel.onPause();
    }
}
