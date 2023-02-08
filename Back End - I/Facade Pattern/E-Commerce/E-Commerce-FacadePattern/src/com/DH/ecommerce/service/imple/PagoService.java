package com.DH.ecommerce.service.imple;
// Subsystem

import com.DH.ecommerce.model.Tarjeta;

public class PagoService {

    public boolean procesarPago(Tarjeta tarjeta, double montoACobrar){
        Boolean pagoRealizado = Boolean.FALSE;

        if(tarjeta != null && tarjeta.getNumerosFrente() != null && tarjeta.getCodSeguridad() != null){
            System.out.println("Procesando el pago por " + montoACobrar);
            pagoRealizado = true;

            return pagoRealizado;
        }
    }
}
