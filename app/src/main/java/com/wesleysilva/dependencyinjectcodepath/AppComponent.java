package com.wesleysilva.dependencyinjectcodepath;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by wesleysilva on 3/2/17.
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
}
