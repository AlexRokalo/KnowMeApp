package alex.mrrok.domain.usecases;

import javax.inject.Inject;

import alex.mrrok.domain.entity.UserRegister;
import alex.mrrok.domain.executors.PostExecutionThread;
import alex.mrrok.domain.repositories.UserRepository;
import alex.mrrok.domain.usecases.baserusecase.BaseUseCase;
import io.reactivex.Observable;

public class LogInUserUseCase extends BaseUseCase {

    private UserRepository userRepository;

    @Inject
    public LogInUserUseCase(PostExecutionThread postExecutionThread,
                            UserRepository userRepository) {
        super(postExecutionThread);
        this.userRepository = userRepository;
    }

    public Observable<UserRegister> login(String email) {
        return userRepository
                .loginUser(email)
                .subscribeOn(executionThread)
                .observeOn(postExecutionThread);
    }
}
