package com.dh.template.service;

import com.dh.template.Vendedor;

public class Pasante extends Vendedor {

    public Pasante(String nombre, int totalPuntos, int aniosAntiguedad) {
        super(nombre, totalPuntos, aniosAntiguedad);
    }

    @Override
    public void vender() {
        setTotalPuntos(getTotalPuntos() + 5);
        System.out.println("Felicitaciones por la venta, tu nuevo puntaje es: " + getTotalPuntos());
    }

    @Override
    public void mostrarCategoria() {
       if (getTotalPuntos() < 50){
           setCategoria("Pasante novato.");
       } else {
           setCategoria("Pasante experimentado.");
       }
        System.out.println("Felicitaciones! Tu nueva categoría es: " + this.getCategoria());
    }
}
