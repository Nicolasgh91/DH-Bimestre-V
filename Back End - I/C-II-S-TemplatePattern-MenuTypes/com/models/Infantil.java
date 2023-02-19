package com.models;

public class Infantil extends Menu {
    static int cantidadJuguetes;
    static int precioJuguete;

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

    public static int getCantidadJuguetes() {
        return cantidadJuguetes;
    }

    public static int getPrecioJuguete() {
        return precioJuguete;
    }

    public void setPrecioJuguete(int precioJuguete) {
        this.precioJuguete = precioJuguete;
    }


}