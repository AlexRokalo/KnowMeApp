package alex.mrrok.domain.usecases;

import java.util.List;

import javax.inject.Inject;

import alex.mrrok.domain.entity.UserNews;
import alex.mrrok.domain.executors.PostExecutionThread;
import alex.mrrok.domain.repositories.UserRepository;
import alex.mrrok.domain.usecases.baserusecase.BaseUseCase;
import io.reactivex.Observable;

public class GetUserNewsUseCase extends BaseUseCase {

    private UserRepository userRepository;

    @Inject
    public GetUserNewsUseCase(PostExecutionThread postExecutionThread, UserRepository userRepository) {
        super(postExecutionThread);
        this.userRepository = userRepository;
    }

    public Observable<List<UserNews>> getNews(String email) {
        return userRepository
                .getNews(email)
                .subscribeOn(executionThread)
                .observeOn(postExecutionThread);
    }
}
