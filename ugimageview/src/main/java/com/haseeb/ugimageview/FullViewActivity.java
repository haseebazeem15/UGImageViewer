package com.haseeb.ugimageview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.haseeb.ugimageview.Adapter.FullViewImageAdapter;
import com.haseeb.ugimageview.Helper.UGImageViewer;

import java.util.ArrayList;

public class FullViewActivity extends AppCompatActivity {

    ViewPager viewPager;
    TextView counterView;

    private ArrayList<String> urls = new ArrayList<>();
    private int position = 0;
    private int pos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_view);

        urls = (ArrayList<String>) getIntent().getSerializableExtra("urls");
        position = getIntent().getIntExtra("position", 0);

        Log.d("DATA", "onCreate: " + urls);

        viewPager = findViewById(R.id.pager);
        counterView = findViewById(R.id.counter);

        final FullViewImageAdapter fullScreenImageAdapter = new FullViewImageAdapter(this, urls);
        viewPager.setAdapter(fullScreenImageAdapter);
        viewPager.setCurrentItem(position);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float positionOffset, int positionOffsetPixels) {
                pos = i + 1;
                counterView.setText(""+pos+"/"+urls.size());
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    public void close(View view) {
        finish();
    }


}
