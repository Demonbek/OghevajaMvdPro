package ru.demonapps.oghevajamvdpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Ocenka extends AppCompatActivity implements View.OnClickListener {
    Button btnOcenka, btnOshibki;
    TextView textOcenka, textOshibki;
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
        imageOcenka = findViewById(R.id.imageOcenka);
        btnOcenka = findViewById(R.id.btnOcenka);
        btnOcenka.setOnClickListener(this);
        btnOshibki = findViewById(R.id.btnOshibki);
        btnOshibki.setOnClickListener(this);
        textOshibki.setText(oshibki);
        ImageView ocenka = findViewById(R.id.imageOcenka);
        if (verno<16){
            ocenka.setImageResource(R.drawable.ne_zachet);
        }
        else{
            ocenka.setImageResource(R.drawable.zachet);
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