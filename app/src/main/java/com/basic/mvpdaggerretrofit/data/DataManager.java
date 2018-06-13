package com.basic.mvpdaggerretrofit.data;

import com.basic.mvpdaggerretrofit.data.model.hive.HiveResonse;
import com.basic.mvpdaggerretrofit.data.model.makeup.MakeReponse;
import com.basic.mvpdaggerretrofit.data.model.movie.MovieResponse;
import com.basic.mvpdaggerretrofit.data.network.HttpHelper;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by manu on 6/12/2018.
 */

public class DataManager implements HttpHelper{
    HttpHelper mHttpHelper;

    public DataManager(HttpHelper httpHelper) {
        mHttpHelper = httpHelper;
    }


    @Override
    public Observable<HiveResonse> fetchHiveContacts() {
        return mHttpHelper.fetchHiveContacts();
    }

    @Override
    public Observable<List<MakeReponse>> fetchmakeupProduct() {
        return mHttpHelper.fetchmakeupProduct();
    }

    @Override
    public Observable<MovieResponse> fetchMovieProduct(String api_key, int page) {
        return mHttpHelper.fetchMovieProduct(api_key, page);
    }
}
