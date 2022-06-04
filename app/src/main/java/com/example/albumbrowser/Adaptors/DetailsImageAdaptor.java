package com.example.albumbrowser.Adaptors;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.albumbrowser.Models.RecyclerViewImage;

public class DetailsImageAdaptor extends PagerAdapter {
    private Context context;
    private String[] imageArray;

    public DetailsImageAdaptor(Context context, String[] imageArray){
        this.context = context;
        this.imageArray = imageArray;
    }


    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);

        String currentImage = imageArray[position];
        int i = context.getResources().getIdentifier(
                currentImage, "drawable",
                context.getPackageName());

        imageView.setImageResource(i);
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}
