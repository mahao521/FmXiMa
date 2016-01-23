package com.example.administrator.fmxima;

import android.app.Application;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.fmxima.Fragment.RecommandFragment;
import com.example.administrator.fmxima.Utils.DBUtils;
import com.example.administrator.fmxima.entities.RecommendsEntity;
import com.facebook.drawee.backends.pipeline.Fresco;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecommandFragment  recommandFragment = RecommandFragment.newInstance("推荐");
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.home_fragment,recommandFragment);
        transaction.commit();

    }
}
