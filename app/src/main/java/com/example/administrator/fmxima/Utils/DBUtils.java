package com.example.administrator.fmxima.Utils;

import android.content.Context;

import com.example.administrator.fmxima.dao.DaoMaster;
import com.example.administrator.fmxima.dao.DaoSession;

/**
 * Created by Administrator on 16-1-22.
 */
public class DBUtils {

    private static DaoSession sSession;

    public static void initialize(Context context){

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context,"ximalaya",null);
        DaoMaster master = new DaoMaster(helper.getReadableDatabase());
        sSession = master.newSession();
    }

    public static DaoSession getSession(){
        return sSession;
    }
}









