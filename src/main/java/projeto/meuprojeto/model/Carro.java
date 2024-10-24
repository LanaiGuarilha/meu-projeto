package projeto.meuprojeto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import projeto.meuprojeto.dto.CarroDto;

@Entity //Informa ao JPA que essa classe é uma entidade que será mapeada para uma tabela no banco de dados.
@Data //Gera automaticamente os métodos getters, setters, equals(), hashCode(), toString()
@NoArgsConstructor //Construtor sem argumentos
@AllArgsConstructor //Construtor com todos os campos
@EqualsAndHashCode(of = "id") //Gera os métodos equals() e hashCode()
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //geração da chave primária
    private Long id;
    private String marca;
    private String modelo;
    private Integer ano;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pecas_id", nullable = false)
    private Pecas pecas;

    public Carro(CarroDto dto) {
        this.id = dto.getId();
        this.marca = dto.getMarca();
        this.modelo = dto.getModelo();
        this.ano = dto.getAno();
        this.pecas = dto.getPecas();
    }
}
