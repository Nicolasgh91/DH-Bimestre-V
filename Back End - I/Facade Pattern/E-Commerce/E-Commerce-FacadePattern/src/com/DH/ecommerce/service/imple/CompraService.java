package com.DH.ecommerce.service.imple;
// Clase Facade

import com.DH.ecommerce.model.Direccion;
import com.DH.ecommerce.model.Producto;
import com.DH.ecommerce.model.Tarjeta;
import com.DH.ecommerce.service.ICompraService;
import com.DH.ecommerce.service.imple.AlmacenService;

import java.util.List;

public class CompraService implements ICompraService {
    private AlmacenService almacenService;
    private PagoService pagoService;
    private EnvioService envioService;

    public CompraService(){
        this.almacenService = new AlmacenService();
        this.pagoService = new PagoService();
        this.envioService = new EnvioService();

    }

    public void procesarCompra(String productoId, Integer cantidad, Tarjeta tarjeta, Direccion direccion, List<Producto> productos){

        Producto producto = almacenService.buscarProducto(productoId,cantidad);

        if (producto != null){
            double montoCobrar = producto.getValor() * cantidad;

            if (pagoService.procesarPago(tarjeta, montoCobrar)){
                envioService.procesarEnvio(producto,direccion);
            }

        }
    }
}
