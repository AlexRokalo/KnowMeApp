// Generated by Dagger (https://google.github.io/dagger).
package alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserpage;

import alex.mrrok.domain.usecases.DataBaseInfoUserCase;
import alex.mrrok.domain.usecases.GetUserNewsUseCase;
import alex.mrrok.domain.usecases.UserPageUseCase;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class UserPageFragmentViewModel_MembersInjector
    implements MembersInjector<UserPageFragmentViewModel> {
  private final Provider<UserPageUseCase> userPageUseCaseProvider;

  private final Provider<DataBaseInfoUserCase> dataBaseInfoUserCaseProvider;

  private final Provider<GetUserNewsUseCase> userNewsUseCaseProvider;

  public UserPageFragmentViewModel_MembersInjector(
      Provider<UserPageUseCase> userPageUseCaseProvider,
      Provider<DataBaseInfoUserCase> dataBaseInfoUserCaseProvider,
      Provider<GetUserNewsUseCase> userNewsUseCaseProvider) {
    this.userPageUseCaseProvider = userPageUseCaseProvider;
    this.dataBaseInfoUserCaseProvider = dataBaseInfoUserCaseProvider;
    this.userNewsUseCaseProvider = userNewsUseCaseProvider;
  }

  public static MembersInjector<UserPageFragmentViewModel> create(
      Provider<UserPageUseCase> userPageUseCaseProvider,
      Provider<DataBaseInfoUserCase> dataBaseInfoUserCaseProvider,
      Provider<GetUserNewsUseCase> userNewsUseCaseProvider) {
    return new UserPageFragmentViewModel_MembersInjector(
        userPageUseCaseProvider, dataBaseInfoUserCaseProvider, userNewsUseCaseProvider);
  }

  @Override
  public void injectMembers(UserPageFragmentViewModel instance) {
    injectUserPageUseCase(instance, userPageUseCaseProvider.get());
    injectDataBaseInfoUserCase(instance, dataBaseInfoUserCaseProvider.get());
    injectUserNewsUseCase(instance, userNewsUseCaseProvider.get());
  }

  public static void injectUserPageUseCase(
      UserPageFragmentViewModel instance, UserPageUseCase userPageUseCase) {
    instance.userPageUseCase = userPageUseCase;
  }

  public static void injectDataBaseInfoUserCase(
      UserPageFragmentViewModel instance, DataBaseInfoUserCase dataBaseInfoUserCase) {
    instance.dataBaseInfoUserCase = dataBaseInfoUserCase;
  }

  public static void injectUserNewsUseCase(
      UserPageFragmentViewModel instance, GetUserNewsUseCase userNewsUseCase) {
    instance.userNewsUseCase = userNewsUseCase;
  }
}
