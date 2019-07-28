package com.jeremyliao.dataloader.core.loader;

import android.arch.lifecycle.MutableLiveData;

/**
 * Created by liaohailiang on 2019-07-19.
 * Represents a function with four arguments.
 * @param <T1> the first argument type
 * @param <T2> the second argument type
 * @param <T3> the third argument type
 * @param <T4> the fourth argument type
 * @param <R> the result type
 */
public interface LiveDataLoader4<T1, T2, T3, T4, R> extends LiveDataLoader {

    void load(MutableLiveData<R> result, T1 t1, T2 t2, T3 t3, T4 t4);
}
