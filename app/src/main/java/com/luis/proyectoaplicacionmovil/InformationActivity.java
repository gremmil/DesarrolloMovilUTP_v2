package com.luis.proyectoaplicacionmovil;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.luis.proyectoaplicacionmovil.databinding.FragmentFinalizadosBinding;
import com.luis.proyectoaplicacionmovil.models.Pedido;
import com.luis.proyectoaplicacionmovil.models.PedidosAdapter;

import java.util.ArrayList;
import java.util.List;


public class InformationActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Pedidoss> pList;
    PedidossAdapterr pedidossAdapterr;
    //
    List<Pedido> listaPedido = new ArrayList<>();
    PedidosAdapter pedidosAdapter = new PedidosAdapter(listaPedido);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        assert getSupportActionBar() != null;
        TextView textView = new TextView(this);
        textView.setText("Informacion del Pedido N° xxxxxx");
        textView.setTextSize(18);
        textView.setTextColor(ContextCompat.getColor(this, R.color.md_text_color));
        textView.setGravity(Gravity.LEFT);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(textView);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button btn = findViewById(R.id.button_test);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InformationActivity.this, ManagementActivity.class);
                startActivity(intent);
            }
        });

        pList = new ArrayList<>();
        pList.add(new Pedidoss("2222222","FUERE DE ARE"));
        pList.add(new Pedidoss("2222222","FUERE DE ARE"));
        pList.add(new Pedidoss("2222222","FUERE DE ARE"));

        recyclerView = findViewById(R.id.recycler_finalizados);
        pedidossAdapterr = new PedidossAdapterr(pList, this);
        recyclerView.setAdapter(pedidossAdapterr);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}