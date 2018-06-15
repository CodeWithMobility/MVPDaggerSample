package com.basic.mvpdaggerretrofit.di.module;

/**
 * Created by manu on 6/12/2018.
 */

import com.basic.mvpdaggerretrofit.data.apis.HiveApis;
import com.basic.mvpdaggerretrofit.data.apis.MakeupApis;
import com.basic.mvpdaggerretrofit.data.apis.MovieApis;
import com.basic.mvpdaggerretrofit.di.qualifier.HiveUrl;
import com.basic.mvpdaggerretrofit.di.qualifier.MakeupUrl;
import com.basic.mvpdaggerretrofit.di.qualifier.MovieUrl;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


@Module
public class HttpModule {

    @Singleton
    @Provides
    Retrofit.Builder provideRetrofitBuilder() {
        return new Retrofit.Builder();
    }


    @Singleton
    @Provides
    OkHttpClient.Builder provideOkHttpBuilder() {
        return new OkHttpClient.Builder();
    }

    @Singleton
    @Provides
    @HiveUrl
    Retrofit provideHiveRetrofit(Retrofit.Builder builder, OkHttpClient client) {
        return createRetrofit(builder, client, HiveApis.HOST);
    }

    @Singleton
    @Provides
    @MovieUrl
    Retrofit provideMovieRetrofit(Retrofit.Builder builder, OkHttpClient client) {
        return createRetrofit(builder, client, MovieApis.HOST);
    }

    @Singleton
    @Provides
    @MakeupUrl
    Retrofit provideGankRetrofit(Retrofit.Builder builder, OkHttpClient client) {
        return createRetrofit(builder, client, MakeupApis.HOST);
    }


    @Provides
    @Singleton
    HttpLoggingInterceptor provideLoggingInterceptor(){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return interceptor;
    }

    @Provides
    @Singleton
    OkHttpClient provideClient(HttpLoggingInterceptor interceptor){
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient .connectTimeout(100, TimeUnit.SECONDS)
                .readTimeout(100,TimeUnit.SECONDS).build();
        httpClient.addInterceptor(interceptor);
        return httpClient.build();
    }

    @Singleton
    @Provides
    HiveApis provideHiveService(@HiveUrl Retrofit retrofit) {
        return retrofit.create(HiveApis.class);
    }

    @Singleton
    @Provides
    MovieApis provideMovieService(@MovieUrl  Retrofit retrofit) {
        return retrofit.create(MovieApis.class);
    }

    @Singleton
    @Provides
    MakeupApis provideMakeupService(@MakeupUrl Retrofit retrofit) {
        return retrofit.create(MakeupApis.class);
    }


    private Retrofit createRetrofit(Retrofit.Builder builder, OkHttpClient client, String url) {
        return builder
                .baseUrl(url)
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}