package com.basic.mvpdaggerretrofit.data.apis;

import com.basic.mvpdaggerretrofit.data.model.hive.HiveResonse;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by manu on 6/12/2018.
 */

public interface HiveApis {
    String HOST = "https://api.androidhive.info/";

    @GET("contacts/?")
    Observable<HiveResonse> fetchHiveContacts();
}
