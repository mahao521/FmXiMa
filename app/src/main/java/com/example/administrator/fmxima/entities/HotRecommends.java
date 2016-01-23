package com.example.administrator.fmxima.entities;

import java.util.ArrayList;

/**
 * Created by Administrator on 16-1-22.
 */
public class HotRecommends {

    private String title ;
    private int ret;
    private ArrayList<RecommendsEntity> list;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public ArrayList<RecommendsEntity> getList() {
        return list;
    }

    public void setList(ArrayList<RecommendsEntity> list) {
        this.list = list;
    }
}
