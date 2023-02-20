package com.chainOfResponsability.Logger;

import com.chainOfResponsability.Logger;

public class TrazaLogger extends Logger {

    public TrazaLogger(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void enviarMensaje(String mensaje, String tipo) {
        if (tipo.equals(this.tipo))
        {
            System.out.println("Escribiendo en un archivo de texto: "+ mensaje);
        }
        if (this.siguienteLogger != null){
            this.siguienteLogger.enviarMensaje(mensaje,tipo);
        }
    }
}
