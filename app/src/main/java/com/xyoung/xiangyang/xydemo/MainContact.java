package com.xyoung.xiangyang.xydemo;

import com.xyoung.baselibrary.mvp.BasePresenter;
import com.xyoung.baselibrary.mvp.BaseView;

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
