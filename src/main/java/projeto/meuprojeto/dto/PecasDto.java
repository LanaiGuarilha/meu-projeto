package projeto.meuprojeto.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import projeto.meuprojeto.model.Pecas;

@Data //Gera automaticamente os métodos getters, setters, equals(), hashCode(), toString()
public class PecasDto {

    private Long id;

    @NotBlank
    private String retrovisor;

    @NotBlank
    private String pneu;

    @NotBlank
    private String banco;

}
