package alex.mrrok.presentation.base;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import alex.mrrok.domain.entity.ErrorNet;
import alex.mrrok.knowmeapp.R;
import alex.mrrok.presentation.screens.user.list.loginpage.LoginPageViewModel;

public class BaseRouter<A extends BaseActivity> {

    private A activity;

    public A getActivity() {
        return activity;
    }

    public void finish() {
        activity.finish();
    }

    public void goBack() {
        activity.onBackPressed();
    }

    public BaseRouter(A activity) {
        this.activity = activity;
    }

    public void showError(Throwable throwable) {
        if (throwable instanceof ErrorNet) {
            ErrorNet error = (ErrorNet) throwable;
            switch (error.getErrorType()) {
                case SERVER_IS_NOT_AVAUIABLE: {
                    showToastError(R.string.server_error);
                    break;
                }
                case INTERNET_IS_NOT_AVAUIABLE: {
                    showToastError(R.string.internten_not_avaible);
                    break;
                }
                default: {
                    // снова не правильная ошибка
                    Log.e(activity.getClass().getSimpleName(), throwable.toString());
                    showToastError(R.string.error);
                    break;
                }
            }

        } else {
            //
            Log.e(activity.getClass().getSimpleName(), throwable.toString());

            showToastError(R.string.error);
        }
    }

    private void showToastError(int messageErrorId) {
        Toast.makeText(activity,messageErrorId, Toast.LENGTH_LONG).show();
    }

}
