package org.validacionPagos.Tarjeta.Models;

import org.validacionPagos.Tarjeta.Tarjeta;

import java.time.LocalDateTime;
import java.util.Date;

public class TarjetaCredito extends Tarjeta {
    private int limiteCompra;
    private double creditoDisponible;

    public TarjetaCredito(int digitosDorso, int codigoSeguridad, int mesExpiracion, int anioExpiracion, double montoCompra, int limiteCompra, double creditoDisponible) {
        super(digitosDorso, codigoSeguridad, mesExpiracion, anioExpiracion, montoCompra);
        this.limiteCompra = limiteCompra;
        this.creditoDisponible = creditoDisponible;
    }

    @Override
    public void procesarPago() {

        if (validarFechaExpiracion())
        {
            if (getMontoCompra() <= getLimiteCompra() + getCreditoDisponible() )
            {
                setCreditoDisponible(getLimiteCompra() - getMontoCompra());
                System.out.println("Operación exitosa, su credito disponible es: " + getCreditoDisponible());
            } else
            {
                System.out.println("Saldo insuficiente.");
                throw new RuntimeException();
            }
        }
         else
        {
            System.out.println("Tarjeta expirada" + validarFechaExpiracion());
            throw new RuntimeException();
        }
    }

    public int getLimiteCompra() {
        return limiteCompra;
    }

    public void setLimiteCompra(int limiteCompra) {
        this.limiteCompra = limiteCompra;
    }

    public double getCreditoDisponible() {
        return creditoDisponible;
    }

    public void setCreditoDisponible(double creditoDisponible) {
        this.creditoDisponible = creditoDisponible;
    }
}