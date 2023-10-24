package com.luis.proyectoaplicacionmovil;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PedidossAdapterr  extends RecyclerView.Adapter<PedidossAdapterr.MyViewHolder> {

    List<Pedidoss> pList;
    Context context;

    public PedidossAdapterr(List<Pedidoss> pList, Context context) {
        this.pList = pList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_rv_pedidos,parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.nroPedido_text.setText(pList.get(position).getNropedido());
        holder.evento_text.setText(pList.get(position).getEvento());

    }

    @Override
    public int getItemCount() {
        return pList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nroPedido_text;
        TextView evento_text;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nroPedido_text = itemView.findViewById(R.id.NroPedido_text);
            evento_text = itemView.findViewById(R.id.Evento_text);
        }
    }
}
