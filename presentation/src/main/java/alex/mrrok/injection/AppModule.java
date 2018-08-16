package alex.mrrok.injection;

import android.content.Context;

import javax.inject.Singleton;

import alex.mrrok.data.database.UserInfoDataBase;
import alex.mrrok.data.database.dao.DaoContract;
import alex.mrrok.data.repository.UserRepositoryImp;
import alex.mrrok.domain.executors.PostExecutionThread;
import alex.mrrok.domain.repositories.UserRepository;
import alex.mrrok.executor.UIThread;
import dagger.Module;
import dagger.Provides;


@Module
public class AppModule {

    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    public static UserRepository provideUserRepository(UserRepositoryImp userRepository) {
        return userRepository;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return context;
    }

    @Singleton
    @Provides
    public static PostExecutionThread provideUIThread(UIThread uiThread) {
        return uiThread;
    }


    @Provides
    @Singleton
    public static UserInfoDataBase provideAppDatabase(Context context) {
        return UserInfoDataBase.getInstance(context);
    }

    @Provides
    public static DaoContract provideReposDao(UserInfoDataBase appDatabase) {
        return appDatabase.daoContract();
    }
}
