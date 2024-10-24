package projeto.meuprojeto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import projeto.meuprojeto.dto.CarroDto;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private Integer ano;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pecas_id", nullable = false)
    private Pecas pecas;

    public Carro(CarroDto dto) {
        this.id = dto.getId;
        this.marca = dto.getMarca();
        this.modelo = dto.getModelo();
        this.ano = dto.getAno();
        this.pecas = dto.getPecas();
    }
}
