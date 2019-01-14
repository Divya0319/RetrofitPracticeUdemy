package com.practice.retrofitexampleudemy.http;

import com.practice.retrofitexampleudemy.http.apimodel.UserModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UsersAPI {

    @GET(NetworkKeys.USERS_ENDPOINT)
    Call<List<UserModel>> getUsers();

}
