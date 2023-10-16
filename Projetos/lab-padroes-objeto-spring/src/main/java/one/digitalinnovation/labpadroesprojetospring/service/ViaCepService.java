package one.digitalinnovation.labpadroesprojetospring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import one.digitalinnovation.labpadroesprojetospring.model.Endereco;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
    /**
     * Há um mapeamento do {cep} da URL com um método GET
     * Ou seja, na URL, o método abaixo pega o valor do cep e usa como parâmetro
     */
    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);    
}
