package com.dh.template;

import com.dh.template.service.Pasante;

public abstract class Vendedor {
    String nombre;
    int totalPuntos;
    String categoria;
    int aniosAntiguedad;
    int puntosPorAnioAntiguedad = 5;

    public Vendedor(String nombre, int totalPuntos, int aniosAntiguedad) {
        this.nombre = nombre;
        this.totalPuntos = totalPuntos;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public void mostrarCategoria(){

            int puntaje = this.getTotalPuntos();

            if (puntaje > 0 && puntaje < 20)
            {
                setCategoria("Novato");
            } else if (puntaje < 31)
            {
                setCategoria("Aprendiz");
            } else if (puntaje < 41) {
                setCategoria("Bueno");
            } else
            {
                setCategoria("Maestro");
            }

            System.out.println("Felicitaciones! Tu nueva categoría es: " + this.getCategoria());
    }

    public abstract void vender();

    public int getTotalPuntos() {
        return this.totalPuntos;
    }

    public void setTotalPuntos(int totalPuntos) {
        this.totalPuntos = totalPuntos;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public int getPuntosPorAnioAntiguedad() {
        return puntosPorAnioAntiguedad;
    }
}