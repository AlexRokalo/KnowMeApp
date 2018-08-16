package alex.mrrok.domain.usecases;

import javax.inject.Inject;

import alex.mrrok.domain.entity.UserInformation;
import alex.mrrok.domain.executors.PostExecutionThread;
import alex.mrrok.domain.repositories.UserRepository;
import alex.mrrok.domain.usecases.baserusecase.BaseUseCase;
import io.reactivex.Completable;

public class UserDataBaseUseCase extends BaseUseCase {

    private UserRepository userRepository;

    @Inject
    public UserDataBaseUseCase(PostExecutionThread postExecutionThread, UserRepository userRepository) {
        super(postExecutionThread);
        this.userRepository = userRepository;
    }

    public Completable addToDataBase(UserInformation userInformation) {
        return userRepository
                .addToDataBase(userInformation)
                .subscribeOn(executionThread)
                .observeOn(postExecutionThread);
    }
}
