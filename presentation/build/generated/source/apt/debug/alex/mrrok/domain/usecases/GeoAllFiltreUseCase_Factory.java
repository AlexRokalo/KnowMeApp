// Generated by Dagger (https://google.github.io/dagger).
package alex.mrrok.domain.usecases;

import alex.mrrok.domain.executors.PostExecutionThread;
import alex.mrrok.domain.repositories.UserRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class GeoAllFiltreUseCase_Factory implements Factory<GeoAllFiltreUseCase> {
  private final Provider<PostExecutionThread> postExecutionThreadProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  public GeoAllFiltreUseCase_Factory(
      Provider<PostExecutionThread> postExecutionThreadProvider,
      Provider<UserRepository> userRepositoryProvider) {
    this.postExecutionThreadProvider = postExecutionThreadProvider;
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public GeoAllFiltreUseCase get() {
    return provideInstance(postExecutionThreadProvider, userRepositoryProvider);
  }

  public static GeoAllFiltreUseCase provideInstance(
      Provider<PostExecutionThread> postExecutionThreadProvider,
      Provider<UserRepository> userRepositoryProvider) {
    return new GeoAllFiltreUseCase(postExecutionThreadProvider.get(), userRepositoryProvider.get());
  }

  public static GeoAllFiltreUseCase_Factory create(
      Provider<PostExecutionThread> postExecutionThreadProvider,
      Provider<UserRepository> userRepositoryProvider) {
    return new GeoAllFiltreUseCase_Factory(postExecutionThreadProvider, userRepositoryProvider);
  }

  public static GeoAllFiltreUseCase newGeoAllFiltreUseCase(
      PostExecutionThread postExecutionThread, UserRepository userRepository) {
    return new GeoAllFiltreUseCase(postExecutionThread, userRepository);
  }
}
