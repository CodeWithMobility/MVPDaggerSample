package com.basic.mvpdaggerretrofit.ui.makeup;

import android.util.Log;

import com.basic.mvpdaggerretrofit.data.DataManager;
import com.basic.mvpdaggerretrofit.data.model.hive.HiveResonse;
import com.basic.mvpdaggerretrofit.data.model.makeup.MakeReponse;
import com.basic.mvpdaggerretrofit.ui.base.BasePresenter;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.schedulers.Timed;

/**
 * Created by manu on 6/12/2018.
 */

public class MakeupPresenterImpl <V extends MakeupView> extends BasePresenter<V>
        implements MakeupPresenter<V> {

    @Inject
    public MakeupPresenterImpl(DataManager dataManager, CompositeDisposable compositeDisposable) {
        super(dataManager, compositeDisposable);
    }

    @Override
    public void getMakeupProduct() {
        getMvpView().showLoading();
        getCompositeDisposable().add(getDataManager()
                .fetchmakeupProduct()
                .timeInterval()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(new DisposableObserver<Timed<List<MakeReponse>>>() {
                    @Override
                    public void onComplete() {
                    }

                    @Override
                    public void onError(Throwable error) {
                        getMvpView().hideLoading();
                        Log.e("Error makeup", "!!!!!"+error.toString());
                    }

                    @Override
                    public void onNext(Timed<List<MakeReponse>> productModels) {
                        getMvpView().hideLoading();
                        getMvpView().onCettingMakeupPrudctResult(productModels.value());
                        Log.e("Response ==> ", "Make up !");
                    }
                }));
    }
}