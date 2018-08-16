package alex.mrrok.presentation.screens.user.list.mainpage;


import alex.mrrok.app.App;
import alex.mrrok.presentation.base.BaseViewModel;

public class MainPageViewModel extends BaseViewModel<MainPageRouter> {

    @Override
    protected void runInject() {
        App.getAppComponent().inject(this);
    }

    public MainPageViewModel() {

    }

}
