package com.limefriends.potbbang;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.limefriends.potbbang.Rank.PageRankFragment;
import com.limefriends.potbbang.Home.PageHomeFragment;

public class PodbbangPagerAdapter extends FragmentPagerAdapter{
    private static int PAGE_NUM = 5;

    public PodbbangPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return PageHomeFragment.newInstance();
            case 1 :
                return PageRankFragment.newInstance();
            case 2 :
                return PageRankFragment.newInstance();
            case 3 :
                return PageRankFragment.newInstance();
            case 4 :
                return PageRankFragment.newInstance();
            default :
                return null;
        }
    }

    @Override
    public int getCount() {
        return PAGE_NUM;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0 :
                return "홈";
            case 1 :
                return "순위";
            case 2 :
                return "추천";
            case 3 :
                return "카테고리";
            case 4 :
                return "라이브";
            default :
                return null;
        }
    }
}
