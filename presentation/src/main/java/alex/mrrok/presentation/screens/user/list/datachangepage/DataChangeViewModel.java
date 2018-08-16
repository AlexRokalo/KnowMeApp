package alex.mrrok.presentation.screens.user.list.datachangepage;

import android.content.Intent;
import android.databinding.ObservableField;
import android.util.Log;
import android.view.View;

import com.squareup.picasso.Picasso;

import javax.inject.Inject;

import alex.mrrok.app.App;
import alex.mrrok.data.phonedata.SaveUserKey;
import alex.mrrok.domain.entity.UserInformation;
import alex.mrrok.domain.usecases.UpdataDataUseCase;
import alex.mrrok.domain.usecases.UserInfoUseCase;
import alex.mrrok.domain.usecases.UserPageUseCase;
import alex.mrrok.presentation.base.BaseViewModel;
import alex.mrrok.presentation.screens.user.edit.CreateUserTransaction;
import io.reactivex.CompletableObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;

public class DataChangeViewModel extends BaseViewModel<DataChangeRouter> {

    @Inject
    public UserPageUseCase userPageUseCase;
    @Inject
    public UserInfoUseCase userInfoUseCase;
    @Inject
    public UpdataDataUseCase updataDataUseCase;


    public ObservableField<String> name = new ObservableField<>();
    public ObservableField<String> nickName = new ObservableField<>();
    public ObservableField<String> phone = new ObservableField<>();
    public ObservableField<String> userInfo = new ObservableField<>();
    public ObservableField<String> photo = new ObservableField<>();
    public ObservableField<String> idObject = new ObservableField<>();

    public PublishSubject<String> userEmail = PublishSubject.create();

    @Override
    protected void runInject() {
        App.getAppComponent().inject(this);
    }

    public View.OnClickListener addPhoto = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Intent.ACTION_PICK);
            intent.setType("image/*");
            router.getActivity().startActivityForResult(intent, 1);
        }
    };


    public DataChangeViewModel() {

        userEmail.subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                getCompositeDisposable().add(d);
            }

            @Override
            public void onNext(String s) {
                userPageUseCase.load(validateEmail(s)).subscribe(new Observer<UserInformation>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        getCompositeDisposable().add(d);
                    }

                    @Override
                    public void onNext(UserInformation userInformation) {
                        name.set(userInformation.getName());
                        nickName.set(userInformation.getNickName());
                        phone.set(userInformation.getPhone());
                        photo.set(userInformation.getPhoto());
                        userInfo.set(userInformation.getUserInfo());
                        idObject.set(userInformation.getIdObject());
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

            }

            @Override
            public void onComplete() {

            }
        });

    }

    private String validateEmail(String email) {
        return "email%3D'" + email.replace("@", "%40") + "'";
    }

    public View.OnClickListener goBack = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            router.startSettingUserActivity();
            router.finish();
        }
    };

    public String getEmail() {
        return SaveUserKey.getEmail();
    }

    public View.OnClickListener save = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            updataDataUseCase.update(setInfo())
                    .subscribe(new CompletableObserver() {
                        @Override
                        public void onSubscribe(Disposable d) {

                        }

                        @Override
                        public void onComplete() {

                        }

                        @Override
                        public void onError(Throwable e) {

                        }
                    });

            userInfoUseCase.setUserInfo(setInfo(), idObject.get())
                    .subscribe(new CompletableObserver() {
                @Override
                public void onSubscribe(Disposable d) {

                }

                @Override
                public void onComplete() {

                }

                @Override
                public void onError(Throwable e) {

                }
            });

            router.startSettingUserActivity();
            router.finish();
        }
    };

    public void goBackPrecc(){
        router.goBack();
    }

    private UserInformation setInfo() {
        return new CreateUserTransaction()
                .setInfo(name.get(), nickName.get(), phone.get(), photo.get()
                        , userInfo.get(), getEmail());
    }
}
