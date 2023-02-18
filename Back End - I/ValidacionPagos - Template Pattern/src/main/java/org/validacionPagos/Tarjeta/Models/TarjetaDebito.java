package org.validacionPagos.Tarjeta.Models;

import org.validacionPagos.Tarjeta.Tarjeta;

public class TarjetaDebito extends Tarjeta {
    private double saldoDisponible;

    public TarjetaDebito(int digitosDorso, int codigoSeguridad, int mesExpiracion, int anioExpiracion, double montoCompra, double saldoDisponible) {
        super(digitosDorso, codigoSeguridad, mesExpiracion, anioExpiracion, montoCompra);
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public void procesarPago() {

        if (getSaldoDisponible() >= this.getMontoCompra() && validarFechaExpiracion())
        {
            setSaldoDisponible(getSaldoDisponible() - this.getMontoCompra());
            System.out.println("Operación exitosa, su saldo restante es: " + saldoDisponible);
        } else
        {
            if (getSaldoDisponible() < getMontoCompra())
            {
                System.out.println("Saldo insuficiente para realizar la operación.");
                System.out.println(getSaldoDisponible());
            } else
            {
                throw new RuntimeException();
            }

        }
    }

    public double getSaldoDisponible() {

        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {

        this.saldoDisponible = saldoDisponible;
    }
}
