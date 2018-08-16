package alex.mrrok.domain.usecases;

import javax.inject.Inject;

import alex.mrrok.domain.entity.UserGeoPosition;
import alex.mrrok.domain.executors.PostExecutionThread;
import alex.mrrok.domain.repositories.UserRepository;
import alex.mrrok.domain.usecases.baserusecase.BaseUseCase;
import io.reactivex.Observable;

public class GeoIdUseCase extends BaseUseCase {

    private UserRepository userRepository;

    @Inject
    public GeoIdUseCase(PostExecutionThread postExecutionThread,
                        UserRepository userRepository) {
        super(postExecutionThread);
        this.userRepository = userRepository;
    }

    public Observable<UserGeoPosition> getIndificator(String email){
        return userRepository
                .getIdObject(email)
                .subscribeOn(executionThread)
                .observeOn(postExecutionThread);
    }
}
