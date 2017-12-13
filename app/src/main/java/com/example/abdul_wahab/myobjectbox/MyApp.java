package com.example.abdul_wahab.myobjectbox;

import android.app.Application;

import io.objectbox.BoxStore;

/**
 * Created by Abdul-Wahab on 12/13/2017.
 */

public class MyApp extends Application {
    BoxStore boxStore;

    @Override
    public void onCreate() {
        super.onCreate();
        boxStore = MyObjectBox.builder().androidContext(MyApp.this).build();

    }

    public BoxStore getBoxStore() {
        return boxStore;
    }
}
