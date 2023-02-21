package com.models.service.impl;

import com.models.service.Menu;

public class Infantil extends Menu {
    private int cantidadJuguetes;
    private int precioJuguete;

    public Infantil(double precioBase, int cantidadJuguetes) {
        super(precioBase);
        this.cantidadJuguetes = cantidadJuguetes;
    }

    @Override
    public void calcularPrecioFinal() {
        precioJuguete = 3;
        int resultado;

        if (cantidadJuguetes == 0)
        {
            System.out.println(getPrecioBase());
        }

        if (cantidadJuguetes > 0)
        {
            resultado = (int) (getPrecioBase() + (precioJuguete * cantidadJuguetes));
            System.out.println("El precio final es: " + resultado);
        }
    }

    public int getCantidadJuguetes() {

        return this.cantidadJuguetes;
    }

    public int getPrecioJuguete() {

        return this.precioJuguete;
    }

    public void setPrecioJuguete(int precioJuguete) {
        this.precioJuguete = precioJuguete;
    }


}