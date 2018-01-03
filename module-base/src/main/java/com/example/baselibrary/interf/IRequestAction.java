package com.example.baselibrary.interf;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;


/**
 * Created by xiangyang on 2017/12/16.
 */

public interface IRequestAction<T> {

    void onResponseSuccess(@NonNull Context context, @Nullable T t);

    void onResponseFailed(@NonNull Context context, @Nullable Bundle bundle);
}
