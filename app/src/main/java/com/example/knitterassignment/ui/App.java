package com.example.knitterassignment.ui;

import android.app.Application;

import com.example.knitterassignment.di.DaggerNetworkComponent;
import com.example.knitterassignment.di.NetworkComponent;

public class App extends Application {
    private NetworkComponent component;
    @Override
    public void onCreate() {
        super.onCreate();
        //needs to run once to generate it
        component = DaggerNetworkComponent.builder()
                .build();
    }
    public NetworkComponent getComponent() {
        return component;
    }
}
