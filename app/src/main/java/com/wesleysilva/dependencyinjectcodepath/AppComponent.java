package com.wesleysilva.dependencyinjectcodepath;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by wesleysilva on 3/2/17.
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface AppComponent {
    //void inject(MainActivity activity);
    Retrofit retrofit();
    OkHttpClient clientHttp();
    SharedPreferences sharedPreferences();
}
