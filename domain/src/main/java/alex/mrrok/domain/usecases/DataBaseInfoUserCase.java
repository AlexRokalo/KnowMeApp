package alex.mrrok.domain.usecases;

import javax.inject.Inject;

import alex.mrrok.domain.entity.UserInformation;
import alex.mrrok.domain.executors.PostExecutionThread;
import alex.mrrok.domain.repositories.UserRepository;
import alex.mrrok.domain.usecases.baserusecase.BaseUseCase;
import io.reactivex.Observable;

public class DataBaseInfoUserCase extends BaseUseCase {

    private UserRepository userRepository;

    @Inject
    public DataBaseInfoUserCase(PostExecutionThread postExecutionThread, UserRepository userRepository) {
        super(postExecutionThread);
        this.userRepository = userRepository;
    }


    public Observable<UserInformation> load(String email) {
        return userRepository
                .getUserFromDataBase(email)
                .subscribeOn(executionThread)
                .observeOn(postExecutionThread);

    }
}
