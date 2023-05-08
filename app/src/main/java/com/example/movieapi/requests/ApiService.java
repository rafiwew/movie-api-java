package com.example.movieapi.requests;

import com.example.movieapi.utils.Credentials;
import com.example.movieapi.utils.MovieAPI;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {
    private static Retrofit.Builder retrofitBuilder = new Retrofit.Builder().baseUrl(Credentials.BASE_URL).addConverterFactory(GsonConverterFactory.create());
    private static Retrofit retrofit = retrofitBuilder.build();
    private static MovieAPI movieApi = retrofit.create(MovieAPI.class);

    public static MovieAPI getMovieApi() {
        return movieApi;
    }
}
