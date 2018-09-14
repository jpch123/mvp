package com.jpc.mvp.demo2;

import com.jpc.mvp.demo2.base.BaseView;

public interface MvpView extends BaseView {
    /**
     * 当数据请求成功后，调用此接口显示数据
     *
     * @param data 数据源
     */
    void showData(String data);


}

