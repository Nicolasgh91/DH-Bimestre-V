package com.models.service;

import com.models.service.Empleado;
import com.models.service.impl.Clasico;
import com.models.service.impl.Infantil;
import com.models.service.Menu;
import com.models.service.impl.Vegetariano;

public class EmpleadoTest {

    public static void main(String[] args) {


       Menu menuClasico = new Clasico(200);
       Menu menuVegetariano = new Vegetariano(250,true,4);
       Menu menuInfantil = new Infantil(150,2);




        Empleado empleado = new Empleado(300);
        empleado.getOpcionCliente();
    }
}
