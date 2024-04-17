package org.thiago.strategy;

public class ComportamentoDeNegocios implements IComportamento{

    @Override
    public void responder(){
        System.out.println("bem vindo, como posso ser util?.");
    }
}
