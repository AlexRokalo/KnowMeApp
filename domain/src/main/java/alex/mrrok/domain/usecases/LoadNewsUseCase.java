package alex.mrrok.domain.usecases;

import javax.inject.Inject;

import alex.mrrok.domain.entity.UserNews;
import alex.mrrok.domain.executors.PostExecutionThread;
import alex.mrrok.domain.repositories.UserRepository;
import alex.mrrok.domain.usecases.baserusecase.BaseUseCase;
import io.reactivex.Completable;

public class LoadNewsUseCase extends BaseUseCase {

    private UserRepository userRepository;

    @Inject
    public LoadNewsUseCase(PostExecutionThread postExecutionThread, UserRepository userRepository) {
        super(postExecutionThread);
        this.userRepository = userRepository;
    }

    public Completable loadNews(UserNews userNews) {
        return userRepository
                .loadNews(userNews)
                .subscribeOn(executionThread)
                .observeOn(postExecutionThread);
    }
}
