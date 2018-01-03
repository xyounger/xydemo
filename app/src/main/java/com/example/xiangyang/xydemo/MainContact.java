package com.example.xiangyang.xydemo;

import com.example.baselibrary.mvp.BasePresenter;
import com.example.baselibrary.mvp.BaseView;

/**
 * Created by xiangyang on 2018/1/3.
 */

public class MainContact {
    public interface IMainView extends BaseView {

        void initView();
    }

    public interface IMainPresenter extends BasePresenter<IMainView> {
        void request();
    }
}
