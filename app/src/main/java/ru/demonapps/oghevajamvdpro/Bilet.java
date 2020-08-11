package ru.demonapps.oghevajamvdpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Bilet extends AppCompatActivity {
    String[] bilet, otvet;
    String youOtvet;
    TextView textString;
    Button btnA, btnB, btnV, btnG;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilet);
        textString = findViewById(R.id.textString);
        int number = getIntent().getExtras().getInt("bilet");
        if(number==1){
           bilet = getResources().getStringArray(R.array.bilet1);
           otvet = getResources().getStringArray(R.array.otvet1);
        }
        if(number==2){
             bilet = getResources().getStringArray(R.array.bilet2);
            otvet = getResources().getStringArray(R.array.otvet2);
        }
        if(number==3){
             bilet = getResources().getStringArray(R.array.bilet3);
            otvet = getResources().getStringArray(R.array.otvet3);
        }
        if(number==4){
             bilet = getResources().getStringArray(R.array.bilet4);
            otvet = getResources().getStringArray(R.array.otvet4);
        }
        if(number==5){
             bilet = getResources().getStringArray(R.array.bilet5);
            otvet = getResources().getStringArray(R.array.otvet5);
        }
        if(number==6){
             bilet = getResources().getStringArray(R.array.bilet6);
            otvet = getResources().getStringArray(R.array.otvet6);
        }
        if(number==7){
             bilet = getResources().getStringArray(R.array.bilet7);
            otvet = getResources().getStringArray(R.array.otvet7);
        }
        if(number==8){
             bilet = getResources().getStringArray(R.array.bilet8);
            otvet = getResources().getStringArray(R.array.otvet8);
        }
        if(number==9){
             bilet = getResources().getStringArray(R.array.bilet9);
            otvet = getResources().getStringArray(R.array.otvet9);
        }
        if(number==10){
             bilet = getResources().getStringArray(R.array.bilet10);
            otvet = getResources().getStringArray(R.array.otvet10);
        }
        btnA = findViewById(R.id.btnA);
        btnB = findViewById(R.id.btvB);
        btnV = findViewById(R.id.btnV);
        btnG = findViewById(R.id.btnG);
        i=0;
        textString.setText(bilet[i]);
        btnA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i++;
                if(i < bilet.length){
                    textString.setText(bilet[i]);
                       // Do some processing
                }
                else{

                }
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i++;
                if(i < bilet.length){
                    textString.setText(bilet[i]);
                       // Do some processing
                }
                else{

                }
            }
        });

        btnV.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i++;
                if(i < bilet.length){
                    textString.setText(bilet[i]);
                      // Do some processing
                }
                else{

                }
            }
        });

        btnG.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i++;
                if(i < bilet.length){
                    textString.setText(bilet[i]);
                       // Do some processing
                }
                else{

                }
            }
        });
    }

}