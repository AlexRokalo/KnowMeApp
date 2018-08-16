package alex.mrrok.domain.usecases;

import javax.inject.Inject;

import alex.mrrok.domain.entity.UserInformation;
import alex.mrrok.domain.executors.PostExecutionThread;
import alex.mrrok.domain.repositories.UserRepository;
import alex.mrrok.domain.usecases.baserusecase.BaseUseCase;
import io.reactivex.Completable;

public class UpdataDataUseCase extends BaseUseCase {

    private UserRepository userRepository;

    @Inject
    public UpdataDataUseCase(PostExecutionThread postExecutionThread, UserRepository userRepository) {
        super(postExecutionThread);
        this.userRepository = userRepository;
    }

    public Completable update(UserInformation userInformation) {
        return userRepository
                .updateDataBase(userInformation)
                .subscribeOn(executionThread)
                .observeOn(postExecutionThread);
    }
}
