package com.basic.mvpdaggerretrofit.di.module;

import com.basic.mvpdaggerretrofit.MyApp;
import com.basic.mvpdaggerretrofit.data.DataManager;
import com.basic.mvpdaggerretrofit.data.network.HttpHelper;
import com.basic.mvpdaggerretrofit.data.network.RetrofitHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by manu on 6/12/2018.
 */
@Module
public class ApplicationModule {
    private final MyApp application;

    public ApplicationModule(MyApp application) {
        this.application = application;
    }

    @Provides
    @Singleton
    MyApp provideApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    HttpHelper provideHttpHelper(RetrofitHelper retrofitHelper) {
        return retrofitHelper;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(HttpHelper httpHelper) {
        return new DataManager(httpHelper);
    }

}
