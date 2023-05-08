package com.example.movieapi.utils;

import com.example.movieapi.responses.PopularMovieResponse;
import com.example.movieapi.responses.SearchMovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieAPI {
    // popular movie
    @GET("movie/popular")
    Call<PopularMovieResponse> getPopularMovie(@Query("api_key") String key,
                                               @Query("page") int page);

    // search movie
    @GET("search/movie")
    Call<SearchMovieResponse> searchMovie(@Query("api_key") String key,
                                          @Query("query") String query,
                                          @Query("page") int page);
}
