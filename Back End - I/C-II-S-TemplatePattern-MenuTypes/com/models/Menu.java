package com.models;

public abstract class Menu {
    double precioBase;
    int tipoDeMenu;

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
