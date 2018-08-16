package alex.mrrok.domain.usecases;

import javax.inject.Inject;

import alex.mrrok.domain.entity.UserInformation;
import alex.mrrok.domain.executors.PostExecutionThread;
import alex.mrrok.domain.repositories.UserRepository;
import alex.mrrok.domain.usecases.baserusecase.BaseUseCase;
import io.reactivex.Observable;

public class UserPageUseCase extends BaseUseCase {

    private UserRepository userRepository;
    @Inject
    public UserPageUseCase(PostExecutionThread postExecutionThread, UserRepository userRepository) {
        super(postExecutionThread);
        this.userRepository = userRepository;
    }

    public Observable<UserInformation> load(String idSurname) {
        return userRepository
                .userPage(idSurname)
                .subscribeOn(executionThread)
                .observeOn(postExecutionThread);
    }
}
