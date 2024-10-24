package projeto.meuprojeto.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import projeto.meuprojeto.model.Pecas;

@Data //Gera automaticamente os métodos getters, setters, equals(), hashCode(), toString()
public class CarroDto {
    private Long id;

    @NotBlank
    private String marca;

    @NotBlank
    private String modelo;

    private Integer ano;

    private Pecas pecas;
}
