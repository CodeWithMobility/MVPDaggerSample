package com.basic.mvpdaggerretrofit.ui.makeup;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.basic.mvpdaggerretrofit.R;
import com.basic.mvpdaggerretrofit.data.model.makeup.MakeReponse;
import com.basic.mvpdaggerretrofit.ui.base.BaseActivity;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by manu on 6/12/2018.
 */

public class MakeupActivity extends BaseActivity implements MakeupView {
    @Inject
    MakeupPresenter<MakeupView> mPresenter;

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
        mPresenter.getMakeupProduct();

        linearLayout = findViewById(R.id.layout);
    }

    @Override
    public void onCettingMakeupPrudctResult(List<MakeReponse> makeReponse) {
        linearLayout.setBackgroundColor(Color.BLUE);
    }
}
