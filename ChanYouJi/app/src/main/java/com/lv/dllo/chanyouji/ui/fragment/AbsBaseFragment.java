package com.lv.dllo.chanyouji.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lv.dllo.chanyouji.ui.activity.AbsBaseActivity;

/**
 * Created by dllo on 16/7/11.
 */
public abstract class AbsBaseFragment extends Fragment {
    protected Context context;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(setlayout(),container,false);
    }
    protected  abstract int setlayout();

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }
    protected abstract void initView();

    /**
     * 简化findviewbyid
     * @param resId
     * @param <T>
     * @return
     */
    protected <T extends View >T byView(int resId){
        return (T) getView().findViewById(resId);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initDatas();
    }
    protected abstract void initDatas();

    /**
     * 简单Intent跳转
     * @param from
     * @param to
     */
    protected void goTo(Context from, Class<? extends AbsBaseActivity> to){
        Intent intent=new Intent(from,to);
        context.startActivity(intent);
    }
}
