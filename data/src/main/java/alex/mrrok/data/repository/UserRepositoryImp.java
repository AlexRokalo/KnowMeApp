package alex.mrrok.data.repository;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import alex.mrrok.data.database.UserInfoDataBase;
import alex.mrrok.data.entity.GeoPoint;
import alex.mrrok.data.entity.UserInfo;
import alex.mrrok.data.entity.UserRegistration;
import alex.mrrok.data.entity.UsersNews;
import alex.mrrok.data.net.usernewsapi.RestServiceUserNews;
import alex.mrrok.data.net.usernewsapi.RestUserNewsApi;
import alex.mrrok.data.net.userregistrationapi.RestServiceRegistration;
import alex.mrrok.data.net.usetgeolocationapi.RestServiceGeolocation;
import alex.mrrok.data.net.userinfoapi.RestServiceUserInfo;
import alex.mrrok.data.phonedata.SaveUserKey;
import alex.mrrok.domain.entity.UserGeoPosition;
import alex.mrrok.domain.entity.UserInformation;
import alex.mrrok.domain.entity.UserNews;
import alex.mrrok.domain.entity.UserRegister;
import alex.mrrok.domain.repositories.UserRepository;
import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

public class UserRepositoryImp implements UserRepository {

    public static final String WRONG_EMAIL = "WRONG EMAIL";

    private RestServiceRegistration restServiceRegistration;
    private RestServiceUserInfo restServiceUserInfo;
    private RestServiceGeolocation geolocation;
    private RestServiceUserNews userNewsApi;
    private UserInfoDataBase dataBase;

    @Inject
    public UserRepositoryImp(RestServiceRegistration restServiceRegistration, RestServiceUserInfo restServiceUserInfo,
                             RestServiceGeolocation geolocation, UserInfoDataBase dataBase, RestServiceUserNews userNewsApi) {
        this.restServiceUserInfo = restServiceUserInfo;
        this.restServiceRegistration = restServiceRegistration;
        this.geolocation = geolocation;
        this.dataBase = dataBase;
        this.userNewsApi = userNewsApi;
    }


    @Override
    public Completable registerUser(UserRegister user) {
        UserRegistration registration = new UserRegistration();
        registration.setEmail(user.getEmail());
        registration.setPassword(user.getPassword());
        return restServiceRegistration.registerUser(registration);
    }

    @Override
    public Observable<UserRegister> loginUser(String email) {
        return restServiceRegistration.loginUser(email)
                .map(new Function<List<UserRegistration>, UserRegister>() {
                    @Override
                    public UserRegister apply(List<UserRegistration> userRegistrations) throws Exception {
                        UserRegister user = new UserRegister();
                        if (userRegistrations.isEmpty()) {
                            user.setEmail(WRONG_EMAIL);
                            return user;
                        } else {
                            user.setEmail(userRegistrations.get(0).getEmail());
                            user.setPassword(userRegistrations.get(0).getPassword());
                            return user;
                        }
                    }
                });
    }

    @Override
    public Observable<UserInformation> userPage(String idSurname) {
        return restServiceUserInfo.userPage(idSurname).map(new Function<List<UserInfo>, UserInformation>() {
            @Override
            public UserInformation apply(List<UserInfo> userInfos) throws Exception {
                UserInformation userInformation = new UserInformation();
                userInformation.setName(userInfos.get(0).getName());
                userInformation.setNickName(userInfos.get(0).getNickname());
                userInformation.setEmail(userInfos.get(0).getEmail());
                userInformation.setIdObject(userInfos.get(0).getIdObject());
                userInformation.setPhone(userInfos.get(0).getPhone());
                userInformation.setPhoto(userInfos.get(0).getPhoto());
                userInformation.setUserInfo(userInfos.get(0).getUserInfo());
                return userInformation;
            }
        });
    }

