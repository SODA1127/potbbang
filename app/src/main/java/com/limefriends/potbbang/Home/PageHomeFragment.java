package com.limefriends.potbbang.Home;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.limefriends.potbbang.R;
import com.pm10.library.LineIndicator;

import java.util.ArrayList;

import cn.trinea.android.view.autoscrollviewpager.AutoScrollViewPager;

public class PageHomeFragment extends Fragment{
    private OnFragmentInteractionListener mListener;
    private AutoScrollViewPager autoViewPager;
    private LineIndicator lineIndicator;
    private ThreeItemsViewPagerAdapter viewPagerAdapter;
    private LinearLayout page_home;
    private LinearLayout page_home_in;
    private LinearLayout home_seekpod;
    private TextView seekpodTV;

    public PageHomeFragment() {
    }

    public static PageHomeFragment newInstance() {
        PageHomeFragment fragment = new PageHomeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {}

    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        page_home = (LinearLayout) inflater.inflate(R.layout.fragment_page_home, container, false);
        page_home_in = (LinearLayout) page_home.findViewById(R.id.page_home_in);
        home_seekpod = (LinearLayout) inflater.inflate(R.layout.page_home_seekpod, null);

        ArrayList<String> seekpodDataList = new ArrayList<>(); //이미지 url를 저장하는 arraylist
        seekpodDataList.add("http://www.techholic.co.kr/news/photo/201408/20246_8061_1030.jpg");
        seekpodDataList.add("http://www.techholic.co.kr/news/photo/201408/20246_8062_1030.png");
        seekpodDataList.add("http://cfile1.uf.tistory.com/image/2428864E5493A4070C4D1F");
        seekpodDataList.add("https://lifeedu.skuniv.ac.kr/wp-content/uploads/logo-4.jpg");
        seekpodDataList.add("https://lifeedu.skuniv.ac.kr/wp-content/uploads/logo-5.jpg");
        seekpodDataList.add("https://lifeedu.skuniv.ac.kr/wp-content/uploads/logo-7.jpg");
        seekpodDataList.add("https://lifeedu.skuniv.ac.kr/wp-content/uploads/logo-8.jpg");
        seekpodDataList.add("https://lifeedu.skuniv.ac.kr/wp-content/uploads/logo-10.jpg");
        seekpodDataList.add("https://lifeedu.skuniv.ac.kr/wp-content/uploads/logo-1.jpg");

        lineIndicator = (LineIndicator) home_seekpod.findViewById(R.id.line_indicator);
        autoViewPager = (AutoScrollViewPager) home_seekpod.findViewById(R.id.seekpodViewPager);
        viewPagerAdapter = new ThreeItemsViewPagerAdapter(inflater.getContext(), seekpodDataList);
        autoViewPager.setAdapter(viewPagerAdapter); //Auto Viewpager에 Adapter 장착
        //viewPager.setInterval(3000); // 페이지 넘어갈 시간 간격 설정
        //viewPager.startAutoScroll(); //Auto Scroll 시작

        autoViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}
            @Override
            public void onPageSelected(final int position) {
                Toast.makeText(container.getContext(), position + "번 째 페이지", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onPageScrollStateChanged(int state) {}
        });
        lineIndicator.setupWithViewPager(autoViewPager);

        seekpodTV = (TextView) home_seekpod.findViewById(R.id.seekpodTV);
        seekpodTV.setText("주목할 만한 팟");
        page_home_in.addView(home_seekpod);

        /*/////////////////////////////////////*/

        home_seekpod = (LinearLayout) inflater.inflate(R.layout.page_home_seekpod, null);

