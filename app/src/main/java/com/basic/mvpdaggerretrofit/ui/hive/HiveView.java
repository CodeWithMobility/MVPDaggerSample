package com.basic.mvpdaggerretrofit.ui.hive;

import com.basic.mvpdaggerretrofit.data.model.hive.HiveResonse;
import com.basic.mvpdaggerretrofit.ui.base.MvpView;

/**
 * Created by manu on 6/12/2018.
 */

public interface HiveView extends MvpView {

   void onCettingHiveResult(HiveResonse hiveResonse);
}
