package com.basic.mvpdaggerretrofit.ui.hive;

import android.util.Log;

import com.basic.mvpdaggerretrofit.data.DataManager;
import com.basic.mvpdaggerretrofit.data.model.hive.HiveResonse;
import com.basic.mvpdaggerretrofit.ui.base.BasePresenter;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.schedulers.Timed;

/**
 * Created by manu on 6/12/2018.
 */

public class HivePresenterImpl <V extends HiveView> extends BasePresenter<V>
        implements HivePresenter<V> {

    @Inject
    public HivePresenterImpl(DataManager dataManager, CompositeDisposable compositeDisposable) {
        super(dataManager, compositeDisposable);
    }

    @Override
    public void getHive() {
        getMvpView().showLoading();
        getCompositeDisposable().add(getDataManager()
                .fetchHiveContacts()
                .timeInterval()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(new DisposableObserver<Timed<HiveResonse>>() {
                    @Override
                    public void onComplete() {
                    }

                    @Override
                    public void onError(Throwable error) {
                        getMvpView().hideLoading();
                        Log.e("Error hive", "!!!!!"+error.toString());
                    }

                    @Override
                    public void onNext(Timed<HiveResonse> productModels) {
                        getMvpView().hideLoading();
                        getMvpView().onCettingHiveResult(productModels.value());
                        Log.e("Response ==> ", "HIVE !");
                    }
                }));

    }
    }
