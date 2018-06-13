package com.basic.mvpdaggerretrofit.ui.makeup;

import com.basic.mvpdaggerretrofit.data.model.makeup.MakeReponse;
import com.basic.mvpdaggerretrofit.ui.base.MvpView;

import java.util.List;

/**
 * Created by manu on 6/12/2018.
 */

public interface MakeupView extends MvpView{

    void onCettingMakeupPrudctResult(List<MakeReponse> makeReponse);
}
