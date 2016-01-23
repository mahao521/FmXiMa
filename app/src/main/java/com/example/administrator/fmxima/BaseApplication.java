package com.example.administrator.fmxima;

/**
 * Created by Administrator on 16-1-22.
 */

import android.app.Application;

import com.example.administrator.fmxima.Utils.DBUtils;
import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by Administrator on 16-1-22.
 */
public  class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
        DBUtils.initialize(this);
    }
}