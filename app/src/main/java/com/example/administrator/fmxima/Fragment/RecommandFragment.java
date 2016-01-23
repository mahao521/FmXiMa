package com.example.administrator.fmxima.Fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.fmxima.Adapter.BindingAdapter;
import com.example.administrator.fmxima.Adapter.ForcusAdapter;
import com.example.administrator.fmxima.BR;
import com.example.administrator.fmxima.R;
import com.example.administrator.fmxima.Utils.DBUtils;
import com.example.administrator.fmxima.Utils.NetWorkUtil;
import com.example.administrator.fmxima.dao.AlbumEntityDao;
import com.example.administrator.fmxima.dao.DiscoverEntityDao;
import com.example.administrator.fmxima.dao.FocusImageEntityDao;
import com.example.administrator.fmxima.dao.SpecialColumnEntityDao;
import com.example.administrator.fmxima.dao.TrackEntityDao;
import com.example.administrator.fmxima.databinding.FocusimagesBinding;
import com.example.administrator.fmxima.databinding.FragmentRecommandBinding;
import com.example.administrator.fmxima.entities.BulletAreas;
import com.example.administrator.fmxima.entities.DiscoverEntity;
import com.example.administrator.fmxima.entities.Discovers;
import com.example.administrator.fmxima.entities.EditRecommands;
import com.example.administrator.fmxima.entities.FocusImageEntity;
import com.example.administrator.fmxima.entities.FocusImages;
import com.example.administrator.fmxima.entities.HomeEntity;
import com.example.administrator.fmxima.entities.HotRecommends;
import com.example.administrator.fmxima.entities.RecommendsEntity;
import com.example.administrator.fmxima.entities.SpecialColumns;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Callback;
import retrofit2.Response;

public class RecommandFragment extends Fragment implements Callback<HomeEntity> {

    private BindingAdapter adapter;
    public RecommandFragment() {

    }

    public static RecommandFragment newInstance(String param1) {
        RecommandFragment fragment = new RecommandFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Map<Type,BindingAdapter.BindingTool> map = new HashMap<>();

        map.put(EditRecommands.class,new BindingAdapter.BindingTool(R.layout.editor,BR.wangwu));
        map.put(RecommendsEntity.class,new BindingAdapter.BindingTool(R.layout.recommand_item, BR.recommend));
        map.put(Discovers.class,new BindingAdapter.BindingTool(R.layout.discover,BR.newdiscover));
        map.put(BulletAreas.class,new BindingAdapter.BindingTool(R.layout.danmu,BR.lidan));
        map.put(FocusImages.class,new BindingAdapter.BindingTool(R.layout.focusimages,BR.mahao));
        map.put(SpecialColumns.class,new BindingAdapter.BindingTool(R.layout.specials,BR.special));

        adapter = new BindingAdapter(getContext(),map,new ArrayList<>());
        NetWorkUtil.getService().getHome().enqueue(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FragmentRecommandBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_recommand, container, false);
        binding.homeRecycler.setAdapter(adapter);
        return binding.getRoot();
    }


    @Override
    public void onResponse(Response<HomeEntity> response) {
        HomeEntity hotEntity= null;

        Log.i("mahao",response.code()+"");
        if(response.code() == 200){
           hotEntity = response.body();

            adapter.add(hotEntity.getFocusImages());


            //小编推荐；犹豫布局和热门推荐相同，就不在写了
            EditRecommands editRecommands = hotEntity.getEditorRecommendAlbums();
            adapter.add(editRecommands);

            //发现
            Discovers discovers = hotEntity.getDiscoveryColumns();
            //ArrayList<DiscoverEntity>  listDiscovers = discovers.getList();
            adapter.add(discovers);

            //specila
            SpecialColumns column = hotEntity.getSpecialColumn();
            adapter.add(column);


            //弹幕
            BulletAreas bulletAreas = hotEntity.getBulletArea();
            adapter.add(bulletAreas);

            //热聊天
            HotRecommends hotRecommends = hotEntity.getHotRecommends();
            ArrayList<RecommendsEntity> list = hotRecommends.getList();
            adapter.addAll(list);
        }
        //存入数据库
       AlbumEntityDao dao = DBUtils.getSession().getAlbumEntityDao();
        dao.insertOrReplaceInTx(hotEntity.getEditorRecommendAlbums().getList());
        List<RecommendsEntity> list = hotEntity.getHotRecommends().getList();
        for(RecommendsEntity  entity : list){
            dao.insertOrReplaceInTx(entity.getList());
        }

        SpecialColumnEntityDao specialColumnEntityDao = DBUtils.getSession().getSpecialColumnEntityDao();
        specialColumnEntityDao.insertOrReplaceInTx(hotEntity.getSpecialColumn().getList());

        TrackEntityDao trackEntityDao = DBUtils.getSession().getTrackEntityDao();
        trackEntityDao.insertOrReplaceInTx(hotEntity.getBulletArea().getList());

        final ArrayList<DiscoverEntity> list1 = hotEntity.getDiscoveryColumns().getList();
        DiscoverEntityDao discoverEntityDao = DBUtils.getSession().getDiscoverEntityDao();
        discoverEntityDao.insertOrReplaceInTx(list1);


        ArrayList<FocusImageEntity> list2 = hotEntity.getFocusImages().getList();
        FocusImageEntityDao focusImageEntityDao = DBUtils.getSession().getFocusImageEntityDao();
        focusImageEntityDao.insertOrReplaceInTx(list2);

    }

    @Override
    public void onFailure(Throwable t) {
        Log.i("mahao","网络错误");
        t.printStackTrace();
    }

    @android.databinding.BindingAdapter("bind:init")
    public static void initFocusPager(View view, List<FocusImageEntity> list) {
        final FocusimagesBinding binding = DataBindingUtil.getBinding(view);
        if (binding.viewPager.getAdapter() == null) {
            binding.viewPager.setAdapter(new ForcusAdapter(list));
            binding.viewPager.post(new Runnable() {
                @Override
                public void run() {
                    ViewGroup.LayoutParams params = binding.viewPager.getLayoutParams();
                    params.height = (int) (binding.viewPager.getWidth() / 2.13f);
                    binding.viewPager.setLayoutParams(params);
                }
            });
            binding.imageRg.removeAllViews();
            LayoutInflater inflater = LayoutInflater.from(view.getContext());
            for (int i = 0; i < list.size(); i++) {
                View inflate = inflater.inflate(R.layout.indicator, binding.imageRg, false);
                inflate.setId(i);
                binding.imageRg.addView(inflate);
            }
            binding.imageRg.check(0);
            binding.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {
                    binding.imageRg.check(position);
                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
        }
    }
}



















