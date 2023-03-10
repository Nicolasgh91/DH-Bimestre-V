package com.models.service;

import com.models.service.Menu;
import com.models.service.impl.Clasico;
import com.models.service.impl.Infantil;
import com.models.service.impl.Vegetariano;

import java.util.Scanner;


public class Empleado {
    Scanner scanner;
    int tipoDeMenu;
    double precioBaseMenu;

    public Empleado(double precioBaseMenu) {

        this.precioBaseMenu = precioBaseMenu;
        scanner = new Scanner(System.in);

    }

    public void getOpcionCliente(){

        System.out.println("Hola! Por favor indique el menú que desea elegir:");
        System.out.println("Opción '1' Menú clásico");
        System.out.println("Opción '2' Menú Vegetariano");
        System.out.println("Opción '3' Menú Infantil");
        tipoDeMenu = scanner.nextInt();


        if (tipoDeMenu == 1)
        {
            Menu clasico = new Clasico(precioBaseMenu);

            clasico.calcularPrecioFinal();
        }
        else if (tipoDeMenu == 2)
        {
            System.out.println("Quiere especias para su menú? Indique '1' para confirmar.");
            int opcionEspecias = scanner.nextInt();
            boolean quiereEspecias = false;

            if (opcionEspecias == 1)
            {
                quiereEspecias = true;
            }

            System.out.println("Quiere salsa? Indique la cantidad: ");
            int cantidadSalsas = scanner.nextInt();

            Menu vegetariano = new Vegetariano(precioBaseMenu,quiereEspecias,cantidadSalsas);
            vegetariano.calcularPrecioFinal();
        }
        else if (tipoDeMenu == 3)
        {
            System.out.println("Por favor indique la cantidad de Juguetes: ");
            int cantJuguetes = scanner.nextInt();

            Menu infantil = new Infantil(precioBaseMenu, cantJuguetes);
            infantil.calcularPrecioFinal();
        } else
        {
            System.out.println("Por favor indique una opción nuevamente. Las opciones son '1' para el menú clásico, " +
                    " '2' para el menú vegetariano y '3' para el menú infantil. ");
        }
    }

}