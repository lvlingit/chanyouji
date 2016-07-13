package com.lv.dllo.chanyouji.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by dllo on 16/7/12.
 */
public class FragmentAdapter extends FragmentPagerAdapter{
    private ArrayList<Fragment> arrayList;
    ArrayList<String> tabTitle=new ArrayList<>();
    public FragmentAdapter(FragmentManager fm,ArrayList<Fragment> arrayList) {
        super(fm);
        this.arrayList=arrayList;
        tabTitle.add("游记");
        tabTitle.add("攻略");
        tabTitle.add("工具箱");

    }

    @Override
    public Fragment getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle.get(position);
    }
}
