package com.dh.template.service;
import com.dh.template.Vendedor;

public class Empleado extends Vendedor {
    int cantidadAfiliados;

    public Empleado(String nombre, int totalPuntos, int aniosAntiguedad, int cantidadAfiliados) {
        super(nombre, totalPuntos, aniosAntiguedad);
        this.cantidadAfiliados = cantidadAfiliados;
    }

    @Override
    public void vender() {
        int puntosPorAfiliado = 10 * cantidadAfiliados;
        int puntosPorVenta = 5;

        setTotalPuntos(this.getTotalPuntos() + puntosPorAfiliado + puntosPorVenta + (getAniosAntiguedad() * getPuntosPorAnioAntiguedad()));
        System.out.println("Felicitaciones por la venta, tu nuevo puntaje es: " + getTotalPuntos());
    }

    public void conseguirAfiliado(int sumoTantosAfiliados){
        cantidadAfiliados += sumoTantosAfiliados;

        if (sumoTantosAfiliados > 1)
        {
            System.out.println("Felicitaciones por los nuevos afiliados!");
        } else {
            System.out.println("Felicitaciones por el nuevo afiliado!");
        }
    }
}
