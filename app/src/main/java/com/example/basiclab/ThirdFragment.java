package com.example.basiclab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class ThirdFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        Aplikacja.frag3=this;
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.setBackgroundColor(Aplikacja.zwrocKolor3());
        view.findViewById(R.id.btnNext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ThirdFragment.this)
                        .navigate(R.id.action_Third_fragment_to_First_fragment);
            }
        });

        view.findViewById(R.id.btnPrev).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NavHostFragment.findNavController(ThirdFragment.this)
                        .navigate(R.id.action_Third_fragment_to_second_fragment);
            }
        });
    }
}