package com.client.base;

import android.util.Log;

public class BaseB extends Base{
    private String className = BaseB.class.getSimpleName();
    @Override
    public void init() {
        Log.i("Base","BASEB:"+className);
    }
}
