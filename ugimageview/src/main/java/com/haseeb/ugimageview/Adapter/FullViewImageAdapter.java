package com.haseeb.ugimageview.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.haseeb.ugimageview.R;
import com.haseeb.ugimageview.ZImageView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class FullViewImageAdapter extends PagerAdapter {

    private Context context;
    private List<String> urls;
    private Activity activity;

    public FullViewImageAdapter(Context context, List<String> urls) {
        this.context = context;
        this.urls = urls;
    }

    @Override
    public int getCount() {
        return urls.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((RelativeLayout) object);
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View viewLayout = inflater.inflate(R.layout.layout_full_screen_image, container, false);

        ZImageView imageView = viewLayout.findViewById(R.id.imgDisplay);
        Picasso.get().setLoggingEnabled(true);
        Picasso.get().load(urls.get(position)).placeholder(R.drawable.placeholder).error(R.drawable.error).into(imageView);

        ((ViewPager) container).addView(viewLayout);

        return viewLayout;
    }
}
