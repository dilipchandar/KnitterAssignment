package com.example.knitterassignment;

import com.example.knitterassignment.model.User;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyRepo {

    @GET("/public-api/users?")
    Call<User> getUsers();

}
