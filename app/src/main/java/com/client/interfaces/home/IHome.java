package com.client.interfaces.home;

import com.client.bean.ResultBean;
import com.client.interfaces.IBasePersenter;
import com.client.interfaces.IBaseView;

public interface IHome {

    interface View extends IBaseView{
        void getIndexReturn(ResultBean resultBean);
    }

    interface Persenter extends IBasePersenter<View>{
        void getIndex();

        void getIndex1();

        void getIndex2();

        void getIndex3();

    }
}
