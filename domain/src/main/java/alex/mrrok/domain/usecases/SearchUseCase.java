package alex.mrrok.domain.usecases;

import java.util.List;

import javax.inject.Inject;

import alex.mrrok.domain.entity.UserInformation;
import alex.mrrok.domain.executors.PostExecutionThread;
import alex.mrrok.domain.repositories.UserRepository;
import alex.mrrok.domain.usecases.baserusecase.BaseUseCase;
import io.reactivex.Observable;

public class SearchUseCase extends BaseUseCase {

    private UserRepository userRepository;

    @Inject
    public SearchUseCase(PostExecutionThread postExecutionThread, UserRepository userRepository) {
        super(postExecutionThread);
        this.userRepository = userRepository;
    }

    public Observable<List<UserInformation>> search(String name) {
        return userRepository
                .searchUser(name)
                .subscribeOn(executionThread)
                .observeOn(postExecutionThread);
    }
}
