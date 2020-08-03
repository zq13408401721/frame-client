package com.client.base;

import android.util.Log;

public class BaseA extends Base{

    private String className = BaseA.class.getSimpleName();
    @Override
    public void init() {
        Log.i("Base","BASEA:"+className);
    }
}
