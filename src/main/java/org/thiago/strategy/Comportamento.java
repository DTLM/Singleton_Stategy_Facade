package org.thiago.strategy;

public class Comportamento implements IComportamento{

    @Override
    public void responder(){
        System.out.println("olá, eu estou bem.");
    }
}
