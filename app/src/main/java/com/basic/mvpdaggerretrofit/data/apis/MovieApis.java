package com.basic.mvpdaggerretrofit.data.apis;


import com.basic.mvpdaggerretrofit.data.model.movie.MovieResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by manu on 6/12/2018.
 */

public interface MovieApis {


    String HOST = "https://api.themoviedb.org/3/tv/";


    @GET("movie/popular?")
    Observable<MovieResponse> fetchMovieProduct(@Query("api_key") String api_key, @Query("page") int page);
}
