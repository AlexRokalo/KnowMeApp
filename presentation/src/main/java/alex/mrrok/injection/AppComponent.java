package alex.mrrok.injection;


import javax.inject.Singleton;

import alex.mrrok.presentation.screens.user.list.datachangepage.DataChangeViewModel;
import alex.mrrok.presentation.screens.user.list.mainpage.fragmentmaps.MapsFragmentViewModel;
import alex.mrrok.presentation.screens.user.list.userpage.UserPageViewModel;
import alex.mrrok.presentation.screens.user.list.createuseraccount.CreateUserViewModel;
import alex.mrrok.presentation.screens.user.list.loginpage.LoginPageViewModel;
import alex.mrrok.presentation.screens.user.list.mainpage.MainPageViewModel;
import alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserlist.UserListFragmentViewModel;
import alex.mrrok.presentation.screens.user.list.mainpage.fragmentuserpage.UserPageFragmentViewModel;
import dagger.Component;

@Component(modules = AppModule.class)
@Singleton
public interface AppComponent {
    void inject(LoginPageViewModel loginPageViewModel);

    void inject(CreateUserViewModel createUserViewModel);

    void inject(MainPageViewModel mainPageViewModel);

    void inject(UserPageViewModel userPageViewModel);

    void inject(UserPageFragmentViewModel userPageFragmentViewModel);

    void inject(UserListFragmentViewModel userListFragmentViewModel);

    void inject(DataChangeViewModel dataChangeViewModel);

    void inject(MapsFragmentViewModel mapsFragmentViewModel);
}
