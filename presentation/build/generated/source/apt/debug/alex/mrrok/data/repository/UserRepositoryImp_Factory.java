// Generated by Dagger (https://google.github.io/dagger).
package alex.mrrok.data.repository;

import alex.mrrok.data.database.UserInfoDataBase;
import alex.mrrok.data.net.userinfoapi.RestServiceUserInfo;
import alex.mrrok.data.net.usernewsapi.RestServiceUserNews;
import alex.mrrok.data.net.userregistrationapi.RestServiceRegistration;
import alex.mrrok.data.net.usetgeolocationapi.RestServiceGeolocation;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class UserRepositoryImp_Factory implements Factory<UserRepositoryImp> {
  private final Provider<RestServiceRegistration> restServiceRegistrationProvider;

  private final Provider<RestServiceUserInfo> restServiceUserInfoProvider;

  private final Provider<RestServiceGeolocation> geolocationProvider;

  private final Provider<UserInfoDataBase> dataBaseProvider;

  private final Provider<RestServiceUserNews> userNewsApiProvider;

  public UserRepositoryImp_Factory(
      Provider<RestServiceRegistration> restServiceRegistrationProvider,
      Provider<RestServiceUserInfo> restServiceUserInfoProvider,
      Provider<RestServiceGeolocation> geolocationProvider,
      Provider<UserInfoDataBase> dataBaseProvider,
      Provider<RestServiceUserNews> userNewsApiProvider) {
    this.restServiceRegistrationProvider = restServiceRegistrationProvider;
    this.restServiceUserInfoProvider = restServiceUserInfoProvider;
    this.geolocationProvider = geolocationProvider;
    this.dataBaseProvider = dataBaseProvider;
    this.userNewsApiProvider = userNewsApiProvider;
  }

  @Override
  public UserRepositoryImp get() {
    return provideInstance(
        restServiceRegistrationProvider,
        restServiceUserInfoProvider,
        geolocationProvider,
        dataBaseProvider,
        userNewsApiProvider);
  }

  public static UserRepositoryImp provideInstance(
      Provider<RestServiceRegistration> restServiceRegistrationProvider,
      Provider<RestServiceUserInfo> restServiceUserInfoProvider,
      Provider<RestServiceGeolocation> geolocationProvider,
      Provider<UserInfoDataBase> dataBaseProvider,
      Provider<RestServiceUserNews> userNewsApiProvider) {
    return new UserRepositoryImp(
        restServiceRegistrationProvider.get(),
        restServiceUserInfoProvider.get(),
        geolocationProvider.get(),
        dataBaseProvider.get(),
        userNewsApiProvider.get());
  }

  public static UserRepositoryImp_Factory create(
      Provider<RestServiceRegistration> restServiceRegistrationProvider,
      Provider<RestServiceUserInfo> restServiceUserInfoProvider,
      Provider<RestServiceGeolocation> geolocationProvider,
      Provider<UserInfoDataBase> dataBaseProvider,
      Provider<RestServiceUserNews> userNewsApiProvider) {
    return new UserRepositoryImp_Factory(
        restServiceRegistrationProvider,
        restServiceUserInfoProvider,
        geolocationProvider,
        dataBaseProvider,
        userNewsApiProvider);
  }

  public static UserRepositoryImp newUserRepositoryImp(
      RestServiceRegistration restServiceRegistration,
      RestServiceUserInfo restServiceUserInfo,
      RestServiceGeolocation geolocation,
      UserInfoDataBase dataBase,
      RestServiceUserNews userNewsApi) {
    return new UserRepositoryImp(
        restServiceRegistration, restServiceUserInfo, geolocation, dataBase, userNewsApi);
  }
}
