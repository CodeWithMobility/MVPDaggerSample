package com.basic.mvpdaggerretrofit.ui.hive;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.basic.mvpdaggerretrofit.R;
import com.basic.mvpdaggerretrofit.data.model.hive.HiveResonse;
import com.basic.mvpdaggerretrofit.ui.base.BaseActivity;

import javax.inject.Inject;

/**
 * Created by manu on 6/12/2018.
 */

public class HiveActivity extends BaseActivity implements HiveView{


    @Inject
    HivePresenter<HiveView> mPresenter;

    @Override
    public Context getActivityContext() {
        return null;
    }

    @Override
    protected void setUp() {

    }
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testlayout);
        getActivityComponent().inject(this);
        mPresenter.onAttach(this);
        mPresenter.getHive();
        linearLayout = findViewById(R.id.layout);
    }

    @Override
    public void onCettingHiveResult(HiveResonse hiveResonse) {
        linearLayout.setBackgroundColor(Color.GREEN);
    }
}
