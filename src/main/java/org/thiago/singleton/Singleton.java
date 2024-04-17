package org.thiago.singleton;

public class Singleton {
    private static Singleton instancia;

    private Singleton() {
        super();
    }

    public void printarOk(){
        System.out.println("Ok");
    }
    public static  Singleton getInstance(){
        if (instancia == null){
            instancia = new Singleton();
        }
        return instancia;
    }
}
