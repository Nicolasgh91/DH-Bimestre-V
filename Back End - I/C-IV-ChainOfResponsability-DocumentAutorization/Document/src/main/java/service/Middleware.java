package service;

public abstract class Middleware {
    private Middleware next;

    public static Middleware link(Middleware first, Middleware ... chain){
        // Initial
        Middleware head = first;

        // Every next chain link
        for (Middleware nextInChain : chain){
            // It assigns the next into the previous
            head.next = nextInChain;
            // And the next as first
            head = nextInChain;
        }
        return first;
    }

    // Checks level of authorization
    public abstract boolean authorize(String message, int type);

    protected boolean checkNext(String message, int type){

        if (next == null){
            // If true, means it reached the last chain link.
            return true;
        }
        return next.authorize(message,type);
    }
}
