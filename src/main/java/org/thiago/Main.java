package org.thiago;

import org.thiago.facade.Facade;
import org.thiago.singleton.Singleton;
import org.thiago.strategy.Comportamento;
import org.thiago.strategy.ComportamentoDeNegocios;
import org.thiago.strategy.IComportamento;

import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        // singleton
        // Garante que um objeto não seja criado mais que uma vez para realizar
        // o mesmo tipo de atividade em diversas classes.
        Singleton single1 = Singleton.getInstance();
        Singleton single2 = Singleton.getInstance();
        if (single1 != null && single2 != null) {
            System.out.println(single1);
            System.out.println(single2);
            single1.printarOk();
            single2.printarOk();
        }

        // strategy
        // uma interface que pode ser inicializada com qualquer classe que a implemente.
        IComportamento comportamento = new ComportamentoDeNegocios();
        IComportamento comportamento2 = new Comportamento();
        comportamento.responder();
        comportamento2.responder();

        // facade
        Facade facade = new Facade();
        facade.migrarCliente("Dev", "87654321");
    }
}