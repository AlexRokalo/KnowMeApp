package alex.mrrok.data.net.usetgeolocationapi;


import java.util.List;

import alex.mrrok.data.entity.GeoPoint;
import alex.mrrok.data.entity.UserInfo;
import io.reactivex.Completable;
import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RestApiGeolocation {

    @POST("data/Geogr")
    Completable setUser(@Body GeoPoint geoPoint);

    @PUT("data/Geogr/{id}")
    Completable setPoint(@Body GeoPoint geoPoint, @Path("id") String id);

    @GET("data/Geogr")
    Observable<List<GeoPoint>> getIndificator(@Query(value = "where", encoded = true) String email);

    @GET("data/Geogr")
    Observable<List<GeoPoint>> getAll();

}
