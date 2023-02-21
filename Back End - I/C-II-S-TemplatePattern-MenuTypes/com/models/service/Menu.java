package com.models.service;

public abstract class Menu {
    private  double precioBase;
    private int tipoDeMenu;

    public Menu(double precioBase) {

        this.precioBase = precioBase;
    }

    public double getPrecioBase() {

        return precioBase;
    }

    public void setPrecioBase(double precioBase) {

        this.precioBase = precioBase;
    }

    public abstract void calcularPrecioFinal();

}
