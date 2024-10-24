package projeto.meuprojeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import projeto.meuprojeto.model.Carro;

@Repository //usada para marcar uma classe como um componente que lida com a persistência de dadod, normalmente interagindo com o banco de dados.
public interface CarroRepository extends JpaRepository<Carro, Long> {

    boolean existsByModelo(String modelo);

    @Query("SELECT c FROM Carro c WHERE c.modelo = :modelo")
    Carro encontrarPorModelo(@Param("modelo") String modelo);
}
