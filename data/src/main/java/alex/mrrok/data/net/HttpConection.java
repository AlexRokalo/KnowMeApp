package alex.mrrok.data.net;

import java.util.concurrent.TimeUnit;

import alex.mrrok.data.BuildConfig;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class HttpConection {

    private OkHttpClient okHttp;

    public HttpConection() {
        okHttp = new OkHttpClient();
    }

    public void setOkHttp() {
        okHttp.newBuilder()
                .addInterceptor(new HttpLoggingInterceptor()
                        .setLevel((BuildConfig.DEBUG) ?
                                HttpLoggingInterceptor.Level.BODY
                                : HttpLoggingInterceptor.Level.NONE))
                .writeTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(60, TimeUnit.SECONDS)
                .build();
    }

    public OkHttpClient getOkHttp() {
        return okHttp;
    }
}
