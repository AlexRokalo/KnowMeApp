package alex.mrrok.app;

import android.app.Application;

import alex.mrrok.injection.AppComponent;
import alex.mrrok.injection.AppModule;
import alex.mrrok.injection.DaggerAppComponent;

public class App extends Application {

    private static AppComponent appComponent;

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .build();

    }
}
