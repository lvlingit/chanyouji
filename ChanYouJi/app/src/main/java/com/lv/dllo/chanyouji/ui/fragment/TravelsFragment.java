package com.lv.dllo.chanyouji.ui.fragment;

import android.widget.ListView;

import com.lv.dllo.chanyouji.R;
import com.lv.dllo.chanyouji.model.bean.TravelTest;
import com.lv.dllo.chanyouji.model.bean.Travels;
import com.lv.dllo.chanyouji.ui.adapter.TravelTestAdapter;

import java.util.ArrayList;

/**
 * Created by dllo on 16/7/12.
 */
public class TravelsFragment extends AbsBaseFragment {
    private ListView listView;
    private ArrayList<Travels> arrayList;
    @Override
    protected int setlayout() {
        return R.layout.fragment_travels;
    }

    @Override
    protected void initView() {
        listView=byView(R.id.travel_fragment_ls);
    }

    @Override
    protected void initDatas() {
        arrayList=new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            arrayList.add(new TravelTest("去日本旅游:哈哈哈","2016.05.04",3,50, R.mipmap.ic_launcher));
//        }

        TravelTestAdapter adapter=new TravelTestAdapter(context);
        adapter.setArrayList(arrayList);
        listView.setAdapter(adapter);
    }
}
