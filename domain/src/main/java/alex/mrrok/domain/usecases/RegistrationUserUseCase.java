package alex.mrrok.domain.usecases;

import javax.inject.Inject;

import alex.mrrok.domain.entity.UserRegister;
import alex.mrrok.domain.executors.PostExecutionThread;
import alex.mrrok.domain.repositories.UserRepository;
import alex.mrrok.domain.usecases.baserusecase.BaseUseCase;
import io.reactivex.Completable;

public class RegistrationUserUseCase extends BaseUseCase {

    private UserRepository userRepository;

    @Inject
    public RegistrationUserUseCase(PostExecutionThread postExecutionThread,
                                   UserRepository userRepository) {
        super(postExecutionThread);
        this.userRepository = userRepository;
    }


    public Completable register(UserRegister user) {
        return userRepository
                .registerUser(user)
                .subscribeOn(executionThread)
                .observeOn(postExecutionThread);
    }
}
