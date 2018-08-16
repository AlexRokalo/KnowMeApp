package alex.mrrok.domain.repositories;

import java.util.List;

import alex.mrrok.domain.entity.UserGeoPosition;
import alex.mrrok.domain.entity.UserInformation;
import alex.mrrok.domain.entity.UserNews;
import alex.mrrok.domain.entity.UserRegister;
import io.reactivex.Completable;
import io.reactivex.Observable;

public interface UserRepository {

    Completable registerUser(UserRegister user);

    Observable<UserRegister> loginUser(String email);

    Observable<UserInformation> userPage(String idSurname);

    Observable<List<UserInformation>> getAll();

    Completable createUserInfo(UserInformation userInformation);

    Observable<List<UserInformation>> searchUser(String findname);

    Completable setPointToGeo(UserGeoPosition userGeoPosition);

    Completable setLocationToUser(UserGeoPosition geoPoint, String id);

    Observable<UserGeoPosition> getIdObject(String email);

    Observable<List<UserGeoPosition>> getAllGeo();

    Completable setUserInfo(UserInformation userInformation, String id);

    Completable addToDataBase(UserInformation userInformation);

    Observable<UserInformation> getUserFromDataBase(String email);

    Completable updateDataBase(UserInformation userInformation);

    Observable<List<UserNews>> getNews(String email);

    Completable loadNews(UserNews userNews);
}
