package com.lv.dllo.chanyouji.tools;

import android.util.Log;

/**
 * log 的工具类
 * Created by dllo on 16/7/11.
 */
public final class L {
    // 被final修饰 不能被继承
    // 私有构造方法
    private L(){}
    // 调试模式,定义为ture
    private static boolean isDebug=true;

    private static String TAG="MyDemo";

    /**
     * 使用App名字作为标签
     * @param msg
     */
    public static void e(String msg){
        if (isDebug){
            Log.e(TAG, msg);
        }
    }
    public static void d(String msg){
        if (isDebug){
            Log.d(TAG, msg);
        }
    }
    public static void i(String msg){
        if (isDebug){
            Log.i(TAG, msg);
        }
    }
    public static void w(String msg){
        if (isDebug){
            Log.w(TAG, msg);
        }
    }
    public static void v(String msg){
        if (isDebug){
            Log.v(TAG, msg);
        }
    }
    /**
     * 自定义标签
     * @param tag
     * @param msg
     */
    public static void e(String tag,String msg){
        if (isDebug){
            Log.e(TAG, msg);
        }
    }
    public static void d(String tag,String msg){
        if (isDebug){
            Log.d(TAG, msg);
        }
    }
    public static void w(String tag,String msg){
        if (isDebug){
            Log.w(TAG, msg);
        }
    }
    public static void i(String tag,String msg){
        if (isDebug){
            Log.i(TAG, msg);
        }
    }
    public static void v(String tag,String msg){
        if (isDebug){
            Log.v(TAG, msg);
        }
    }
}
