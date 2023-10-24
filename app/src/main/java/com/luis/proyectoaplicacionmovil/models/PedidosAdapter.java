package com.luis.proyectoaplicacionmovil.models;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.luis.proyectoaplicacionmovil.R;

import java.util.List;
//djijwiejweiwjeiwjeweiwjiewjiejwiewjie
public class PedidosAdapter extends RecyclerView.Adapter<PedidosAdapter.ViewHolder> {

    List<Pedido> listaPedidos;

    public PedidosAdapter(List<Pedido> listaPedidos){
        this.listaPedidos = listaPedidos;
    }
    @NonNull
    @Override
    public PedidosAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_pedidos, parent,false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull PedidosAdapter.ViewHolder holder, int position) {
        Pedido pedido = listaPedidos.get(position);

        holder.nroPedido_text.setText(pedido.nroPedido.toUpperCase());
        holder.evento_text.setText(pedido.eventPedido.toUpperCase());



    }

    @Override
    public int getItemCount() {
        return listaPedidos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nroPedido_text, evento_text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nroPedido_text = itemView.findViewById(R.id.NroPedido_text);
            evento_text = itemView.findViewById(R.id.Evento_text);

        }
    }
}
