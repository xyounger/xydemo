package com.example.baselibrary.interf;

import android.support.annotation.Nullable;

/**
 * Created by xiangyang on 2017/12/16.
 */

public interface ICallBack<T> {

    void callBack(@Nullable T t);
}
