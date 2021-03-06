// Generated by Dagger (https://google.github.io/dagger).
package alex.mrrok.injection;

import alex.mrrok.data.database.UserInfoDataBase;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideAppDatabaseFactory implements Factory<UserInfoDataBase> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideAppDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public UserInfoDataBase get() {
    return provideInstance(contextProvider);
  }

  public static UserInfoDataBase provideInstance(Provider<Context> contextProvider) {
    return proxyProvideAppDatabase(contextProvider.get());
  }

  public static AppModule_ProvideAppDatabaseFactory create(Provider<Context> contextProvider) {
    return new AppModule_ProvideAppDatabaseFactory(contextProvider);
  }

  public static UserInfoDataBase proxyProvideAppDatabase(Context context) {
    return Preconditions.checkNotNull(
        AppModule.provideAppDatabase(context),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
