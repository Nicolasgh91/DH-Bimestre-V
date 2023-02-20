package service.impl;


import service.Middleware;

public class Diputados extends Middleware {

    @Override
    public boolean authorize(String message, int type) {

        if (type <= 1)
        {
            System.out.println("Está autorizado, Diputado.");
        }
        return checkNext(message,type);
    }
}
