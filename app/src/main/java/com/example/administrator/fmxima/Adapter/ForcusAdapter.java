package com.example.administrator.fmxima.Adapter;

import android.databinding.DataBindingUtil;
import android.support.v4.util.Pools;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.fmxima.R;
import com.example.administrator.fmxima.databinding.FocusimagesItemBinding;
import com.example.administrator.fmxima.entities.FocusImageEntity;

import java.util.List;

/**
 * Created by Administrator on 16-1-23.
 */
public class ForcusAdapter extends PagerAdapter {


    private List<FocusImageEntity> list;
    private Pools.Pool<View> pool;

    public ForcusAdapter(List<FocusImageEntity> list){

        this.list = list;
        pool = new Pools.SimplePool<>(4);
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        FocusimagesItemBinding binding = DataBindingUtil.getBinding(view);
        return binding.getImage().equals(object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View view = pool.acquire();
        if(view == null){
            view = DataBindingUtil.inflate(LayoutInflater.from(container.getContext()), R.layout.focusimages_item,container,false).getRoot();
        }
        FocusimagesItemBinding binding = DataBindingUtil.getBinding(view);
         binding.setImage(list.get(position));

        container.addView(view);
        view.setId(position);
        return list.get(position);
    }

    public void destroyItem(ViewGroup container,int position,Object object){

        View view = container.findViewById(position);
        container.removeView(view);
        pool.release(view);
    }
}
















