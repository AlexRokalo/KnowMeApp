package alex.mrrok.presentation.base;

import android.support.v4.app.Fragment;

import io.reactivex.disposables.CompositeDisposable;

public abstract class BaseFragment extends Fragment {

    private CompositeDisposable compositeDisposable;

    public CompositeDisposable getCompositeDisposable() {
        if(compositeDisposable == null) {
            compositeDisposable = new CompositeDisposable();
        }

        return compositeDisposable;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if(compositeDisposable != null) {
            compositeDisposable.clear();
        }
    }
}
