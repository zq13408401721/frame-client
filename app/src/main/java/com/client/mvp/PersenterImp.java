package com.client.mvp;

import com.client.interfaces.ICallback;
import com.client.interfaces.IModel;
import com.client.interfaces.IPresenter;
import com.client.interfaces.IView;

public class PersenterImp implements IPresenter {

    IView view;  //v层的接口类
    IModel model; //m层的接口类

    public PersenterImp(IView view){
        this.view = view;
        model = new ModelImp();
    }


    @Override
    public void getNetData() {
        //为什么这里可以new 一个接口 匿名的内部类
        model.loadData(new ICallback() {
            @Override
            public void success(Object o) {
                if(view != null){
                    view.getDataReturn((String) o);
                }
            }

            @Override
            public void error(String msg) {

            }
        });
        model.loadString(new ICallback() {
            @Override
            public void success(Object o) {

            }

            @Override
            public void error(String msg) {

            }
        });
    }


}
