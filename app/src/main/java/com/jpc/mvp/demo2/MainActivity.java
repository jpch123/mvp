package com.jpc.mvp.demo2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.jpc.mvp.R;
import com.jpc.mvp.demo2.base.BaseActivity;

public class MainActivity extends BaseActivity implements MvpView {

    TextView text;

    MvpPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo1);
        setTitle("demo2");

        text = (TextView) findViewById(R.id.text);

        //初始化Presenter
        presenter = new MvpPresenter();
        presenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //断开View引用
        presenter.detachView();
    }

    @Override
    public void showData(String data) {
        text.setText(data);
    }

    // button 点击事件调用方法
    public void getData(View view) {
        presenter.getData("normal");
    }

    // button 点击事件调用方法
    public void getDataForFailure(View view) {
        presenter.getData("failure");
    }

    // button 点击事件调用方法
    public void getDataForError(View view) {
        presenter.getData("error");
    }
}



