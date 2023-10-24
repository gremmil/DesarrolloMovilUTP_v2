package com.luis.proyectoaplicacionmovil;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class GestionFragment extends Fragment {



    public GestionFragment() {
        // Required empty public constructor
    }


    public static GestionFragment newInstance(String param1, String param2) {
        GestionFragment fragment = new GestionFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gestion, container, false);
    }
}