package com.client.interfaces.login;

import com.client.interfaces.IBasePersenter;
import com.client.interfaces.IBaseView;

/**
 * 契约类
 * 解决类接口过多的问题
 *
 */
public interface IRegister {

   /* interface RegisterOne{
        void register(String username,String pw);
    }

    interface RegisterBind{
        void bindPhone(String phone);
    }*/

   interface View extends IBaseView{
        void registerReturn();
   }

   interface Persenter extends IBasePersenter<View>{
        void register(String username,String pw);
   }


}
