package Crm;

public class CrmService {
    private CrmService() {
        super();
    }

    public static void gravarClientes(String nome, String cep, String cidade, String estado) {
        System.out.println("O cliente foi gravado:");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}