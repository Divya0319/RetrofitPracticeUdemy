package com.practice.retrofitexampleudemy.root;

import android.app.Application;
import android.content.Context;

import dagger.Module;

@Module
public class ApplicationModule {
    private Application application;


    ApplicationModule(Application application) {
        this.application = application;
    }

    Context provideContext() {
        return application;
    }
}
