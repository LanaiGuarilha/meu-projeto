package projeto.meuprojeto.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.meuprojeto.dto.CarroDto;
import projeto.meuprojeto.exception.CarroException;
import projeto.meuprojeto.model.Carro;
import projeto.meuprojeto.repository.CarroRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service // Contém a lógica de negócios da aplicação.
public class CarroService {

    @Autowired //Usada para injetar automaticamente dependências em classes.
    private CarroRepository carroRepository;

//    @Autowired
//    private PecasRepository pecasRepository;

    @Autowired //Usada para injetar automaticamente dependências em classes.
    private ModelMapper modelMapper;

    public Carro cadastrarCarro(CarroDto carroDto) {
        if (carroRepository.existsByModelo(carroDto.getModelo())) {
            throw new CarroException("Carro Modelo " + carroDto.getModelo() + " já existe");
        }

        Carro carro = new ModelMapper().map(carroDto, Carro.class);
        carroRepository.save(carro);

        return carro;

    }

    public List<CarroDto> listarTodosCarros() {
        List<Carro> carros = carroRepository.findAll();
        return carros.stream()
                .map(carro -> modelMapper.map(carro, CarroDto.class))
                .collect(Collectors.toList());

    }
}
