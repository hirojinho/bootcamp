package Pattern;

import Cep.CepApi;
import Crm.CrmService;

public class Facade {
    public void migrarClientes (String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarClientes(nome, cep, cidade, estado);
    }
}
