package com.jzhang.android.application;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by jzhang on 2018/1/19.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(this);
    }
}
