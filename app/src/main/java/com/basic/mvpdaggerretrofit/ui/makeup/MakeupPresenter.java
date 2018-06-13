package com.basic.mvpdaggerretrofit.ui.makeup;

import com.basic.mvpdaggerretrofit.ui.base.MvpPresenter;

/**
 * Created by manu on 6/12/2018.
 */

public interface MakeupPresenter  <V extends MakeupView> extends MvpPresenter<V> {

    void getMakeupProduct();
}
