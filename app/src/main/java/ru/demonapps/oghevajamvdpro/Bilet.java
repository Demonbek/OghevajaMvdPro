/*
 * *
 *  * Created by DemonApps on 26.08.20 12:34
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 25.08.20 20:37
 *
 */

package ru.demonapps.oghevajamvdpro;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Objects;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

public class Bilet extends AppCompatActivity {
    String[] bilet, otvet;
    int[] kvootvet;
    String youOtvet, oshibki;
    TextView textVopros, textVsego, textVerno;
    Button btnA, btnB, btnV, btnG;
    int i, vsego, verno;
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilet);
        textVopros = findViewById(R.id.textVopros);
        textVsego = findViewById(R.id.textVsego);
        textVerno = findViewById(R.id.textVerno);
        int number = Objects.requireNonNull(getIntent().getExtras()).getInt("bilet");
        setTitle("Билет "+number);
        if(number==1){
           bilet = getResources().getStringArray(R.array.bilet1);
           otvet = getResources().getStringArray(R.array.otvet1);
           kvootvet = getResources().getIntArray(R.array.kvootvet1);
        }
        if(number==2){
            bilet = getResources().getStringArray(R.array.bilet2);
            otvet = getResources().getStringArray(R.array.otvet2);
            kvootvet = getResources().getIntArray(R.array.kvootvet2);
        }
        if(number==3){
            bilet = getResources().getStringArray(R.array.bilet3);
            otvet = getResources().getStringArray(R.array.otvet3);
            kvootvet = getResources().getIntArray(R.array.kvootvet3);
        }
        if(number==4){
            bilet = getResources().getStringArray(R.array.bilet4);
            otvet = getResources().getStringArray(R.array.otvet4);
            kvootvet = getResources().getIntArray(R.array.kvootvet4);
        }
        if(number==5){
            bilet = getResources().getStringArray(R.array.bilet5);
            otvet = getResources().getStringArray(R.array.otvet5);
            kvootvet = getResources().getIntArray(R.array.kvootvet5);
        }
        if(number==6){
            bilet = getResources().getStringArray(R.array.bilet6);
            otvet = getResources().getStringArray(R.array.otvet6);
            kvootvet = getResources().getIntArray(R.array.kvootvet6);
        }
        if(number==7){
            bilet = getResources().getStringArray(R.array.bilet7);
            otvet = getResources().getStringArray(R.array.otvet7);
            kvootvet = getResources().getIntArray(R.array.kvootvet7);
        }
        if(number==8){
            bilet = getResources().getStringArray(R.array.bilet8);
            otvet = getResources().getStringArray(R.array.otvet8);
            kvootvet = getResources().getIntArray(R.array.kvootvet8);
        }
        if(number==9){
            bilet = getResources().getStringArray(R.array.bilet9);
            otvet = getResources().getStringArray(R.array.otvet9);
            kvootvet = getResources().getIntArray(R.array.kvootvet9);
        }
        if(number==10){
            bilet = getResources().getStringArray(R.array.bilet10);
            otvet = getResources().getStringArray(R.array.otvet10);
            kvootvet = getResources().getIntArray(R.array.kvootvet10);
        }
        btnA = findViewById(R.id.btnA);
        btnB = findViewById(R.id.btvB);
        btnV = findViewById(R.id.btnV);
        btnG = findViewById(R.id.btnG);
        i=0; vsego=0; verno=0;
        oshibki="";
        textVopros.setText(bilet[i]);
        if(kvootvet[i]==3){
            btnG.setVisibility(INVISIBLE);
        }
        else {
            btnG.setVisibility(VISIBLE);
        }
        textVerno.setText(String.valueOf(vsego));
        textVerno.setText(String.valueOf(verno));
        btnA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                youOtvet = "А";
                proverkaOtveta();
                i++;
                if(i < bilet.length){
                    textVopros.setText(bilet[i]);
                    if(kvootvet[i]==3){
                        btnG.setVisibility(INVISIBLE);
                    }
                    else {
                        btnG.setVisibility(VISIBLE);
                    }
                       // Do some processing
                }
                else{
                    vivodOcenki();
                }
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                youOtvet = "Б";
                proverkaOtveta();
                i++;

                if(i < bilet.length){
                    textVopros.setText(bilet[i]);
                    if(kvootvet[i]==3){
                        btnG.setVisibility(INVISIBLE);
                    }
                    else {
                        btnG.setVisibility(VISIBLE);
                    }
                       // Do some processing
                }
                else{
                    vivodOcenki();
                }
            }
        });

        btnV.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                youOtvet = "В";
                proverkaOtveta();
                i++;
                if(i < bilet.length){
                    textVopros.setText(bilet[i]);
                    if(kvootvet[i]==3){
                        btnG.setVisibility(INVISIBLE);
                    }
                    else {
                        btnG.setVisibility(VISIBLE);
                    }
                      // Do some processing
                }
                else{
                    vivodOcenki();
                }
            }
        });

        btnG.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                youOtvet = "Г";
                proverkaOtveta();
                i++;
                if(i < bilet.length){
                    textVopros.setText(bilet[i]);
                    if(kvootvet[i]==3){
                        btnG.setVisibility(INVISIBLE);
                    }
                    else {
                        btnG.setVisibility(VISIBLE);
                    }
                       // Do some processing
                }
                else{
                    vivodOcenki();
                }
            }
        });
    }
    public void proverkaOtveta(){
        vsego++;
     if (youOtvet.equals(otvet[i])){
      verno++;

     }
     else {
         oshibki = oshibki+bilet[i] + "\n\nПравильный ответ: "+ otvet[i]+", вы ответили: "+youOtvet+"\n\n";
     }
     textVsego.setText(String.valueOf(vsego));
     textVerno.setText(String.valueOf(verno));
    }
    public void  vivodOcenki(){
        Intent intent=new Intent(this, Ocenka.class);
        intent.putExtra("verno", verno);
        intent.putExtra("oshibki", oshibki);
        startActivity(intent);
    }
}