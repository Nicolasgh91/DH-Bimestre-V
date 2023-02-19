package com.dh.template.service;

import com.dh.template.Vendedor;

public class Afiliado extends Vendedor {

    public Afiliado(String nombre, int totalPuntos, int aniosAntiguedad) {
        super(nombre, totalPuntos, aniosAntiguedad);
    }

    @Override
    public void vender() {
        this.setTotalPuntos(this.getTotalPuntos() + 15);
        System.out.println("Felicitaciones! Por cada venta sumas 15 puntos. Tu nuevo puntaje es: " + getTotalPuntos());
    }
}
