package com.lv.dllo.chanyouji.ui.activity;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lv.dllo.chanyouji.R;
import com.lv.dllo.chanyouji.ui.adapter.FragmentAdapter;
import com.lv.dllo.chanyouji.ui.fragment.StrategyFragment;
import com.lv.dllo.chanyouji.ui.fragment.ToolboxFragment;
import com.lv.dllo.chanyouji.ui.fragment.TravelsFragment;

import java.util.ArrayList;

public class MainActivity extends AbsBaseActivity{
    private ArrayList<Fragment> arrayList;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private FragmentAdapter adapter;

    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {
        viewPager=byView(R.id.viewpager_main);
        tabLayout=byView(R.id.tablayout_main);
    }

    @Override
    protected void initDatas() {
        arrayList=new ArrayList<>();
        arrayList.add(new TravelsFragment());
        arrayList.add(new StrategyFragment());
        arrayList.add(new ToolboxFragment());
        adapter=new FragmentAdapter(getSupportFragmentManager(),arrayList);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setSelectedTabIndicatorColor(Color.GREEN);
        tabLayout.setTabTextColors(Color.argb(255,38,38,38),Color.argb(255,61,137,224));
    }
}
