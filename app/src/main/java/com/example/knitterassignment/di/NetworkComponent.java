package com.example.knitterassignment.di;

import com.example.knitterassignment.ui.FetchResultsActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class, AppModule.class})
public interface NetworkComponent {

    void inject(FetchResultsActivity fetchResultsActivity);

}
