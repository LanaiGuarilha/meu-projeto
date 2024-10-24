package projeto.meuprojeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.meuprojeto.model.Pecas;

@Repository //usada para marcar uma classe como um componente que lida com a persistência de dadod, normalmente interagindo com o banco de dados.
public interface PecasRepository extends JpaRepository<Pecas, Long> {
}
