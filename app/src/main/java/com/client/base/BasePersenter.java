package com.client.base;

import com.client.interfaces.IBasePersenter;
import com.client.interfaces.IBaseView;

import java.lang.ref.WeakReference;

/**
 * P层的基类
 */
public abstract class BasePersenter<V extends IBaseView> implements IBasePersenter<V> {

    //为什么这是泛型而不是IBaseView接口
    protected V mView; //p层所关联的v层

    //弱引用V层 解决Activity或者Fragment使用mvp的内存泄漏问题
    WeakReference<V> weakReference;


    @Override
    public void attachView(V view) {
        weakReference = new WeakReference<>(view);
        mView = weakReference.get();
    }

    @Override
    public void detachView() {
        mView = null;
    }

}
