package ru.demonapps.oghevajamvdpro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Bilet extends AppCompatActivity {
    String[] bilet;
    TextView textString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilet);
        textString = findViewById(R.id.textString);
        int number = getIntent().getExtras().getInt("bilet");
        if(number==1){
           bilet = getResources().getStringArray(R.array.bilet1);
        }
        if(number==2){
             bilet = getResources().getStringArray(R.array.bilet2);
        }
        if(number==3){
             bilet = getResources().getStringArray(R.array.bilet3);
        }
        if(number==4){
             bilet = getResources().getStringArray(R.array.bilet4);
        }
        if(number==5){
             bilet = getResources().getStringArray(R.array.bilet5);
        }
        if(number==6){
             bilet = getResources().getStringArray(R.array.bilet6);
        }
        if(number==7){
             bilet = getResources().getStringArray(R.array.bilet7);
        }
        if(number==8){
             bilet = getResources().getStringArray(R.array.bilet8);
        }
        if(number==9){
             bilet = getResources().getStringArray(R.array.bilet9);
        }
        if(number==10){
             bilet = getResources().getStringArray(R.array.bilet10);
        }
        for(int i = 0; i < bilet.length; i++) {
            textString.append("Name[" + i + "]: "+ bilet[i] + "\n");
        }

    }
}