package com.luis.proyectoaplicacionmovil;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luis.proyectoaplicacionmovil.databinding.FragmentFinalizadosBinding;
import com.luis.proyectoaplicacionmovil.models.Pedido;
import com.luis.proyectoaplicacionmovil.models.PedidosAdapter;

import java.util.ArrayList;
import java.util.List;


public class FinalizadosFragment extends Fragment {

    //
    //private RecyclerView recyclerView;
    private ArrayList<Pedido> pedir;

    View v;
    RecyclerView recyclerView;
    List<Pedidoss> pList;
    PedidossAdapterr pedidossAdapterr;
    //
    FragmentFinalizadosBinding binding;
    List<Pedido> listaPedido = new ArrayList<>();
    PedidosAdapter pedidosAdapter = new PedidosAdapter(listaPedido);


    public FinalizadosFragment() {
        // Required empty public constructor
    }


    public static FinalizadosFragment newInstance(String param1, String param2) {
        FinalizadosFragment fragment = new FinalizadosFragment();

        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pList = new ArrayList<>();
        pList.add(new Pedidoss("2222222","FUERE DE ARE"));
        pList.add(new Pedidoss("2222222","FUERE DE ARE"));
        pList.add(new Pedidoss("2222222","FUERE DE ARE"));




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFinalizadosBinding.inflate(getLayoutInflater());


         v  =inflater.inflate(R.layout.fragment_finalizados, container, false);
         recyclerView=v.findViewById(R.id.recycler_finalizados);
         pedidossAdapterr = new PedidossAdapterr(pList,getContext());
         recyclerView.setAdapter(pedidossAdapterr);
         recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

         return v;
    }


    private void setupRecyclerView(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.recyclerFinalizados.setLayoutManager(layoutManager);
        pedidosAdapter = new PedidosAdapter(listaPedido);
        binding.recyclerFinalizados.setAdapter(pedidosAdapter);
    }
}