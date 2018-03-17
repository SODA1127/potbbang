package com.limefriends.potbbang;

import android.graphics.Color;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.limefriends.potbbang.Rank.PageRankFragment;
import com.limefriends.potbbang.Home.PageHomeFragment;

public class MainActivity extends AppCompatActivity
        implements PageHomeFragment.OnFragmentInteractionListener,
        PageRankFragment.OnFragmentInteractionListener{
    PodbbangPagerAdapter podbbangPagerAdapter;
    ViewPager podbbangPager;
    TabLayout menuTab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        podbbangPagerAdapter = new PodbbangPagerAdapter(getSupportFragmentManager());
        podbbangPager = (ViewPager) findViewById(R.id.podbbangPager);
        podbbangPager.setAdapter(podbbangPagerAdapter);

        menuTab = (TabLayout) findViewById(R.id.menuTab);
        menuTab.setupWithViewPager(podbbangPager);
        menuTab.setBackgroundColor(Color.WHITE);
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
