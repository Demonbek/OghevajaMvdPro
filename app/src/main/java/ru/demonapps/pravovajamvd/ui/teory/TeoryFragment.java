/*
 * *
 *  * Created by DemonApps on 26.08.20 12:34
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 24.08.20 22:12
 *
 */

package ru.demonapps.pravovajamvd.ui.teory;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import ru.demonapps.pravovajamvd.R;

public class TeoryFragment extends Fragment {
    WebView teoryWeb;
    private TeoryViewModel teoryViewModel;
    String url = "file:///android_asset/teory/Prikaz880.html";
    @SuppressLint("SetJavaScriptEnabled")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        teoryViewModel =
                ViewModelProviders.of(this).get(TeoryViewModel.class);
        setHasOptionsMenu(true);
        View root = inflater.inflate(R.layout.fragment_teory, container, false);
        teoryWeb = root.findViewById(R.id.teoryWeb);
        teoryWeb.getSettings().setJavaScriptEnabled(true);
        teoryWeb.getSettings().setUseWideViewPort(true);
        teoryWeb.getSettings().setLoadWithOverviewMode(true);
        teoryWeb.loadUrl(url);
        return root;
    }
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.teory_menu, menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_prikaz880:
                teoryWeb.loadUrl("file:///android_asset/teory/Prikaz880.html");
                return true;
            case R.id.action_glava5:
                teoryWeb.loadUrl("file:///android_asset/teory/Glava5FZ3.html");
                return true;
            case R.id.action_tth:
                teoryWeb.loadUrl("file:///android_asset/teory/TthPm.html");
                return true;
            case R.id.action_tthaks:
                teoryWeb.loadUrl("file:///android_asset/teory/TthAks74u.html");
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}