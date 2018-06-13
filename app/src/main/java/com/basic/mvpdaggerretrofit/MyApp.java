package com.basic.mvpdaggerretrofit;

import android.app.Application;

import com.basic.mvpdaggerretrofit.data.DataManager;
import com.basic.mvpdaggerretrofit.di.component.ApplicationComponent;
import com.basic.mvpdaggerretrofit.di.component.DaggerApplicationComponent;
import com.basic.mvpdaggerretrofit.di.module.ApplicationModule;
import com.basic.mvpdaggerretrofit.di.module.HttpModule;

import javax.inject.Inject;

/**
 * Created by manu on 6/12/2018.
 */

public class MyApp extends Application {
    private ApplicationComponent mApplicationComponent;
    @Inject
    DataManager mDataManager;
    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }


    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponent applicationComponent) {
        mApplicationComponent = applicationComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();



        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .httpModule(new HttpModule())
                .build();


    }
}


