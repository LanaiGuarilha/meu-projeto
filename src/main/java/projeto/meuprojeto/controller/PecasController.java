package projeto.meuprojeto.controller;

import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.meuprojeto.dto.PecasDto;
import projeto.meuprojeto.repository.PecasRepository;
import projeto.meuprojeto.service.PecasService;

@RestController
@RequestMapping("pecas")
public class PecasController {

    @Autowired
    private PecasRepository repository;

    @Autowired
    private PecasService pecasService;


    @PutMapping("/{id}")

    public ResponseEntity<PecasDto> atualizarPecas(@PathVariable @Valid Long id, @RequestBody PecasDto pecasAtualizada) {
        pecasService.atualizarPecas(id, pecasAtualizada);
        return ResponseEntity.ok(pecasAtualizada);
    }

}
