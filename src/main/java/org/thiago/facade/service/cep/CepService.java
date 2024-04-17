package org.thiago.facade.service.cep;

public class CepService {

    private static CepService instancia = new CepService();
    private CepService(){}

    public String consultarViaCep(String cep){
        System.out.println("Cep consultado: " + cep);
        return "Araraquara";
    }

    public static CepService getInstance(){
        return instancia;
    }
}
