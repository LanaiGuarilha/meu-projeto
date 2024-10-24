package projeto.meuprojeto.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.meuprojeto.dto.CarroDto;
import projeto.meuprojeto.exception.CarroException;
import projeto.meuprojeto.exception.CarroNaoEncontradoException;
import projeto.meuprojeto.model.Carro;
import projeto.meuprojeto.repository.CarroRepository;
import projeto.meuprojeto.service.CarroService;

import java.util.List;

@RestController
@RequestMapping("carro")
public class CarroController {

    @Autowired
    private CarroRepository repository;
    @Autowired
    private CarroService carroService;

    @PostMapping
    public ResponseEntity<String> cadastrar(@Valid @RequestBody CarroDto carroDto) {

        try {
            carroService.cadastrarCarro(carroDto);
            return ResponseEntity.status(HttpStatus.CREATED).body("Carro cadastrado com sucesso");
        } catch (CarroException e) {
            throw new CarroException(e.getMessage());
        }
    }

    @GetMapping("/todos")
    public ResponseEntity<List<CarroDto>> listarTodosCarros() {
       List<CarroDto> carro = carroService.listarTodosCarros();
        return ResponseEntity.ok(carro);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

}