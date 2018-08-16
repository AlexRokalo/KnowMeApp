package alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserlist;

import android.annotation.SuppressLint;
import android.util.Log;

import java.util.List;

import javax.inject.Inject;

import alex.mrrok.app.App;
import alex.mrrok.domain.entity.UserInformation;
import alex.mrrok.domain.usecases.SearchUseCase;
import alex.mrrok.domain.usecases.UserListUseCase;
import alex.mrrok.presentation.base.BaseViewModel;
import alex.mrrok.presentation.base.recycler.ClickedItemModel;
import alex.mrrok.presentation.base.recycler.UserListAdapter;
import alex.mrrok.presentation.screens.user.list.mainpage.MainPageRouter;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class UserListFragmentViewModel extends BaseViewModel<MainPageRouter> {
    @Inject
    public UserListUseCase userListUseCase;
    @Inject
    public SearchUseCase searchUseCase;

    public UserListAdapter adapter = new UserListAdapter();

    @Override
    protected void runInject() {
        App.getAppComponent().inject(this);
    }

    @SuppressLint("LongLogTag")
    public UserListFragmentViewModel() {
        Log.e("UserListFragmentViewModel", "WORK");

        userListUseCase.getAll()
                .subscribe(new Observer<List<UserInformation>>() {
            @Override
            public void onSubscribe(Disposable d) {
                getCompositeDisposable().add(d);
            }

            @Override
            public void onNext(List<UserInformation> users) {
                adapter.clear();
                adapter.addItems(users);
            }

            @Override
            public void onError(Throwable e)
            {
                router.showError(e);
                Log.e("userListUseCase",e.toString());
            }

            @Override
            public void onComplete() {

            }
        });

        adapter
                .observeItemClick()
                .subscribe(new Observer<ClickedItemModel>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        getCompositeDisposable().add(d);
                    }

                    @Override
                    public void onNext(ClickedItemModel clickedItemModel) {
                        UserInformation user = (UserInformation) clickedItemModel.getEntity();
                        router.startUserPageActivity(user.getEmail());
                    }


                    @Override
                    public void onError(Throwable e) {
                        router.showError(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }

    public void searchUser(String query){
        Log.e("searchUser",query);
        String addres = "name%20LIKE%20%27" + query + "%25%27";
        searchUseCase
                .search(addres)
                .subscribe(new Observer<List<UserInformation>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(List<UserInformation> userInformations) {
                        Log.e("onNext","worl");
                        adapter.clear();
                        adapter.addItems(userInformations);
                    }

                    @Override
                    public void onError(Throwable e) {
                        router.showError(e);
                        Log.e("onError",e.toString());
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }


}
