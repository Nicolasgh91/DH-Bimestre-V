package service.impl;

import service.Middleware;

public class Ministros extends Middleware {

    @Override
    public boolean authorize(String message, int type) {

        if (type <= 2)
        {
            System.out.println("Está autorizado, Ministro");
        }
           return checkNext(message,type);
    }
}
