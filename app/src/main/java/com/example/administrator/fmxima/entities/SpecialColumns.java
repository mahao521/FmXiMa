package com.example.administrator.fmxima.entities;

import java.util.ArrayList;

/**
 * Created by Administrator on 16-1-22.
 */
public class SpecialColumns {

    private int ret;
    private String title;
    private String hasMore;
    private ArrayList<SpecialColumnEntity> list;

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

    public String getHasMore() {
        return hasMore;
    }

    public void setHasMore(String hasMore) {
        this.hasMore = hasMore;
    }

    public ArrayList<SpecialColumnEntity> getList() {
        return list;
    }

    public void setList(ArrayList<SpecialColumnEntity> list) {
        this.list = list;
    }
}
