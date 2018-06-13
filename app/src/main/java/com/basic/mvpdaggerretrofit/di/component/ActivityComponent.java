package com.basic.mvpdaggerretrofit.di.component;

import com.basic.mvpdaggerretrofit.di.module.ActivityModule;
import com.basic.mvpdaggerretrofit.di.scope.ActivityScope;
import com.basic.mvpdaggerretrofit.ui.hive.HiveActivity;
import com.basic.mvpdaggerretrofit.ui.makeup.MakeupActivity;

import dagger.Component;

/**
 * Created by manu on 6/12/2018.
 */

@ActivityScope
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(HiveActivity activity);
    void inject(MakeupActivity activity);



}