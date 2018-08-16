package alex.mrrok.data.net.userinfoapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.SocketTimeoutException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import alex.mrrok.data.BuildConfig;
import alex.mrrok.data.entity.HttpError;
import alex.mrrok.data.entity.UserInfo;
import alex.mrrok.data.net.HttpConection;
import alex.mrrok.data.net.userinfoapi.RestApiUserInfo;
import alex.mrrok.domain.entity.ErrorNet;
import alex.mrrok.domain.entity.ErrorType;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.HttpException;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestServiceUserInfo implements RestApiUserInfo {

    private RestApiUserInfo restApi;
    private Gson gson;
    private HttpConection httpConection;

    @Inject
    public RestServiceUserInfo() {

        httpConection = new HttpConection();
        httpConection.setOkHttp();

        gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        this.restApi = new Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl("https://api.backendless.com/5B4247FF-EC12-2AE1-FF4D-959409B77A00/" +
                        "BA4A29D5-DBC7-4F6A-FF7A-DFB1DBE86600/")
                .client(httpConection.getOkHttp())
                .build()
                .create(RestApiUserInfo.class);
    }

    @Override
    public Completable createUserInfo(UserInfo user) {
        return restApi.createUserInfo(user);
    }

    @Override
    public Observable<List<UserInfo>> userPage(String userSurname) {
        return restApi.userPage(userSurname);
    }

    @Override
    public Observable<List<UserInfo>> getAll() {
        return restApi
                .getAll()
                .onErrorResumeNext(new Function<Throwable, ObservableSource<? extends List<UserInfo>>>() {
                    @Override
                    public ObservableSource<? extends List<UserInfo>> apply(Throwable throwable) throws Exception {
                        ErrorNet error;
                        if (throwable instanceof HttpException) {
                            HttpException httpException = (HttpException) throwable;
                            String errorBody = httpException.response().errorBody().string();
                            HttpError httpError = gson.fromJson(errorBody, HttpError.class);

                            error = new ErrorNet(httpError.getMessage(), ErrorType.SERVER_ERROR);
                        } else if (throwable instanceof SocketTimeoutException) {
                            error = new ErrorNet("Ineternet is not avaible"
                                    , ErrorType.INTERNET_IS_NOT_AVAUIABLE);
                        } else {
                            error = new ErrorNet("Unexpected error"
                                    , ErrorType.SERVER_ERROR);
                        }
                        return Observable.error(error);
                    }
                });
    }

    @Override
    public Completable setUserInfo(UserInfo userInfo, String id) {
        return restApi.setUserInfo(userInfo, id);
    }

    @Override
    public Observable<List<UserInfo>> searchUser(String findname) {
        return restApi.searchUser(findname);
    }


}
