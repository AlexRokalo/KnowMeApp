package alex.mrrok.presentation.base;

import android.arch.lifecycle.ViewModel;

import io.reactivex.disposables.CompositeDisposable;

public abstract class BaseViewModel<R extends BaseRouter> extends ViewModel {

    protected R router;
    private CompositeDisposable compositeDisposable;

    protected abstract void runInject();

    public BaseViewModel() {
        runInject();
    }

    public void removeRouter() {
        router = null;
    }

    public void addRouter(R router) {
        this.router = router;
    }

    public CompositeDisposable getCompositeDisposable() {
        if (compositeDisposable == null) {
            compositeDisposable = new CompositeDisposable();
        }
        return compositeDisposable;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if (compositeDisposable != null &&
                compositeDisposable.isDisposed())
            compositeDisposable.dispose();
    }


    public void onResume() {
    }

    public void onPause() {

    }


}
