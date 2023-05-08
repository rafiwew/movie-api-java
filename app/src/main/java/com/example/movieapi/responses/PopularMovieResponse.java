package com.example.movieapi.responses;

import com.example.movieapi.models.MovieModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PopularMovieResponse {
    @SerializedName("results")
    @Expose
    private List<MovieModel> movies;

    public List<MovieModel> getMovies() {
        return movies;
    }

    @Override
    public String toString() {
        return "SearchMovieResponses{" +
                "movies=" + movies +
                '}';
    }
}
