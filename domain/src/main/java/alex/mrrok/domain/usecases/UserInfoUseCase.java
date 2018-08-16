package alex.mrrok.domain.usecases;

import javax.inject.Inject;

import alex.mrrok.domain.entity.UserInformation;
import alex.mrrok.domain.executors.PostExecutionThread;
import alex.mrrok.domain.repositories.UserRepository;
import alex.mrrok.domain.usecases.baserusecase.BaseUseCase;
import io.reactivex.Completable;

public class UserInfoUseCase extends BaseUseCase {

    private UserRepository userRepository;

    @Inject
    public UserInfoUseCase(PostExecutionThread postExecutionThread,
                           UserRepository userRepository) {
        super(postExecutionThread);
        this.userRepository = userRepository;
    }

    public Completable setUserInfo(UserInformation userInformation, String id) {
        return userRepository
                .setUserInfo(userInformation,id)
                .subscribeOn(executionThread)
                .observeOn(postExecutionThread);
    }
}
