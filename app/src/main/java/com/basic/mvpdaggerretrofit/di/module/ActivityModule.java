package com.basic.mvpdaggerretrofit.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;

import com.basic.mvpdaggerretrofit.di.qualifier.ActivityContext;
import com.basic.mvpdaggerretrofit.di.scope.ActivityScope;
import com.basic.mvpdaggerretrofit.ui.hive.HivePresenter;
import com.basic.mvpdaggerretrofit.ui.hive.HivePresenterImpl;
import com.basic.mvpdaggerretrofit.ui.hive.HiveView;
import com.basic.mvpdaggerretrofit.ui.makeup.MakeupPresenter;
import com.basic.mvpdaggerretrofit.ui.makeup.MakeupPresenterImpl;
import com.basic.mvpdaggerretrofit.ui.makeup.MakeupView;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by manu on 6/12/2018.
 */
@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    @ActivityScope
    HivePresenter<HiveView> provideHivePresenter(
            HivePresenterImpl<HiveView> presenter) {
        return presenter;
    }

    @Provides
    @ActivityScope
    MakeupPresenter<MakeupView> provideMakeupPresenter(
            MakeupPresenterImpl< MakeupView> presenter) {
        return presenter;
    }
//    @Provides
//    ProductAdapter provideProductAdapter() {
//        return new ProductAdapter((BaseActivity) mActivity);
//    }



    @Provides
    GridLayoutManager provideGridLayoutManager(AppCompatActivity activity) {
        return new GridLayoutManager(activity,2);
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(AppCompatActivity activity) {
        return new LinearLayoutManager(activity);
    }
}