package com.client.mvp;

import com.client.interfaces.ICallback;
import com.client.interfaces.IModel;

public class ModelImp implements IModel {

    @Override
    public void loadData(ICallback callback) {
        //实现网络数据的加载

        callback.success("data load success");
    }

    @Override
    public void loadString(ICallback callback) {

    }

}
