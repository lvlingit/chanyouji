package com.lv.dllo.chanyouji.tools;

import android.widget.Toast;

import com.lv.dllo.chanyouji.ui.activity.MyApp;

/**
 * 吐司工具类
 * Created by dllo on 16/7/11.
 */
public class T {
    private static boolean isDebug=true;
    public static void longMsg(String msg){
        if (isDebug){
            Toast.makeText(MyApp.getContext(), msg, Toast.LENGTH_SHORT).show();
        }
    }
    public static void shortMsg(String msg){
        if (isDebug){
            Toast.makeText(MyApp.getContext(), msg, Toast.LENGTH_SHORT).show();
        }
    }
}
