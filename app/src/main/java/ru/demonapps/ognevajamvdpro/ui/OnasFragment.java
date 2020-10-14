/*
 * *
 *  * Created by DemonApps on 26.08.20 12:48
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 26.08.20 12:48
 *
 */

package ru.demonapps.ognevajamvdpro.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import ru.demonapps.ognevajamvdpro.BuildConfig;
import ru.demonapps.ognevajamvdpro.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class OnasFragment extends Fragment implements View.OnClickListener {
Button buttonPK;
    public OnasFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_onas, container, false);
        TextView textView4 =root.findViewById(R.id.textView4);
        textView4.setText("Версия: " + BuildConfig.VERSION_NAME);
        buttonPK = root.findViewById(R.id.buttonPK);
        buttonPK.setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View v) {
        Intent intent7 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://demonbek.github.io/privacypolicy/privacypolicyognevajapro.html"));
        startActivity(intent7);
    }
}