package com.xyoung.baselibrary.interf;

import android.support.annotation.Nullable;

/**
 * Created by xiangyang on 2018/5/30.
 */

public interface ICallBack2P<K, V> {

    void callBack(@Nullable K k, @Nullable V v);
}
