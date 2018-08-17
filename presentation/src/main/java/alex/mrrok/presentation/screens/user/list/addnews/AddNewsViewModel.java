package alex.mrrok.presentation.screens.user.list.addnews;

import android.app.ProgressDialog;
import android.content.Intent;
import android.databinding.ObservableField;
import android.util.Log;
import android.view.View;

import javax.inject.Inject;

import alex.mrrok.app.App;
import alex.mrrok.domain.entity.UserNews;
import alex.mrrok.domain.usecases.LoadNewsUseCase;
import alex.mrrok.knowmeapp.R;
import alex.mrrok.presentation.base.BaseViewModel;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;

import static alex.mrrok.presentation.screens.user.list.mainpage.MainPageActivity.DELAY_MILLIS;

public class AddNewsViewModel extends BaseViewModel<AddNewsRouter> {

    protected final static int REQUEST_PHOTO = 10;

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
            router.getActivity().startActivityForResult(intent, REQUEST_PHOTO);
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
                            startMainPageActivity();
                            Log.e("onComplete", "work");
                        }

                        @Override
                        public void onError(Throwable e) {
                            Log.e("onError", e.toString());

                        }
                    });
        }
    };


    public void startMainPageActivity() {
        final ProgressDialog progressDialog = new ProgressDialog(router.getActivity(),
                R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Adding...");
        progressDialog.show();

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        router.startMainPageActivity();
                        router.finish();
                        progressDialog.dismiss();
                    }
                }, DELAY_MILLIS);
    }

    private UserNews createUserNews() {
        UserNews userNews = new UserNews();
        userNews.setTitle(title.get());
        userNews.setPhoto(photo.get());

        return userNews;
    }
}
