package com.DH.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();

        Producto productoUno = new Producto();
        Producto productoDos = new Producto();

        productos.add(productoUno);
        productos.add(productoDos);

        Tarjeta tarjeta = new Tarjeta();
        Direccion direccion = new Direccion();

        ICompraService compraService = new CompraService();

        // A la compra le paso los dos productos creados, la tarjeta creada, dirección y
        // el listado que almacena dichos productos.
        compraService.procesarCompra("1",2,tarjeta,direccion,productos);

    }

}
