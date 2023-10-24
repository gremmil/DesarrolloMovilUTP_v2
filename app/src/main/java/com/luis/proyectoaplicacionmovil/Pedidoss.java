package com.luis.proyectoaplicacionmovil;

public class Pedidoss {

    private String Nropedido;
    private String evento;

    public Pedidoss(String nropedido, String evento) {
        this.Nropedido = nropedido;
        this.evento = evento;
    }

    public String getNropedido() {
        return Nropedido;
    }

    public String getEvento() {
        return evento;
    }

    public void setNropedido(String nropedido) {
        Nropedido = nropedido;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }
}
