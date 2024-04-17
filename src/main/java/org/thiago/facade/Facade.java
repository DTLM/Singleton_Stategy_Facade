package org.thiago.facade;

import org.thiago.facade.service.cep.CepService;
import org.thiago.facade.service.crm.CrmService;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepService.getInstance().consultarViaCep(cep);
        CrmService.salvarCliente(nome,cidade);
    }
}
