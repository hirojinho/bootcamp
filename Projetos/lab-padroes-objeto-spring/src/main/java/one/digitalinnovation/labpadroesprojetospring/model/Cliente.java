package one.digitalinnovation.labpadroesprojetospring.model;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity // Configuar a classe como um objeto de banco de dados JPA
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Determina o tipo de geração da chave primária
    private Long id;
    private String nome;
    @ManyToOne
    private Endereco endereco;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
