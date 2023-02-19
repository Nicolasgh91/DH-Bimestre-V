package com.models;

public class Vegetariano extends Menu {
    double precioEspecias;
    static boolean tieneEspecias;
    static int precioSalsaVegetariana;
    static int cantidadSalsasVegetarianas;

    public Vegetariano(double precioBase, boolean tieneEspecias, int cantidadSalsasVegetarianas) {
        super(precioBase);
        this.tieneEspecias = tieneEspecias;
        this.cantidadSalsasVegetarianas = cantidadSalsasVegetarianas;
    }

    @Override
    public void calcularPrecioFinal() {
        precioSalsaVegetariana = 2;
        precioEspecias = 1.01 * getPrecioBase();
        double resultado = getPrecioBase();

        if (tieneEspecias)
        {
            resultado = precioEspecias;
        }

        if (cantidadSalsasVegetarianas > 0)
        {
             resultado += cantidadSalsasVegetarianas * precioSalsaVegetariana;
        }
        System.out.println("El precio final de su menú es: " + resultado);
    }

    public static boolean isTieneEspecias() {
        return tieneEspecias;
    }

    public double getPrecioEspecias() {
        return precioEspecias;
    }

    public void setPrecioEspecias(double precioEspecias) {
        this.precioEspecias = precioEspecias;
    }

    public static int getPrecioSalsaVegetariana() {
        return precioSalsaVegetariana;
    }

    public void setPrecioSalsaVegetariana(int precioSalsaVegetariana) {
        this.precioSalsaVegetariana = precioSalsaVegetariana;
    }

    public void setTieneEspecias(boolean tieneEspecias) {
        this.tieneEspecias = tieneEspecias;
    }

    public static int getCantidadSalsasVegetarianas() {
        return cantidadSalsasVegetarianas;
    }

    public void setCantidadSalsasVegetarianas(int cantidadSalsasVegetarianas) {
        this.cantidadSalsasVegetarianas = cantidadSalsasVegetarianas;
    }
}