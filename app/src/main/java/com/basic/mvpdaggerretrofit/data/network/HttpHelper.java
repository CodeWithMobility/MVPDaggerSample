package com.basic.mvpdaggerretrofit.data.network;

import com.basic.mvpdaggerretrofit.data.model.hive.HiveResonse;
import com.basic.mvpdaggerretrofit.data.model.makeup.MakeReponse;
import com.basic.mvpdaggerretrofit.data.model.movie.MovieResponse;


import java.util.List;

import io.reactivex.Observable;


/**
 * Created by manu on 6/12/2018.
 */

public interface HttpHelper {
    Observable<HiveResonse> fetchHiveContacts();
    Observable<List<MakeReponse>> fetchmakeupProduct();
    Observable<MovieResponse> fetchMovieProduct(String api_key, int page);
}
