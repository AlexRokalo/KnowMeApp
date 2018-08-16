package alex.mrrok.presentation.screens.user.list.userpage;

import android.annotation.SuppressLint;
import android.databinding.ObservableField;
import android.util.Log;

import javax.inject.Inject;

import alex.mrrok.app.App;
import alex.mrrok.domain.entity.UserInformation;
import alex.mrrok.domain.usecases.UserPageUseCase;
import alex.mrrok.presentation.base.BaseViewModel;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;

public class UserPageViewModel extends BaseViewModel<UserPageRouter> {

    @Inject
    public UserPageUseCase userPageUseCase;

    public ObservableField<String> name = new ObservableField<>();
    public ObservableField<String> nickName = new ObservableField<>();
    public ObservableField<String> photo = new ObservableField<>();
    public PublishSubject<String> userId = PublishSubject.create();

    @Override
    protected void runInject() {
        App.getAppComponent().inject(this);
    }

    private String validateEmail(String email) {
        email.replace("@", "%40");
        String result = "email%3D'" + email + "'";
        return result;
    }


    public UserPageViewModel() {
        userId.subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(String s) {
                userPageUseCase.load(validateEmail(s)).subscribe(new Observer<UserInformation>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(UserInformation user) {
                        name.set(user.getName());
                        nickName.set(user.getNickName());
                        photo.set(user.getPhoto());
                    }

                    @SuppressLint("LongLogTag")
                    @Override
                    public void onError(Throwable e) {
                        Log.e("onErrorUserPageViewModel", e.toString());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });

    }
}
