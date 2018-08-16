package alex.mrrok.domain.usecases;

import java.util.List;

import javax.inject.Inject;

import alex.mrrok.domain.entity.UserInformation;
import alex.mrrok.domain.executors.PostExecutionThread;
import alex.mrrok.domain.repositories.UserRepository;
import alex.mrrok.domain.usecases.baserusecase.BaseUseCase;
import io.reactivex.Observable;

public class UserListUseCase extends BaseUseCase {

    private UserRepository userRepository;

    @Inject
    public UserListUseCase(PostExecutionThread postExecutionThread, UserRepository userRepository) {
        super(postExecutionThread);
        this.userRepository = userRepository;
    }

    public Observable<List<UserInformation>> getAll() {
        return userRepository
                .getAll()
                .subscribeOn(executionThread)
                .observeOn(postExecutionThread);
    }
}
