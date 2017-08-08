package com.example.xiesubin.myapplication;

import android.app.Application;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;

/**
 * Created by xiesubin on 2017/8/7.
 */

public class WXApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        InitConfig config = new  InitConfig.Builder().setImgAdapter(new ImageAdapter()).build();
        WXSDKEngine.initialize(this, config);
//        try{
//            WXSDKEngine.registerModule()
//        }
    }
}
