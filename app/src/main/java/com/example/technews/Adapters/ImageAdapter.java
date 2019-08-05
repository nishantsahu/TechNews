package com.example.technews.Adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.example.technews.R;

public class ImageAdapter extends PagerAdapter {

    Context mCtx;

    public ImageAdapter(Context mCtx) {
        this.mCtx = mCtx;
    }

//    private String[] sliderImageUrl = new String[] {
//            "https://cdn.pixabay.com/photo/2013/08/20/15/47/sunset-174276__340.jpg",
//            "https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg",
//            "https://images6.alphacoders.com/451/451028.jpg"
//    };

    private int[] sliderImageId = new int[] {
            R.drawable.images1,
            R.drawable.images2
    };

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mCtx);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(sliderImageId[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public int getCount() {
        return sliderImageId.length;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ImageView) object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
}
