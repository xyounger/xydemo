package com.example.xiangyang.xydemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.baselibrary.mvp.MVPBaseActivity;

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
