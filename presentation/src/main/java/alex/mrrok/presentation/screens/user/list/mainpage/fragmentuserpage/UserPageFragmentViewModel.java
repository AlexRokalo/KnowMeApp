package alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserpage;


import android.content.SharedPreferences;
import android.databinding.ObservableField;
import android.util.Log;
import android.view.View;

import java.util.List;

import javax.inject.Inject;

import alex.mrrok.app.App;
import alex.mrrok.data.phonedata.SaveUserKey;
import alex.mrrok.domain.entity.UserInformation;
import alex.mrrok.domain.entity.UserNews;
import alex.mrrok.domain.usecases.DataBaseInfoUserCase;
import alex.mrrok.domain.usecases.GetUserNewsUseCase;
import alex.mrrok.domain.usecases.UserPageUseCase;
import alex.mrrok.presentation.base.BaseViewModel;
import alex.mrrok.presentation.base.recycler.UserNewsAdapter;
import alex.mrrok.presentation.screens.user.list.mainpage.MainPageRouter;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;

public class UserPageFragmentViewModel extends BaseViewModel<MainPageRouter> {

    @Inject
    public UserPageUseCase userPageUseCase;
    @Inject
    public DataBaseInfoUserCase dataBaseInfoUserCase;
    @Inject
    public GetUserNewsUseCase userNewsUseCase;

    public UserNewsAdapter adapter = new UserNewsAdapter();

    public ObservableField<String> name = new ObservableField<>("");
    public ObservableField<String> nickName = new ObservableField<>("");
    public ObservableField<String> photo = new ObservableField<>();

    public PublishSubject<String> id = PublishSubject.create();

    @Override
    protected void runInject() {
        App.getAppComponent().inject(this);
    }

    public View.OnClickListener addNews = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            router.startAddNewsActivity();
        }
    };

    private String validateEmail(String email) {
        return "email%3D'" + email.replace("@", "%40") + "'";
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
                        getCompositeDisposable().add(d);
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

                userNewsUseCase
                        .getNews(validateEmail(SaveUserKey.getEmail()))
                        .subscribe(new Observer<List<UserNews>>() {
                            @Override
                            public void onSubscribe(Disposable d) {

                            }

                            @Override
                            public void onNext(List<UserNews> userNews) {
                                Log.e("onNextNEWS","WORK");
                                adapter.addItems(userNews);
                            }

                            @Override
                            public void onError(Throwable e) {
                                Log.e("onError",e.toString());
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
