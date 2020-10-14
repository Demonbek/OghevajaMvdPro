/*
 * *
 *  * Created by DemonApps on 26.08.20 12:34
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 24.08.20 18:38
 *
 */

package ru.demonapps.ognevajamvdpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Ocenka extends AppCompatActivity implements View.OnClickListener {
    Button btnOcenka, btnOshibki;
    TextView textOcenka, textOshibki, textKolOsh;
    ImageView imageOcenka;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocenka);
        Intent intent = getIntent();
        int verno = intent.getIntExtra("verno",0);
        String oshibki = intent.getStringExtra("oshibki");
        textOcenka = findViewById(R.id.textOcenka);
        textOshibki = findViewById(R.id.textOshibki);
        textKolOsh = findViewById(R.id.textKolOsh);
        imageOcenka = findViewById(R.id.imageOcenka);
        btnOcenka = findViewById(R.id.btnOcenka);
        btnOcenka.setOnClickListener(this);
        btnOshibki = findViewById(R.id.btnOshibki);
        btnOshibki.setOnClickListener(this);
        textKolOsh.setText("У Вас: "+(20-verno)+" ошибок.");
        textOshibki.setText(oshibki);
        if (verno<16){
            imageOcenka.setImageResource(R.drawable.ne_zachet);
            textKolOsh.setBackgroundColor(Color.parseColor("#CDE53935"));
        }
        else{
            imageOcenka.setImageResource(R.drawable.zachet);
            textKolOsh.setBackgroundColor(Color.parseColor("#CB43A047"));
        }
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())  {
            case  R.id.btnOcenka: // идентификатор "@+id/button1"
                textOshibki.setVisibility(View.GONE);
                imageOcenka.setVisibility(View.VISIBLE);
                textOcenka.setText(R.string.ocenka);
                break;
            case  R.id.btnOshibki: // идентификатор "@+id/button1"
                textOshibki.setVisibility(View.VISIBLE);
                imageOcenka.setVisibility(View.GONE);
                textOcenka.setText(R.string.oshibki);
                break;
            default:
                break;
        }

    }

}