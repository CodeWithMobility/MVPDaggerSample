package com.basic.mvpdaggerretrofit.ui.base;

import android.content.Context;
import android.support.annotation.StringRes;

/**
 * Created by manu on 2/18/2018.
 */

public interface MvpView {

    void showLoading();

    void hideLoading();

    void onError(@StringRes int resId);

    void onError(String message);

    void onError(String message, int type);

    void showMessage(String message);

    void showMessage(@StringRes int resId);

    boolean isNetworkConnected();

    void hideKeyboard();

    Context getActivityContext();


}