        seekpodDataList = new ArrayList<>(); //이미지 url를 저장하는 arraylist
        seekpodDataList.add("http://www.techholic.co.kr/news/photo/201408/20246_8061_1030.jpg");
        seekpodDataList.add("http://www.techholic.co.kr/news/photo/201408/20246_8062_1030.png");
        seekpodDataList.add("http://cfile1.uf.tistory.com/image/2428864E5493A4070C4D1F");
        seekpodDataList.add("https://lifeedu.skuniv.ac.kr/wp-content/uploads/logo-4.jpg");
        seekpodDataList.add("https://lifeedu.skuniv.ac.kr/wp-content/uploads/logo-5.jpg");
        seekpodDataList.add("https://lifeedu.skuniv.ac.kr/wp-content/uploads/logo-7.jpg");
        seekpodDataList.add("https://lifeedu.skuniv.ac.kr/wp-content/uploads/logo-8.jpg");
        seekpodDataList.add("https://lifeedu.skuniv.ac.kr/wp-content/uploads/logo-10.jpg");
        seekpodDataList.add("https://lifeedu.skuniv.ac.kr/wp-content/uploads/logo-1.jpg");

        lineIndicator = (LineIndicator) home_seekpod.findViewById(R.id.line_indicator);
        autoViewPager = (AutoScrollViewPager) home_seekpod.findViewById(R.id.seekpodViewPager);
        viewPagerAdapter = new ThreeItemsViewPagerAdapter(inflater.getContext(), seekpodDataList);
        autoViewPager.setAdapter(viewPagerAdapter); //Auto Viewpager에 Adapter 장착
        //viewPager.setInterval(3000); // 페이지 넘어갈 시간 간격 설정
        //viewPager.startAutoScroll(); //Auto Scroll 시작

        autoViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}
            @Override
            public void onPageSelected(final int position) {
                Toast.makeText(container.getContext(), position + "번 째 페이지", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onPageScrollStateChanged(int state) {}
        });
        lineIndicator.setupWithViewPager(autoViewPager);

        seekpodTV = (TextView) home_seekpod.findViewById(R.id.seekpodTV);
        seekpodTV.setText("주목할 만한 유료");
        page_home_in.addView(home_seekpod);

        /*/////////////////////////////////////*/

        home_seekpod = (LinearLayout) inflater.inflate(R.layout.page_home_seekpod, null);

        seekpodDataList = new ArrayList<>(); //이미지 url를 저장하는 arraylist
        seekpodDataList.add("http://www.techholic.co.kr/news/photo/201408/20246_8061_1030.jpg");
        seekpodDataList.add("http://www.techholic.co.kr/news/photo/201408/20246_8062_1030.png");
        seekpodDataList.add("http://cfile1.uf.tistory.com/image/2428864E5493A4070C4D1F");
        seekpodDataList.add("https://lifeedu.skuniv.ac.kr/wp-content/uploads/logo-4.jpg");
        seekpodDataList.add("https://lifeedu.skuniv.ac.kr/wp-content/uploads/logo-5.jpg");
        seekpodDataList.add("https://lifeedu.skuniv.ac.kr/wp-content/uploads/logo-7.jpg");
        seekpodDataList.add("https://lifeedu.skuniv.ac.kr/wp-content/uploads/logo-8.jpg");
        seekpodDataList.add("https://lifeedu.skuniv.ac.kr/wp-content/uploads/logo-10.jpg");
        seekpodDataList.add("https://lifeedu.skuniv.ac.kr/wp-content/uploads/logo-1.jpg");

        lineIndicator = (LineIndicator) home_seekpod.findViewById(R.id.line_indicator);
        autoViewPager = (AutoScrollViewPager) home_seekpod.findViewById(R.id.seekpodViewPager);
        viewPagerAdapter = new ThreeItemsViewPagerAdapter(inflater.getContext(), seekpodDataList);
        autoViewPager.setAdapter(viewPagerAdapter); //Auto Viewpager에 Adapter 장착
        //viewPager.setInterval(3000); // 페이지 넘어갈 시간 간격 설정
        //viewPager.startAutoScroll(); //Auto Scroll 시작

        autoViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}
            @Override
            public void onPageSelected(final int position) {
                Toast.makeText(container.getContext(), position + "번 째 페이지", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onPageScrollStateChanged(int state) {}
        });
        lineIndicator.setupWithViewPager(autoViewPager);

        seekpodTV = (TextView) home_seekpod.findViewById(R.id.seekpodTV);
        seekpodTV.setText("팟빵 오리지널");
        page_home_in.addView(home_seekpod);

        return page_home;
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
