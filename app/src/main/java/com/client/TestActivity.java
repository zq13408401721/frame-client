package com.client;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.client.base.BaseActivity;
import com.client.interfaces.login.IRegister;

public class TestActivity extends BaseActivity {

    private TextView txt;

    @Override
    protected int getLayout() {
        return R.layout.activity_home;
    }

    @Override
    protected void initView() {
        txt = findViewById(R.id.txt);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    protected void initPersenter() {

    }

    @Override
    protected void initData() {

    }


}
