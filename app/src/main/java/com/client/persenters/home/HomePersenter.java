package com.client.persenters.home;

import com.client.base.BasePersenter;
import com.client.bean.ResultBean;
import com.client.common.CommonSubscriber;
import com.client.interfaces.IBaseView;
import com.client.interfaces.home.IHome;
import com.client.model.HttpManager;
import com.client.utils.RxUtils;

import io.reactivex.disposables.Disposable;
import io.reactivex.subscribers.ResourceSubscriber;

/**
 * home主页相关的业务接口
 */
public class HomePersenter extends BasePersenter<IHome.View> implements IHome.Persenter {

    @Override
    public void getIndex() {
        //获取网络数据的接口调用
        Disposable disposable = HttpManager.getInstance().getYunApi()
                .getIndex().compose(RxUtils.<ResultBean>rxScheduler())  //线程切换
                //请求接口返回的封装抽取失败和完成的方法
                .subscribeWith(new CommonSubscriber<ResultBean>(mView) {
                    @Override
                    public void onNext(ResultBean resultBean) {
                        mView.getIndexReturn(resultBean);
                    }
                });
        addSubscribe(disposable);
    }

    @Override
    public void getIndex1() {
        //获取网络数据的接口调用
        Disposable disposable = HttpManager.getInstance().getYunApi()
                .getIndex().compose(RxUtils.<ResultBean>rxScheduler())  //线程切换
                //请求接口返回的封装抽取失败和完成的方法
                .subscribeWith(new CommonSubscriber<ResultBean>(mView) {
                    @Override
                    public void onNext(ResultBean resultBean) {
                        mView.getIndexReturn(resultBean);
                    }
                });
        addSubscribe(disposable);
    }

    @Override
    public void getIndex2() {
        //获取网络数据的接口调用
        Disposable disposable = HttpManager.getInstance().getYunApi()
                .getIndex().compose(RxUtils.<ResultBean>rxScheduler())  //线程切换
                //请求接口返回的封装抽取失败和完成的方法
                .subscribeWith(new CommonSubscriber<ResultBean>(mView) {
                    @Override
                    public void onNext(ResultBean resultBean) {
                        mView.getIndexReturn(resultBean);
                    }
                });
        addSubscribe(disposable);
    }

    @Override
    public void getIndex3() {
        //获取网络数据的接口调用
        Disposable disposable = HttpManager.getInstance().getYunApi()
                .getIndex().compose(RxUtils.<ResultBean>rxScheduler())  //线程切换
                //请求接口返回的封装抽取失败和完成的方法
                .subscribeWith(new CommonSubscriber<ResultBean>(mView) {
                    @Override
                    public void onNext(ResultBean resultBean) {
                        mView.getIndexReturn(resultBean);
                    }
                });
        addSubscribe(disposable);
    }


}
