package com.limefriends.potbbang.Home;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.limefriends.potbbang.R;

import java.util.ArrayList;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

public class ThreeItemsViewPagerAdapter extends PagerAdapter {

    Context context;
    ArrayList<String> data;
    LayoutInflater inflater;
    View viewPager;
    ImageView image_container1;
    ImageView image_container2;
    ImageView image_container3;


    public ThreeItemsViewPagerAdapter(Context context, ArrayList<String> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public Object instantiateItem(final ViewGroup container, final int position) {
        //뷰페이지 슬라이딩 할 레이아웃 인플레이션
        inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
        viewPager = inflater.inflate(R.layout.three_viewpager_home_seekpod, null);
        image_container1 = (ImageView) viewPager.findViewById(R.id.image_container1);
        image_container2 = (ImageView) viewPager.findViewById(R.id.image_container2);
        image_container3 = (ImageView) viewPager.findViewById(R.id.image_container3);

        if(position == 0){
            Glide.with(context).load(data.get(0)).into(image_container1);
            Glide.with(context).load(data.get(1)).into(image_container2);
            Glide.with(context).load(data.get(2)).into(image_container3);
        }else if(position == 1){
            Glide.with(context).load(data.get(3)).into(image_container1);
            Glide.with(context).load(data.get(4)).into(image_container2);
            Glide.with(context).load(data.get(5)).into(image_container3);
        }else if(position == 2){
            Glide.with(context).load(data.get(6)).into(image_container1);
            Glide.with(context).load(data.get(7)).into(image_container2);
            Glide.with(context).load(data.get(8)).into(image_container3);
        }

        container.addView(viewPager);

        image_container1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(container.getContext(), position + "페이지 1번째클릭", Toast.LENGTH_SHORT).show();
                if(position == 0){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.amazon.com"));
                    context.startActivity(intent);
                }else if(position == 1){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.amazon.com"));
                    context.startActivity(intent);
                }else if(position == 2){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.amazon.com"));
                    context.startActivity(intent);
                }
            }
        });
        image_container2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(container.getContext(), position + "페이지 2번째클릭", Toast.LENGTH_SHORT).show();
                if(position == 0){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.apple.com"));
                    context.startActivity(intent);
                }else if(position == 1){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.apple.com"));
                    context.startActivity(intent);
                }else if(position == 2){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.apple.com"));
                    context.startActivity(intent);
                }
            }
        });
        image_container3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(container.getContext(), position + "페이지 3번째클릭", Toast.LENGTH_SHORT).show();
                if(position == 0){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.samsung.com"));
                    context.startActivity(intent);
                }else if(position == 1){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.apple.com"));
                    context.startActivity(intent);
                }else if(position == 2){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.apple.com"));
                    context.startActivity(intent);
                }
            }
        });

        return viewPager;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return data.size()/3;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }



}
