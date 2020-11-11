package com.example.basiclab;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import androidx.navigation.fragment.NavHostFragment;

public class FirstFragment extends Fragment {


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        Aplikacja.frag1=this;
// Inflate the layout for this fragment
        // wypełnienie tego fragmentu
        return inflater.inflate(R.layout.fragment_first, container, false);

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



       view.setBackgroundColor(Aplikacja.zwrocKolor1());
        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);

            }
        });

        view.findViewById(R.id.btnPrev).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_thirdFragment);
            }
        });


    }

    @Override
    public void onStart() {
       // System.out.println("\nOn start");
       // System.out.println("\nKolor pobrany "+Aplikacja.zwrocKolor1());
        super.onStart();

    }

    @Override
    public void onPause() {
        //System.out.println("\nOnPause");
        //System.out.println("\nKolor pobrany "+Aplikacja.zwrocKolor1());
        super.onPause();
    }

    @Override
    public void onDestroy() {
       // System.out.println("\nDestroy");
        super.onDestroy();
    }


}