package com.example.knitterassignment.di;

import android.app.Application;
import android.content.Context;

import com.example.knitterassignment.BasicAuthInterceptor;
import com.example.knitterassignment.MyRepo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Singleton
@Module
public class NetworkModule {

    private static final String BASE_URL = "https://gorest.co.in/";

    private Application application;

    public NetworkModule(Application application) {
        this.application = application;
    }
    @Provides
    @Singleton
    public Context provideContext() {
        return application;
    }


    @Singleton
    @Provides
    static Retrofit provideRetrofit() {
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new BasicAuthInterceptor())
                .build();
        return new Retrofit.Builder().baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Singleton
    @Provides
    static MyRepo provideRetrofitService(Retrofit retrofit) {
        return retrofit.create(MyRepo.class);
    }
}