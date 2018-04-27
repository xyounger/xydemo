package com.xyoung.xiangyang.xydemo;

import android.content.Context;
import android.os.Bundle;

import com.xyoung.baselibrary.mvp.MVPBaseActivity;

public class MainActivity extends MVPBaseActivity<MainContact.IMainView, MainPresenter> implements MainContact.IMainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter.request();

    }

    @Override
    public void initView() {

    }

    @Override
    public Context getContext() {
        return this;
    }
}
