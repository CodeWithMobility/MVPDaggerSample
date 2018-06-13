package com.basic.mvpdaggerretrofit.data.apis;

import com.basic.mvpdaggerretrofit.data.model.makeup.MakeReponse;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by manu on 6/12/2018.
 */

public interface MakeupApis {
    String HOST = "http://makeup-api.herokuapp.com/api/v1/";


    @GET("products.json")
    Observable<List<MakeReponse>> fetchmakeupProduct();
}
