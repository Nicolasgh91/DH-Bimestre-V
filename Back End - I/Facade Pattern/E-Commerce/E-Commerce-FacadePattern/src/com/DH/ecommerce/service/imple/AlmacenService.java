package com.DH.ecommerce.service.imple;

import com.DH.ecommerce.model.Producto;

import java.util.List;

// Subsistema

public class AlmacenService {
    private List<Producto> productos;

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Producto buscarProducto(String productoId, Integer cantidad) {
        Producto producto = null;

        for (Producto p: this.productos) {

            // from each product if it matched the ID and the quantity is available in inventory
            if (p.getProductoId().equals(productoId) && p.getCantidad() >= cantidad){
                producto = p;
                // so remove the requested cantity
                p.setCantidad(p.getCantidad() - cantidad);
                producto.setCantidad(cantidad);
            }
        }
        return producto;
    }
}
