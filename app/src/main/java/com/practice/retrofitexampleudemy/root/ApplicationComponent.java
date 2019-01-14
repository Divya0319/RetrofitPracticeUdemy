package com.practice.retrofitexampleudemy.root;

import com.practice.retrofitexampleudemy.MainActivity;
import com.practice.retrofitexampleudemy.http.APIModule;

import dagger.Component;

@Component(modules = {ApplicationModule.class, APIModule.class})
public interface ApplicationComponent {
    void inject(MainActivity target);
}
