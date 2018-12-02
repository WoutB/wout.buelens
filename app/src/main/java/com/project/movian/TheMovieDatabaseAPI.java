package com.project.movian;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TheMovieDatabaseAPI {
    @GET("movie/now_playing")
    Call<MovieResponse> getPopularMovies(
            @Query("api_key") String apiKey,
            @Query("language") String language,
            @Query("page") int page
    );

    @GET("genre/movie/list")
    Call<MovieResponse> getGenres(
            @Query("api_key") String apiKey,
            @Query("language") String language
    );
}