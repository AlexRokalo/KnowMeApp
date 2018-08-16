package alex.mrrok.domain.usecases;

import java.util.List;

import javax.inject.Inject;

import alex.mrrok.domain.entity.UserGeoPosition;
import alex.mrrok.domain.executors.PostExecutionThread;
import alex.mrrok.domain.repositories.UserRepository;
import alex.mrrok.domain.usecases.baserusecase.BaseUseCase;
import io.reactivex.Observable;

public class GeoAllFiltreUseCase extends BaseUseCase {

    private UserRepository userRepository;

    @Inject
    public GeoAllFiltreUseCase(PostExecutionThread postExecutionThread, UserRepository userRepository) {
        super(postExecutionThread);
        this.userRepository = userRepository;
    }

    public Observable<List<UserGeoPosition>> getAll() {
        return userRepository
                .getAllGeo()
                .subscribeOn(executionThread)
                .observeOn(postExecutionThread);
    }
}
