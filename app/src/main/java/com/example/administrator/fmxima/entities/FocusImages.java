package com.example.administrator.fmxima.entities;

import java.util.ArrayList;

/**
 * Created by Administrator on 16-1-22.
 */
public class FocusImages {

    private int ret = 0;
    private String title ;
    private ArrayList<FocusImageEntity> list;

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

    public ArrayList<FocusImageEntity> getList() {
        return list;
    }

    public void setList(ArrayList<FocusImageEntity> list) {
        this.list = list;
    }
}
