package projeto.meuprojeto.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import projeto.meuprojeto.model.Pecas;

@Data
public class PecasDto {

    private Long id;

    @NotBlank
    private String retrovisor;

    @NotBlank
    private String pneu;

    @NotBlank
    private String banco;

}
