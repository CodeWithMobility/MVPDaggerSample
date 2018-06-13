package com.basic.mvpdaggerretrofit.di.component;

import com.basic.mvpdaggerretrofit.MyApp;
import com.basic.mvpdaggerretrofit.data.DataManager;
import com.basic.mvpdaggerretrofit.data.network.RetrofitHelper;
import com.basic.mvpdaggerretrofit.di.module.ApplicationModule;
import com.basic.mvpdaggerretrofit.di.module.HttpModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by manu on 6/12/2018.
 */


@Singleton
@Component(modules = {ApplicationModule.class, HttpModule.class})
public interface ApplicationComponent {

    MyApp getContext();

    DataManager getDataManager();

    RetrofitHelper retrofitHelper();
}