package com.lv.dllo.chanyouji.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

import com.lv.dllo.chanyouji.tools.T;

/**
 * Created by dllo on 16/7/11.
 */
public abstract class AbsBaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //在setcontentView上方去掉信息栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(setLayout());
        initViews();
        initDatas();
    }

    protected abstract int setLayout();

    protected abstract void initViews();

    protected abstract void initDatas();

    /**
     * 简化findViewbyId
     * T 泛型 泛指一系列类型,这里指的是View的子类,如button,textView等
     *
     * @param resId
     * @param <T>
     * @return
     */
    protected <T extends View> T byView(int resId) {
        T t = (T) findViewById(resId);
        return t;
    }

    /**
     * 简化Intent跳转
     * 简单跳转
     *
     * @param from
     * @param to
     */
    protected void goTo(Context from, Class<? extends AbsBaseActivity> to) {
        Intent intent = new Intent(from, to);
        startActivity(intent);
    }

    /**
     * 隐式Intent跳转
     */
    protected void goTo(String action, String uri) {
        Intent intent = new Intent(action);
        intent.setData(Uri.parse(uri));
        startActivity(intent);
    }

    /**
     * 带着跳转
     * @param from
     * @param to
     * @param values Bundle类型的值
     *               是一个轻量级存储数据的类,存储形式为key_value
     */
    protected void goTo(Context from,Class<? extends AbsBaseActivity> to,Bundle values){
        Intent intent=new Intent(from,to);
        intent.putExtras(values);
        startActivity(intent);
    }

}
