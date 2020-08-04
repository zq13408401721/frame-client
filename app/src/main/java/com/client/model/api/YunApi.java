package com.client.model.api;

import com.client.bean.ResultBean;

import io.reactivex.Flowable;
import retrofit2.http.GET;

public interface YunApi {

    @GET("index")
    Flowable<ResultBean> getIndex();


}
