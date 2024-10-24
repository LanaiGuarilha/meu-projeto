package projeto.meuprojeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import projeto.meuprojeto.dto.PecasDto;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pecas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String retrovisor;
    private String pneu;
    private String banco;

    public Pecas(PecasDto pecasDto) {
        this.id = pecasDto.getId();
        this.retrovisor = pecasDto.getRetrovisor();
        this.pneu = pecasDto.getPneu();
        this.banco = pecasDto.getBanco();

    }
}
