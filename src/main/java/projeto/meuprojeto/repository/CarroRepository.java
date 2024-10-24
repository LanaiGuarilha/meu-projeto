package projeto.meuprojeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import projeto.meuprojeto.model.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

    boolean existsByModel(String modelo);

    @Query("SELECT c FROM Carro c WHERE c.modelo = :modelo")
    Carro encontrarPorModelo(@Param("modelo") String modelo);
}
