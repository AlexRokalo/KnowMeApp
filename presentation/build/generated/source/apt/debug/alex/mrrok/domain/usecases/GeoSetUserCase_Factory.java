// Generated by Dagger (https://google.github.io/dagger).
package alex.mrrok.domain.usecases;

import alex.mrrok.domain.executors.PostExecutionThread;
import alex.mrrok.domain.repositories.UserRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class GeoSetUserCase_Factory implements Factory<GeoSetUserCase> {
  private final Provider<PostExecutionThread> postExecutionThreadProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  public GeoSetUserCase_Factory(
      Provider<PostExecutionThread> postExecutionThreadProvider,
      Provider<UserRepository> userRepositoryProvider) {
    this.postExecutionThreadProvider = postExecutionThreadProvider;
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public GeoSetUserCase get() {
    return provideInstance(postExecutionThreadProvider, userRepositoryProvider);
  }

  public static GeoSetUserCase provideInstance(
      Provider<PostExecutionThread> postExecutionThreadProvider,
      Provider<UserRepository> userRepositoryProvider) {
    return new GeoSetUserCase(postExecutionThreadProvider.get(), userRepositoryProvider.get());
  }

  public static GeoSetUserCase_Factory create(
      Provider<PostExecutionThread> postExecutionThreadProvider,
      Provider<UserRepository> userRepositoryProvider) {
    return new GeoSetUserCase_Factory(postExecutionThreadProvider, userRepositoryProvider);
  }

  public static GeoSetUserCase newGeoSetUserCase(
      PostExecutionThread postExecutionThread, UserRepository userRepository) {
    return new GeoSetUserCase(postExecutionThread, userRepository);
  }
}
