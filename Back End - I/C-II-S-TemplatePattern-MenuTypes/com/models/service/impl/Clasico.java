package com.models.service.impl;

import com.models.service.Menu;

public class Clasico extends Menu {
    public Clasico(double precioBase) {

        super(precioBase);
    }

    @Override
    public void calcularPrecioFinal() {

        System.out.println("El precio final de su menú es: " + getPrecioBase());
    }
}
