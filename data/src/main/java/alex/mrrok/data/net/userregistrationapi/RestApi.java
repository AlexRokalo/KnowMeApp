package alex.mrrok.data.net.userregistrationapi;

import java.util.List;

import alex.mrrok.data.entity.UserRegistration;
import io.reactivex.Completable;
import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RestApi {

    @POST("data/LoginUser")
    Completable registerUser(@Body UserRegistration userRegistration);

    @GET("data/LoginUser")
    Observable<List<UserRegistration>> loginUser(@Query(value = "where", encoded = true) String email);

}