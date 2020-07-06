package com.haseeb.ugimageview.Helper;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import com.haseeb.ugimageview.FullViewActivity;

import java.net.URI;
import java.util.ArrayList;

public class UGImageViewer {

    private static Context context;
    private static ArrayList<String> imageList;
    private static ArrayList<Uri> imgList;
    private static int pos;
    private static final UGImageViewer instance = new UGImageViewer();

    public UGImageViewer(Context context, ArrayList<String> arrayList) {
        this.context = context;
        this.imageList = arrayList;
    }

    public UGImageViewer() {
    }

    public static UGImageViewer Builder(Context ctx, ArrayList<String> arrayList) {
        context = ctx;
        imageList = arrayList;
        return instance;
    }

    public static UGImageViewer Builder(Context ctx, ArrayList<Uri> arrayList, boolean isURI) {
        context = ctx;
        imgList = arrayList;
        return instance;
    }

    public static UGImageViewer Builder(Context ctx, ArrayList<Uri> arrayList, boolean isURI, int position) {
        context = ctx;
        imgList = arrayList;
        pos = position;
        return instance;
    }

    public static UGImageViewer Builder(Context ctx, ArrayList<String> arrayList, int position) {
        context = ctx;
        imageList = arrayList;
        pos = position;
        return instance;
    }

    public void show() {
        Intent intent = new Intent(context, FullViewActivity.class);
        intent.putExtra("position", pos);
        intent.putExtra("urls", (ArrayList<String>) imageList);
        context.startActivity(intent);
    }
}
