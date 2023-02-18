import org.validacionPagos.Tarjeta.Models.TarjetaCredito;
import org.validacionPagos.Tarjeta.Models.TarjetaDebito;
import org.validacionPagos.Tarjeta.Tarjeta;

public class TarjetaTest {
    public static void main(String[] args) {


        Tarjeta tarjetaCreditoUno = new TarjetaCredito(9043,000,02,2023,300,200,500);
        Tarjeta tarjetaDebitoUno = new TarjetaDebito(3949,003,03,2023,100,200);


        //tarjetaDebitoUno.procesarPago();
        //tarjetaDebitoUno.setMontoCompra(500);
        //tarjetaDebitoUno.procesarPago();

        tarjetaCreditoUno.procesarPago();

    }
}
