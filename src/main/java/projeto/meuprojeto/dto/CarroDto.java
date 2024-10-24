package projeto.meuprojeto.dto;

import jakarta.validation.constraints.NotBlank;
import projeto.meuprojeto.model.Pecas;

public class CarroDto {
    private Long id;

    @NotBlank
    private String marca;

    @NotBlank
    private String modelo;

    @NotBlank
    private String ano;

    private Pecas pecas;
}
