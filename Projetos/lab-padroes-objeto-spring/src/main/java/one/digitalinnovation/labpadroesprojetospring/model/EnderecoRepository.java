package one.digitalinnovation.labpadroesprojetospring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String>{
    /**
     * O CrudRepository<Entity, Long> é uma interface que implementa os métodos CRUD
     * Entity é a JPA Entity (database)
     * Long é o tipo da PrimaryKey
     */
}
