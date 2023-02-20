import service.Middleware;
import service.impl.Diputados;
import service.impl.Ministros;
import service.impl.Presidente;

public class MiddlewareTest {

    public static void main(String[] args) {

        Middleware ministro = new Ministros();
        Middleware diputado = new Diputados();
        Middleware presidente = new Presidente();

        //ministro.authorize("Hola",3);
        //ministro.authorize("Chau", 1);

        Middleware middleware = Middleware.link(ministro,diputado,presidente);
        middleware.authorize("Prueba",1);
    }
}
