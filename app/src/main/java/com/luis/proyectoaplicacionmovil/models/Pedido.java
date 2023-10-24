package com.luis.proyectoaplicacionmovil.models;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "pedidos")
public class Pedido {
    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "nro_pedido")
    public String nroPedido;
    @ColumnInfo(name = "evento_pedido")
    public String eventPedido;
    @ColumnInfo(name = "empresa_pedido")
    public String empresaPedido;

    public Pedido(@NonNull String nroPedido, String eventPedido, String empresaPedido) {
        this.nroPedido = nroPedido;
        this.eventPedido = eventPedido;
        this.empresaPedido = empresaPedido;
    }
}
