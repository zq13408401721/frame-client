package com.client.interfaces;

/**
 * M层的接口
 */
public interface IModel {

    //公开的一些方法
    void loadData(ICallback callback);

    void loadString(ICallback callback);


}
