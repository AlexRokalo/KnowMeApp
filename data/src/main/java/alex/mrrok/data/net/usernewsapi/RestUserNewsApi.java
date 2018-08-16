package alex.mrrok.data.net.usernewsapi;

import java.util.List;

import alex.mrrok.data.entity.UsersNews;
import io.reactivex.Completable;
import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RestUserNewsApi {

    @GET("data/UsersNews")
    Observable<List<UsersNews>> getAllNews(@Query(value = "where", encoded = true) String email);

    @POST("data/UsersNews")
    Completable loadNews(@Body UsersNews usersNews);
}
