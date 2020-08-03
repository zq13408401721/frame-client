package com.client;

import androidx.appcompat.app.AppCompatActivity;

import android.net.IpPrefix;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.client.interfaces.IPresenter;
import com.client.interfaces.IView;
import com.client.mvp.PersenterImp;

public class MainActivity extends AppCompatActivity implements IView {

    TextView txtMsg;
    Button btnGet;

    //注意 引用的类型  接口
    IPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMsg = findViewById(R.id.txt_msg);
        btnGet = findViewById(R.id.btn_data);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getData();
            }
        });
        presenter = new PersenterImp(this);
        getData();
    }

    /**
     * 点击按钮获取数据
     */
    public void getData(){
        presenter.getNetData();
    }

    /**
     * 数据返回的方法
     */
    @Override
    public void getDataReturn(String msg) {
        txtMsg.setText(msg);
    }
}