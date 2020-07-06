package com.haseeb.ugimageviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.haseeb.ugimageview.Helper.UGImageViewer;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void open(View view) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("https://firebasestorage.googleapis.com/v0/b/congo-achat.appspot.com/o/ADS%20Images%2F4d61328d-3889-48cd-bae2-3b8a2a31505b.jpg?alt=media&token=49089888-9489-4ce5-ba6d-a29ac2c87fbf");
        arrayList.add("https://firebasestorage.googleapis.com/v0/b/congo-achat.appspot.com/o/ADS%20Images%2Ffb1263f3-81e3-4097-8de0-abbde00a610f.jpg?alt=media&token=a9fd4724-eec2-4031-8f17-a5b31e036cf7");

        UGImageViewer.Builder(this, arrayList,0).show();
    }
}
