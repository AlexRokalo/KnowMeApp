package alex.mrrok.presentation.screens.user.list.addnews;

import android.content.Intent;
import android.databinding.ObservableField;
import android.util.Log;
import android.view.View;

import javax.inject.Inject;

import alex.mrrok.app.App;
import alex.mrrok.domain.entity.UserNews;
import alex.mrrok.domain.usecases.LoadNewsUseCase;
import alex.mrrok.presentation.base.BaseViewModel;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;

public class AddNewsViewModel extends BaseViewModel<AddNewsRouter> {

    protected final static int REQUEST_FOTO = 10;

    @Inject
    public LoadNewsUseCase loadNewsUseCase;

    public ObservableField<String> photo = new ObservableField<>();
    public ObservableField<String> title = new ObservableField<>();

    @Override
    protected void runInject() {
        App.getAppComponent().inject(this);
    }

    public View.OnClickListener addPhoto = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Intent.ACTION_PICK);
            intent.setType("image/*");
            router.getActivity().startActivityForResult(intent, REQUEST_FOTO);
        }
    };

    public AddNewsViewModel() {

    }

    public View.OnClickListener addNews = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            loadNewsUseCase
                    .loadNews(createUserNews())
                    .subscribe(new CompletableObserver() {
                        @Override
                        public void onSubscribe(Disposable d) {
                            getCompositeDisposable().add(d);
                        }

                        @Override
                        public void onComplete() {
                            router.startMainPageActivity();
                            router.finish();
                            Log.e("onComplete", "work");
                        }

                        @Override
                        public void onError(Throwable e) {
                            Log.e("onError", e.toString());

                        }
                    });
        }
    };

    private UserNews createUserNews() {
        UserNews userNews = new UserNews();
        userNews.setTitle(title.get());
        userNews.setPhoto(photo.get());

        return userNews;
    }
}
