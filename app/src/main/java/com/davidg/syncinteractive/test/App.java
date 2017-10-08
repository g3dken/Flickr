package com.davidg.syncinteractive.test;

import android.app.Activity;
import android.app.Application;

import com.davidg.syncinteractive.test.data.model.api.Photo;
import com.davidg.syncinteractive.test.di.component.DaggerAppComponent;

import java.util.ArrayList;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class App extends Application implements HasActivityInjector {

    private static App instance = null;
    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;
    private ArrayList<Photo> arrayList = new ArrayList<>();

    @Override
    public void onCreate() {
        super.onCreate();

        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this);


        instance = this;
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }

    public static App getInstance() {
        return instance;
    }

    public ArrayList<Photo> getArrayList() {
        return arrayList;
    }

}
