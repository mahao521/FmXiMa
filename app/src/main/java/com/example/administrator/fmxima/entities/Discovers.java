package com.example.administrator.fmxima.entities;

import java.util.ArrayList;

/**
 * Created by Administrator on 16-1-22.
 */
public class Discovers {

    private int ret ;
    private String title;
    private String locationInHotRecommend;
    private ArrayList<DiscoverEntity> list;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocationInHotRecommend() {
        return locationInHotRecommend;
    }

    public void setLocationInHotRecommend(String locationInHotRecommend) {
        this.locationInHotRecommend = locationInHotRecommend;
    }

    public ArrayList<DiscoverEntity> getList() {
        return list;
    }

    public void setList(ArrayList<DiscoverEntity> list) {
        list = list;
    }
}
