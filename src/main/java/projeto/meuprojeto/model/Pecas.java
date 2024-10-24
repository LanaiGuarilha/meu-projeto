package projeto.meuprojeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import projeto.meuprojeto.dto.PecasDto;

@Entity //Informa ao JPA que essa classe é uma entidade que será mapeada para uma tabela no banco de dados.
@Data //Gera automaticamente os métodos getters, setters, equals(), hashCode(), toString()
@NoArgsConstructor //Construtor sem argumentos
@AllArgsConstructor //Construtor com todos os campos
public class Pecas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //geração da chave primária
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
