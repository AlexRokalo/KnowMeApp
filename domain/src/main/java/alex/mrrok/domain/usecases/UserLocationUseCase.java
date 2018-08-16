package alex.mrrok.domain.usecases;

import javax.inject.Inject;

import alex.mrrok.domain.entity.UserGeoPosition;
import alex.mrrok.domain.executors.PostExecutionThread;
import alex.mrrok.domain.repositories.UserRepository;
import alex.mrrok.domain.usecases.baserusecase.BaseUseCase;
import io.reactivex.Completable;

public class UserLocationUseCase extends BaseUseCase {

    private UserRepository userRepository;

    @Inject
    public UserLocationUseCase(PostExecutionThread postExecutionThread,
                               UserRepository userRepository) {
        super(postExecutionThread);
        this.userRepository = userRepository;
    }

    public Completable setLocation(UserGeoPosition userGeoPosition, String id) {
        return userRepository
                .setLocationToUser(userGeoPosition,id)
                .subscribeOn(executionThread)
                .observeOn(postExecutionThread);
    }
}
