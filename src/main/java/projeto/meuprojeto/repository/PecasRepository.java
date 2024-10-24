package projeto.meuprojeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.meuprojeto.model.Pecas;

@Repository
public interface PecasRepository extends JpaRepository<Pecas, Long> {
}
