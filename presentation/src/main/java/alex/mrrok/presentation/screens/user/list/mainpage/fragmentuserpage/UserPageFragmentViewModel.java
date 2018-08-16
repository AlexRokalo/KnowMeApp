package alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserpage;


import android.content.SharedPreferences;
import android.databinding.ObservableField;
import android.util.Log;
import android.view.View;

import javax.inject.Inject;

import alex.mrrok.app.App;
import alex.mrrok.data.phonedata.SaveUserKey;
import alex.mrrok.domain.entity.UserInformation;
import alex.mrrok.domain.usecases.DataBaseInfoUserCase;
import alex.mrrok.domain.usecases.UserPageUseCase;
import alex.mrrok.presentation.base.BaseViewModel;
import alex.mrrok.presentation.screens.user.list.mainpage.MainPageRouter;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;

public class UserPageFragmentViewModel extends BaseViewModel<MainPageRouter> {

    @Inject
    public UserPageUseCase userPageUseCase;
    @Inject
    public DataBaseInfoUserCase dataBaseInfoUserCase;

    public ObservableField<String> name = new ObservableField<>("");
    public ObservableField<String> nickName = new ObservableField<>("");
    public ObservableField<String> photo = new ObservableField<>();

    public PublishSubject<String> id = PublishSubject.create();

    @Override
    protected void runInject() {
        App.getAppComponent().inject(this);
    }

    private String validateEmail(String email) {
        email.replace("@", "%40");
        String result = "email%3D'" + email + "'";
        return result;
    }


    public UserPageFragmentViewModel() {
        id.subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(String s) {
                dataBaseInfoUserCase.load(SaveUserKey.getEmail()).subscribe(new Observer<UserInformation>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(UserInformation userInformation) {
                        name.set(userInformation.getName());
                        nickName.set(userInformation.getNickName());
                        photo.set(userInformation.getPhoto());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });


            }

            @Override
            public void onError(Throwable e) {
                Log.e("onError2", e.toString());
            }

            @Override
            public void onComplete() {

            }
        });

    }

    public View.OnClickListener setting = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            router.startSettingUserActivity();
            router.finish();
        }
    };


}
