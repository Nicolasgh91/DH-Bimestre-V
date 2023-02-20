package service.impl;

import service.Middleware;

public class Presidente extends Middleware {

    @Override
    public boolean authorize(String message, int type) {

        if (type <= 3)
        {
            System.out.println("Está autorizado, presidente");
        }
        return checkNext(message,type);
    }

}
