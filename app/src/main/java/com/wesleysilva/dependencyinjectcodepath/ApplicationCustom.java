package com.wesleysilva.dependencyinjectcodepath;

import android.app.Application;

/**
 * Created by wesleysilva on 3/2/17.
 */

public class ApplicationCustom extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://www.google.com"))
                .build();
    }

    public AppComponent getComponent(){
        return component;
    }
}
