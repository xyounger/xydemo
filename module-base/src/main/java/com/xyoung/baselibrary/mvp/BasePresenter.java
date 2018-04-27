package com.xyoung.baselibrary.mvp;

/**
 * Created by xiangyang on 2017/12/15.
 */

public interface  BasePresenter <V extends BaseView>{
    void attachView(V view);

    void detachView();
}
