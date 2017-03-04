package com.wesleysilva.dependencyinjectcodepath;

import dagger.Component;

@PerActivity
@Component(dependencies = {AppComponent.class}, modules = {SubModule.class})
public interface SubComponent {
    void inject(MainActivity activity);
}
