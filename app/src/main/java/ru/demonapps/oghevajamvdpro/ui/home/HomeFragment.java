package ru.demonapps.oghevajamvdpro.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import  java.util.Random;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import ru.demonapps.oghevajamvdpro.Bilet;
import ru.demonapps.oghevajamvdpro.MainActivity;
import ru.demonapps.oghevajamvdpro.R;

public class HomeFragment extends Fragment implements View.OnClickListener {
    Button bdn, bup, button3, brnd;
    TextView textView2;
    int bilet;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        bdn = root.findViewById(R.id.bdn);
        bdn.setOnClickListener(this);
        bup = root.findViewById(R.id.bup);
        bup.setOnClickListener(this);
        button3 = root.findViewById(R.id.button3);
        button3.setOnClickListener(this);
        brnd = root.findViewById(R.id.brnd);
        brnd.setOnClickListener(this);
        bilet = 1;
        textView2 = root.findViewById(R.id.textView2);
        textView2.setText (Integer. toString(bilet));
        return root;

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.bdn:
                if (bilet==1){
                    bilet=10;
                }
                else {
                    bilet=bilet-1;
                }
                textView2.setText (Integer. toString(bilet));
                break;
            case R.id.bup:
                if (bilet==10){
                    bilet=1;
                }
                else {
                    bilet=bilet+1;
                }
                textView2.setText (Integer. toString(bilet));
                break;
            case R.id.button3:
                Intent intent = new Intent(getActivity(), Bilet.class);
                intent.putExtra("bilet", bilet);
                startActivity(intent);
                break;
            case R.id.brnd:
                Random random = new Random();
                bilet = random.nextInt(10) + 1;
                Intent intent2 = new Intent(getActivity(), Bilet.class);
                intent2.putExtra("bilet", bilet);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}