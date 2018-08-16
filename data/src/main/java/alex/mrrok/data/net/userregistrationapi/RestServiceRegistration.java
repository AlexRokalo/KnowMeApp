package alex.mrrok.data.net.userregistrationapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import alex.mrrok.data.BuildConfig;
import alex.mrrok.data.entity.UserRegistration;
import alex.mrrok.data.net.HttpConection;
import alex.mrrok.data.net.userregistrationapi.RestApi;
import io.reactivex.Completable;
import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestServiceRegistration implements RestApi {

    private RestApi restApi;
    private Gson gson;
    private HttpConection httpConection;

    @Inject
    public RestServiceRegistration() {
        httpConection = new HttpConection();
        httpConection.setOkHttp();

        gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        this.restApi = new Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl("https://api.backendless.com" +
                        "/5B4247FF-EC12-2AE1-FF4D-959409B77A00" +
                        "/BA4A29D5-DBC7-4F6A-FF7A-DFB1DBE86600/")
                .client(httpConection.getOkHttp())
                .build()
                .create(RestApi.class);
    }

    @Override
    public Completable registerUser(UserRegistration userRegistration) {
        return restApi.registerUser(userRegistration);
    }

    @Override
    public Observable<List<UserRegistration>>loginUser(String email) {
        return restApi.loginUser(email);
    }


}
