package com.DH.ecommerce.service;

import com.DH.ecommerce.model.Direccion;
import com.DH.ecommerce.model.Producto;
import com.DH.ecommerce.model.Tarjeta;

import java.util.List;

public interface ICompraService {

    public void procesarCompra(String productoId, Integer cantidad, Tarjeta tarjeta, Direccion direccion, List<Producto> productos);

}
