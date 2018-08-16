package alex.mrrok.data.net.usernewsapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import javax.inject.Inject;

import alex.mrrok.data.entity.UsersNews;
import alex.mrrok.data.net.HttpConection;
import io.reactivex.Completable;
import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestServiceUserNews implements RestUserNewsApi {

    private RestUserNewsApi restApi;
    private Gson gson;
    private HttpConection httpConection;


    @Inject
    public RestServiceUserNews() {
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
                .create(RestUserNewsApi.class);
    }

    @Override
    public Observable<List<UsersNews>> getAllNews(String email) {
        return restApi.getAllNews(email);
    }

    @Override
    public Completable loadNews(UsersNews usersNews) {
        return restApi.loadNews(usersNews);
    }
}
