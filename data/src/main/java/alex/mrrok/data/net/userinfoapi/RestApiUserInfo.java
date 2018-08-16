package alex.mrrok.data.net.userinfoapi;

import java.util.List;

import alex.mrrok.data.entity.UserInfo;
import io.reactivex.Completable;
import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RestApiUserInfo {

    @POST("data/UserInfo")
    Completable createUserInfo(@Body UserInfo user);

    @GET("data/UserInfo")
    Observable<List<UserInfo>> userPage(@Query(value = "where", encoded = true) String userSurname);

    @GET("data/UserInfo")
    Observable<List<UserInfo>> getAll();

    @PUT("data/UserInfo/{id}")
    Completable setUserInfo(@Body UserInfo userInfo, @Path("id") String id);

    @GET("data/UserInfo")
    Observable<List<UserInfo>> searchUser(@Query(value = "where", encoded = true) String findname);


}
