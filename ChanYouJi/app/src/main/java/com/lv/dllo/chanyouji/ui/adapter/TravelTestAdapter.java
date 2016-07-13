package com.lv.dllo.chanyouji.ui.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lv.dllo.chanyouji.R;
import com.lv.dllo.chanyouji.model.bean.TravelTest;
import com.lv.dllo.chanyouji.model.bean.Travels;

import java.util.ArrayList;

/**
 * Created by dllo on 16/7/12.
 */
public class TravelTestAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Travels> arrayList;

    public TravelTestAdapter(Context context) {
        this.context = context;
    }

    public TravelTestAdapter setArrayList(ArrayList<Travels> arrayList) {
        this.arrayList = arrayList;
        notifyDataSetChanged();
        return this;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TravelTestHolder holder=null;
        if (convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.item_travel_fragment_ls,parent,false);
            holder=new TravelTestHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder= (TravelTestHolder) convertView.getTag();
        }


      //  holder.authorIV
        holder.imageNumTV.setText(arrayList.get(position).getPhotos_count()+"张");
        holder.daysTV.setText(arrayList.get(position).getDays()+"天");
        holder.dateTV.setText(arrayList.get(position).getStart_date()+"/");
        holder.titleTV.setText(arrayList.get(position).getName());

        return convertView;
    }
    class TravelTestHolder{
        private TextView titleTV,dateTV,daysTV,imageNumTV;
        private ImageView authorIV;
        public TravelTestHolder(View view){
            titleTV = (TextView) view.findViewById(R.id.travel_fragment_ls_title_tv);
            dateTV = (TextView) view.findViewById(R.id.travel_fragment_ls_date_tv);
            daysTV = (TextView) view.findViewById(R.id.travel_fragment_ls_days_tv);
            imageNumTV = (TextView) view.findViewById(R.id.travel_fragment_ls_picture_num_tv);
            authorIV = (ImageView) view.findViewById(R.id.travel_fragment_ls_author_iv);
        }
    }

}
