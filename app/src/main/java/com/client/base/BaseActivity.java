package com.client.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity {

    Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设计模式中的模板方法调用
        setContentView(getLayout());

        unbinder = ButterKnife.bind(this);

        initView();
        initPersenter();
        initData();

    }

    /**
     * 获取界面布局的方法
     * @return
     */
    protected abstract int getLayout();

    /**
     * 初始化界面
     */
    protected abstract void initView();

    /**
     * 初始化p层
     */
    protected abstract void initPersenter();

    /**
     * 初始化加载数据
     */
    protected abstract void initData();



    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(unbinder != null){
            unbinder.unbind();
        }
    }
}
