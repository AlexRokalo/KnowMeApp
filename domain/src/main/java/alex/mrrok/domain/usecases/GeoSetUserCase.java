package alex.mrrok.domain.usecases;

import javax.inject.Inject;

import alex.mrrok.domain.entity.UserGeoPosition;
import alex.mrrok.domain.executors.PostExecutionThread;
import alex.mrrok.domain.repositories.UserRepository;
import alex.mrrok.domain.usecases.baserusecase.BaseUseCase;
import io.reactivex.Completable;

public class GeoSetUserCase extends BaseUseCase {

    private UserRepository userRepository;

    @Inject
    public GeoSetUserCase(PostExecutionThread postExecutionThread,
                          UserRepository userRepository) {
        super(postExecutionThread);
        this.userRepository = userRepository;
    }

    public Completable setPoint(UserGeoPosition userGeoPosition) {
        return userRepository
                .setPointToGeo(userGeoPosition)
                .subscribeOn(executionThread)
                .observeOn(postExecutionThread);
    }
}
