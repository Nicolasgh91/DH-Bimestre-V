import com.dh.template.Vendedor;
import com.dh.template.service.Afiliado;
import com.dh.template.service.Empleado;
import com.dh.template.service.Pasante;

public class VendedorTest {

    public static void main(String[] args) {

        Vendedor vendedorUno = new Empleado("Pepito",0,1,0);
        Vendedor vendedorDos = new Empleado("Juan",8,0,1);
        Vendedor vendedorTres = new Empleado("Carlos",3,6,2);

        Vendedor afiliadoUno = new Afiliado("Ramon", 0,0);
        Vendedor afiliadoDos = new Afiliado("Ricardo", 10,2);
        Vendedor afiliadoTres = new Afiliado("Gerardo", 5,0);

        Vendedor pasante = new Pasante("Nico",100,2);

        ( (Empleado) vendedorUno).conseguirAfiliado(2);
        vendedorUno.mostrarCategoria();
        vendedorUno.getTotalPuntos();
        vendedorUno.vender();

        vendedorUno.mostrarCategoria();
        vendedorUno.vender();
        vendedorUno.vender();
        vendedorUno.vender();
        vendedorUno.vender();
        vendedorUno.getCategoria();
        vendedorUno.mostrarCategoria();

        pasante.mostrarCategoria();
        pasante.vender();
        pasante.vender();
        pasante.vender();
        pasante.vender();
        pasante.mostrarCategoria();

    }
}
