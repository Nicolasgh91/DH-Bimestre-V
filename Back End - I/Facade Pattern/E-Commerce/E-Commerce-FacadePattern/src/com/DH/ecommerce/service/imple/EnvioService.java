package com.DH.ecommerce.service.imple;
// Subsystem

import com.DH.ecommerce.model.Direccion;
import com.DH.ecommerce.model.Producto;

public class EnvioService {

    public void procesarEnvio(Producto producto, Direccion direccion){

        System.out.println("Enviando producto a " + direccion.getCalle() + " " + direccion.getNro() + "," + direccion.getBarrio());

    }
}
