
// Clase Facade

public class CompraService implements ICompraService{
    private AlmacenService almacenService;
    private PagoService pagoService;
    private EnvioService envioService;

    public CompraService(){
        this.almacenService = new AlmacenService();
        this.pagoService = new PagoService();
        this.envioService = new EnvioService();

    }


}