    @Override
    public Observable<List<UserInformation>> getAll() {
        return restServiceUserInfo.getAll().map(new Function<List<UserInfo>, List<UserInformation>>() {
            @Override
            public List<UserInformation> apply(List<UserInfo> userInfos) throws Exception {
                List<UserInformation> users = new ArrayList<>();
                for (int i = 0; i < userInfos.size(); i++) {
                    if (userInfos.get(i).getEmail().equals(SaveUserKey.getEmail()))
                        continue;
                    ;
                    UserInformation user = new UserInformation();
                    user.setName(userInfos.get(i).getName());
                    user.setNickName(userInfos.get(i).getNickname());
                    user.setEmail(userInfos.get(i).getEmail());
                    user.setPhoto(userInfos.get(i).getPhoto());
                    users.add(user);
                }
                return users;
            }
        });
    }


    @Override
    public Completable createUserInfo(UserInformation userInformation) {
        UserInfo userInfo = new UserInfo();
        userInfo.setName(userInformation.getName());
        userInfo.setNickname(userInformation.getNickName());
        userInfo.setEmail(userInformation.getEmail());

        return restServiceUserInfo.createUserInfo(userInfo);
    }

    @Override
    public Observable<List<UserInformation>> searchUser(String findname) {

        return restServiceUserInfo
                .searchUser(findname)
                .map(new Function<List<UserInfo>, List<UserInformation>>() {
                    @Override
                    public List<UserInformation> apply(List<UserInfo> userInfos) throws Exception {
                        List<UserInformation> userInformations = new ArrayList<>();
                        for (int i = 0; i < userInfos.size(); i++) {
                            if (userInfos.get(i).getEmail().equals(SaveUserKey.getEmail()))
                                continue;
                            ;
                            UserInformation userInformation = new UserInformation();
                            userInformation.setEmail(userInfos.get(i).getEmail());
                            userInformation.setName(userInfos.get(i).getName());
                            userInformation.setNickName(userInfos.get(i).getNickname());
                            userInformation.setPhoto(userInfos.get(i).getPhoto());
                            userInformations.add(userInformation);
                        }

                        return userInformations;
                    }
                });
    }

    @Override
    public Completable setPointToGeo(UserGeoPosition userGeoPosition) {
        GeoPoint geoPoint = new GeoPoint();
        geoPoint.setEmail(userGeoPosition.getEmail());

        return geolocation.setUser(geoPoint);
    }

    @Override
    public Completable setLocationToUser(UserGeoPosition geoPoint, String id) {
        GeoPoint location = new GeoPoint();
        location.setLatitude(geoPoint.getLatitude());
        location.setLongitude(geoPoint.getLongitude());
        location.setOnline(geoPoint.getOnline());
        return geolocation.setPoint(location, id);
    }

    @Override
    public Observable<UserGeoPosition> getIdObject(String email) {
        return geolocation.getIndificator(email).map(new Function<List<GeoPoint>, UserGeoPosition>() {
            @Override
            public UserGeoPosition apply(List<GeoPoint> geoPoints) throws Exception {
                UserGeoPosition userGeoPosition = new UserGeoPosition();
                userGeoPosition.setObjectId(geoPoints.get(0).getIdObject());
                return userGeoPosition;
            }
        });
    }

    @Override
    public Observable<List<UserGeoPosition>> getAllGeo() {
        return geolocation.getAll().map(new Function<List<GeoPoint>, List<UserGeoPosition>>() {
            @Override
            public List<UserGeoPosition> apply(List<GeoPoint> geoPoints) throws Exception {
                List<UserGeoPosition> userGeoPositionList = new ArrayList<>();
                for (int i = 0; i < geoPoints.size(); i++) {
                    if (geoPoints.get(i).getOnline() == 0)
                        continue;
                    if (geoPoints.get(i).getEmail().equals(SaveUserKey.getEmail()))
                        continue;
                    UserGeoPosition userGeoPosition = new UserGeoPosition();
                    userGeoPosition.setLatitude(geoPoints.get(i).getLatitude());
                    userGeoPosition.setLongitude(geoPoints.get(i).getLongitude());
                    userGeoPosition.setEmail(geoPoints.get(i).getEmail());
                    userGeoPositionList.add(userGeoPosition);
                }
                return userGeoPositionList;
            }
        });
    }

