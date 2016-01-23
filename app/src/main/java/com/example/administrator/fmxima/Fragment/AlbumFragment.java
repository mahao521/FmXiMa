package com.example.administrator.fmxima.Fragment;


import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.fmxima.R;
import com.example.administrator.fmxima.Utils.DBUtils;
import com.example.administrator.fmxima.databinding.AlbumItemBinding;
import com.example.administrator.fmxima.databinding.FragmentAlbumBinding;
import com.example.administrator.fmxima.entities.AlbumEntity;

import static android.databinding.DataBindingUtil.inflate;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlbumFragment extends Fragment {


    private AlbumEntity album;
    public AlbumFragment() {

    }

    public static AlbumFragment newInstance(Long id ){
        Bundle args = new Bundle();
        args.putLong("album_id",id);
        AlbumFragment fragment = new AlbumFragment();
        fragment.setArguments(args);

        return fragment;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        long album_id = getArguments().getLong("album_id");
        album = DBUtils.getSession().getAlbumEntityDao().load(album_id);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FragmentAlbumBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_album, container, false);
        ViewCompat.setTransitionName(binding.albumCover,album.getTitle());
        binding.setYinyue(album);
        return binding.getRoot();

    }

}











