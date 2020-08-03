package com.client.interfaces;

/**
 * 接口回调
 */
public interface ICallback<T> {

    void success(T t);

    void error(String msg);

}
