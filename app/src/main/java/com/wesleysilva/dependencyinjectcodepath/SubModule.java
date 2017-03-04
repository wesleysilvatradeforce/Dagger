package com.wesleysilva.dependencyinjectcodepath;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;
import okhttp3.HttpUrl;
import retrofit2.Retrofit;

@Module
public class SubModule {

    @Provides
    @PerActivity
    public List<String> provideSubComponent(Retrofit retrofit){
        HttpUrl base = retrofit.baseUrl();
        List<String> list = new ArrayList<>();
        list.add("Wesley");
        list.add("Barbara");
        return list;
    }

}
