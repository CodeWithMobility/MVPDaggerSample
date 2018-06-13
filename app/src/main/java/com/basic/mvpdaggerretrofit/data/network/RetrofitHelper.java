package com.basic.mvpdaggerretrofit.data.network;

import com.basic.mvpdaggerretrofit.data.apis.HiveApis;
import com.basic.mvpdaggerretrofit.data.apis.MakeupApis;
import com.basic.mvpdaggerretrofit.data.apis.MovieApis;
import com.basic.mvpdaggerretrofit.data.model.hive.HiveResonse;
import com.basic.mvpdaggerretrofit.data.model.makeup.MakeReponse;
import com.basic.mvpdaggerretrofit.data.model.movie.MovieResponse;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by manu on 6/12/2018.
 */

public class RetrofitHelper implements HttpHelper {

    private HiveApis mHiveApiService;
    private MovieApis mMovieApiiService;
    private MakeupApis mMakeupApiService;


    @Inject
    public RetrofitHelper(HiveApis mHiveApiService, MovieApis mMovieApiiService, MakeupApis mMakeupApiService) {
        this.mHiveApiService = mHiveApiService;
        this.mMovieApiiService = mMovieApiiService;
        this.mMakeupApiService = mMakeupApiService;

    }
    @Override
    public Observable<HiveResonse> fetchHiveContacts() {
        return mHiveApiService.fetchHiveContacts();
    }

    @Override
    public Observable<List<MakeReponse>> fetchmakeupProduct() {
        return mMakeupApiService.fetchmakeupProduct();
    }

    @Override
    public Observable<MovieResponse> fetchMovieProduct(String api_key, int page) {
        return mMovieApiiService.fetchMovieProduct(api_key, page);
    }
}
