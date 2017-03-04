package com.wesleysilva.dependencyinjectcodepath;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

import javax.inject.Inject;

import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {

    @Inject
    OkHttpClient client;
    @Inject
    SharedPreferences sharedPreferences;
    @Inject List<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppComponent component = ((ApplicationCustom) getApplication()).getComponent();
        SubComponent as = DaggerSubComponent.builder()
                .appComponent(component)
                .subModule(new SubModule())
                .build();
        as.inject(this);
        data.size();
        if(sharedPreferences != null){
            sharedPreferences.edit();
        }
    }
}
