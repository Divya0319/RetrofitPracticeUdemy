package com.practice.retrofitexampleudemy.root;

import android.app.Application;

import com.practice.retrofitexampleudemy.http.APIModule;

public class App extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .aPIModule(new APIModule())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}


