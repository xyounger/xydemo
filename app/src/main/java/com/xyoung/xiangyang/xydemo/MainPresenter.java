package com.xyoung.xiangyang.xydemo;

import android.widget.Toast;

import com.xyoung.baselibrary.mvp.BasePresenterImpl;

/**
 * Created by xiangyang on 2018/1/3.
 */

public class MainPresenter extends BasePresenterImpl<MainContact.IMainView> implements MainContact.IMainPresenter{
    @Override
    public void request() {
        Toast.makeText(mView.getContext(),"test",Toast.LENGTH_LONG).show();
    }
}
