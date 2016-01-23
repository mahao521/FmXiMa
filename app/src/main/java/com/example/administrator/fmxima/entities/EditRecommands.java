package com.example.administrator.fmxima.entities;

import java.util.ArrayList;

/**
 * Created by Administrator on 16-1-22.
 */
public class EditRecommands {

    private int ret;
    private String title;
    private Boolean hasMore;
    private ArrayList<AlbumEntity>list;

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

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public ArrayList<AlbumEntity> getList() {
        return list;
    }

    public void setList(ArrayList<AlbumEntity> list) {
        this.list = list;
    }
}
