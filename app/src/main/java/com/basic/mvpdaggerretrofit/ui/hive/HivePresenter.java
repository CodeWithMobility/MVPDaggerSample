package com.basic.mvpdaggerretrofit.ui.hive;

import com.basic.mvpdaggerretrofit.ui.base.MvpPresenter;

/**
 * Created by manu on 6/12/2018.
 */

public interface HivePresenter <V extends HiveView> extends MvpPresenter<V> {

    void getHive();
}
