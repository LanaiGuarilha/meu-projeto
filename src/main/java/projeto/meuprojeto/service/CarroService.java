package projeto.meuprojeto.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.meuprojeto.dto.CarroDto;
import projeto.meuprojeto.exception.CarroException;
import projeto.meuprojeto.model.Carro;
import projeto.meuprojeto.repository.CarroRepository;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

//    @Autowired
//    private PecasRepository pecasRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Carro cadastrarCarro(CarroDto carroDto) {
        if (carroRepository.existsByModel(carroDto.getModelo())) {
            throw new CarroException("Carro Modelo " + carroDto.getModelo() + " já existe");
        }

        Carro carro = new ModelMapper().map(carroDto, Carro.class);
        carroRepository.save(carro);

        return carro;

    }

    public Carro buscarPorModelo(String modelo) {
        return carroRepository.encontrarPorModelo(modelo);
    }
}
