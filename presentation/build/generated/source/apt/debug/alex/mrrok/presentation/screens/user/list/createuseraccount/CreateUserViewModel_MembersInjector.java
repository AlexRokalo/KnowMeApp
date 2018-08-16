// Generated by Dagger (https://google.github.io/dagger).
package alex.mrrok.presentation.screens.user.list.createuseraccount;

import alex.mrrok.domain.usecases.CreateUserInfoUseCase;
import alex.mrrok.domain.usecases.GeoSetUserCase;
import alex.mrrok.domain.usecases.RegistrationUserUseCase;
import alex.mrrok.domain.usecases.UserDataBaseUseCase;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class CreateUserViewModel_MembersInjector
    implements MembersInjector<CreateUserViewModel> {
  private final Provider<RegistrationUserUseCase> registrationUserUseCaseProvider;

  private final Provider<CreateUserInfoUseCase> createUserInfoUseCaseProvider;

  private final Provider<GeoSetUserCase> geoSetUserCaseProvider;

  private final Provider<UserDataBaseUseCase> dataBaseProvider;

  public CreateUserViewModel_MembersInjector(
      Provider<RegistrationUserUseCase> registrationUserUseCaseProvider,
      Provider<CreateUserInfoUseCase> createUserInfoUseCaseProvider,
      Provider<GeoSetUserCase> geoSetUserCaseProvider,
      Provider<UserDataBaseUseCase> dataBaseProvider) {
    this.registrationUserUseCaseProvider = registrationUserUseCaseProvider;
    this.createUserInfoUseCaseProvider = createUserInfoUseCaseProvider;
    this.geoSetUserCaseProvider = geoSetUserCaseProvider;
    this.dataBaseProvider = dataBaseProvider;
  }

  public static MembersInjector<CreateUserViewModel> create(
      Provider<RegistrationUserUseCase> registrationUserUseCaseProvider,
      Provider<CreateUserInfoUseCase> createUserInfoUseCaseProvider,
      Provider<GeoSetUserCase> geoSetUserCaseProvider,
      Provider<UserDataBaseUseCase> dataBaseProvider) {
    return new CreateUserViewModel_MembersInjector(
        registrationUserUseCaseProvider,
        createUserInfoUseCaseProvider,
        geoSetUserCaseProvider,
        dataBaseProvider);
  }

  @Override
  public void injectMembers(CreateUserViewModel instance) {
    injectRegistrationUserUseCase(instance, registrationUserUseCaseProvider.get());
    injectCreateUserInfoUseCase(instance, createUserInfoUseCaseProvider.get());
    injectGeoSetUserCase(instance, geoSetUserCaseProvider.get());
    injectDataBase(instance, dataBaseProvider.get());
  }

  public static void injectRegistrationUserUseCase(
      CreateUserViewModel instance, RegistrationUserUseCase registrationUserUseCase) {
    instance.registrationUserUseCase = registrationUserUseCase;
  }

  public static void injectCreateUserInfoUseCase(
      CreateUserViewModel instance, CreateUserInfoUseCase createUserInfoUseCase) {
    instance.createUserInfoUseCase = createUserInfoUseCase;
  }

  public static void injectGeoSetUserCase(
      CreateUserViewModel instance, GeoSetUserCase geoSetUserCase) {
    instance.geoSetUserCase = geoSetUserCase;
  }

  public static void injectDataBase(CreateUserViewModel instance, UserDataBaseUseCase dataBase) {
    instance.dataBase = dataBase;
  }
}
