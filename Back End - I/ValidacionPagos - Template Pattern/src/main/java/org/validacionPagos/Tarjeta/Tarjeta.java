package org.validacionPagos.Tarjeta;

import org.w3c.dom.ls.LSOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Tarjeta{
    int digitosFrente;
    int codigoSeguridad;
    int mesExpiracion;
    int anioExpiracion;
    private double montoCompra;
    double saldoFinal;

    public Tarjeta(int digitosFrente, int codigoSeguridad, int mesExpiracion, int anioExpiracion, double montoCompra) {
        this.digitosFrente = digitosFrente;
        this.codigoSeguridad = codigoSeguridad;
        this.mesExpiracion = mesExpiracion;
        this.anioExpiracion = anioExpiracion;
        this.montoCompra = montoCompra;
    }

    public abstract void procesarPago();
    public boolean validarFechaExpiracion(){
        LocalDate fechaActual = LocalDate.now();

        if (this.getAnioExpiracion() >= fechaActual.getYear())
        {
            if (this.getMesExpiracion() >= fechaActual.getMonthValue())
            {
                System.out.println("Tarjeta válida");
                return true;
            }
        }
        System.out.println("Tarjeta expirada.");
        return false;
    }

    public int getMesExpiracion() {
        return mesExpiracion;
    }

    public int getAnioExpiracion() {
        return anioExpiracion;
    }

    public double getMontoCompra() {
        return montoCompra;
    }

    public double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public void setMontoCompra(double montoCompra) {
        this.montoCompra = montoCompra;
    }
}