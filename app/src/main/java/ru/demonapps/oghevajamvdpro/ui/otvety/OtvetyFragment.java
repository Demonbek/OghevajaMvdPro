package ru.demonapps.oghevajamvdpro.ui.otvety;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import ru.demonapps.oghevajamvdpro.R;

public class OtvetyFragment extends Fragment {
    TextView textOtvety,textNbileta;
    String[] bilet, otvet;
    private OtvetyViewModel otvetyViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        otvetyViewModel =
                ViewModelProviders.of(this).get(OtvetyViewModel.class);
        setHasOptionsMenu(true);
        View root = inflater.inflate(R.layout.fragment_otvety, container, false);
        textOtvety = root.findViewById(R.id.textOtvety);
        textNbileta = root.findViewById(R.id.textNbileta);
        bilet = getResources().getStringArray(R.array.bilet1);
        otvet = getResources().getStringArray(R.array.otvet1);
        textNbileta.setText("Билет 1");
        VivodBiletaSOtvetom();
        return root;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.otvety_menu, menu);
    }
    @SuppressLint("SetTextI18n")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.bilet1:
                bilet = getResources().getStringArray(R.array.bilet1);
                otvet = getResources().getStringArray(R.array.otvet1);
                textNbileta.setText("Билет 1");
                VivodBiletaSOtvetom();
                return true;
            case R.id.bilet2:
                bilet = getResources().getStringArray(R.array.bilet2);
                otvet = getResources().getStringArray(R.array.otvet2);
                textNbileta.setText("Билет 2");
                VivodBiletaSOtvetom();
                return true;
            case R.id.bilet3:
                bilet = getResources().getStringArray(R.array.bilet3);
                otvet = getResources().getStringArray(R.array.otvet3);
                textNbileta.setText("Билет 3");
                VivodBiletaSOtvetom();
                return true;
            case R.id.bilet4:
                bilet = getResources().getStringArray(R.array.bilet4);
                otvet = getResources().getStringArray(R.array.otvet4);
                textNbileta.setText("Билет 4");
                VivodBiletaSOtvetom();
                return true;
            case R.id.bilet5:
                bilet = getResources().getStringArray(R.array.bilet5);
                otvet = getResources().getStringArray(R.array.otvet5);
                textNbileta.setText("Билет 5");
                VivodBiletaSOtvetom();
                return true;
            case R.id.bilet6:
                bilet = getResources().getStringArray(R.array.bilet6);
                otvet = getResources().getStringArray(R.array.otvet6);
                textNbileta.setText("Билет 6");
                VivodBiletaSOtvetom();
                return true;
            case R.id.bilet7:
                bilet = getResources().getStringArray(R.array.bilet7);
                otvet = getResources().getStringArray(R.array.otvet7);
                textNbileta.setText("Билет 7");
                VivodBiletaSOtvetom();
                return true;
            case R.id.bilet8:
                bilet = getResources().getStringArray(R.array.bilet8);
                otvet = getResources().getStringArray(R.array.otvet8);
                textNbileta.setText("Билет 8");
                VivodBiletaSOtvetom();
                return true;
            case R.id.bilet9:
                bilet = getResources().getStringArray(R.array.bilet9);
                otvet = getResources().getStringArray(R.array.otvet9);
                textNbileta.setText("Билет 9");
                VivodBiletaSOtvetom();
                return true;
            case R.id.bilet10:
                bilet = getResources().getStringArray(R.array.bilet10);
                otvet = getResources().getStringArray(R.array.otvet10);
                textNbileta.setText("Билет 10");
                VivodBiletaSOtvetom();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void VivodBiletaSOtvetom(){
        textOtvety.setText("");
        for(int i = 0; i < bilet.length; i++) {
            textOtvety.append(bilet[i] + "\n\n!!! Правильный ответ: "+otvet[i]+" !!!\n\n");
        }

    }
}