    @Override
    public Completable setUserInfo(UserInformation userInformation, String id) {
        UserInfo userInfo = new UserInfo();
        userInfo.setName(userInformation.getName());
        userInfo.setNickname(userInformation.getNickName());
        userInfo.setPhone(userInformation.getPhone());
        userInfo.setPhoto(userInformation.getPhoto());
        userInfo.setUserInfo(userInformation.getUserInfo());
        return restServiceUserInfo.setUserInfo(userInfo, id);
    }

    @Override
    public Completable addToDataBase(UserInformation userInformation) {
        final UserInfo userInfo = new UserInfo();
        userInfo.setName(userInformation.getName());
        userInfo.setNickname(userInformation.getNickName());
        userInfo.setEmail(userInformation.getEmail());

        Completable doa = Completable.create(new CompletableOnSubscribe() {
            @Override
            public void subscribe(CompletableEmitter emitter) throws Exception {
                Log.e("addToDataBase", userInfo.getEmail());
                dataBase.daoContract().insert(userInfo);
                emitter.onComplete();
            }
        });
        return doa;
    }

    @Override
    public Observable<UserInformation> getUserFromDataBase(String email) {
        Flowable<UserInformation> flowable = dataBase
                .daoContract()
                .getUser(email)
                .map(new Function<UserInfo, UserInformation>() {
                    @Override
                    public UserInformation apply(UserInfo userInfo) throws Exception {
                        UserInformation userInformation = new UserInformation();
                        userInformation.setName(userInfo.getName());
                        userInformation.setNickName(userInfo.getNickname());
                        userInformation.setPhoto(userInfo.getPhoto());
                        userInformation.setEmail(userInfo.getEmail());
                        return userInformation;
                    }
                });


        return flowable.toObservable();
    }

    @Override
    public Completable updateDataBase(UserInformation userInformation) {
        final UserInfo userInfo = new UserInfo();
        userInfo.setEmail(userInformation.getEmail());
        userInfo.setName(userInformation.getName());
        userInfo.setNickname(userInformation.getNickName());
        userInfo.setPhone(userInformation.getPhone());
        userInfo.setPhoto(userInformation.getPhoto());
        userInfo.setUserInfo(userInformation.getUserInfo());
        Completable dao = Completable.create(new CompletableOnSubscribe() {
            @Override
            public void subscribe(CompletableEmitter emitter) throws Exception {
                Log.e("addToDataBase", userInfo.getEmail());
                dataBase.daoContract().update(userInfo);
                emitter.onComplete();
            }
        });

        return dao;
    }

    @Override
    public Observable<List<UserNews>> getNews(String email) {
        return userNewsApi
                .getAllNews(email)
                .map(new Function<List<UsersNews>, List<UserNews>>() {
                    @Override
                    public List<UserNews> apply(List<UsersNews> usersNews) throws Exception {
                        List<UserNews> userNews = new ArrayList<>();
                        for (int i = 0; i < usersNews.size(); i++) {
                            UserNews news = new UserNews();
                            news.setPhoto(usersNews.get(i).getPhoto());
                            news.setComents(usersNews.get(i).getComents());
                            news.setTitle(usersNews.get(i).getTitle());

                            userNews.add(news);
                        }

                        return userNews;
                    }
                });
    }

    @Override
    public Completable loadNews(UserNews userNews) {
        UsersNews usersNews = new UsersNews();
        usersNews.setEmail(SaveUserKey.getEmail());
        usersNews.setPhoto(userNews.getPhoto());
        usersNews.setComents(userNews.getComents());
        usersNews.setTitle(userNews.getTitle());

        return userNewsApi.loadNews(usersNews);
    }


}