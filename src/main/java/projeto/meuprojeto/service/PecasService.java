package projeto.meuprojeto.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.meuprojeto.dto.PecasDto;
import projeto.meuprojeto.exception.PecasNaoEncontradoException;
import projeto.meuprojeto.model.Pecas;
import projeto.meuprojeto.repository.PecasRepository;

import java.util.Optional;

@Service // Contém a lógica de negócios da aplicação.
public class PecasService {

    @Autowired //Usada para injetar automaticamente dependências em classes.
    private PecasRepository pecasRepository;

    public Pecas atualizarPecas(Long id, PecasDto pecasDto) {
        Optional<Pecas> pecas = pecasRepository.findById(id);

        if (pecas.isPresent()) {
            pecasDto.setId(id);

            Pecas pecasAtualizada = new ModelMapper().map(pecasDto, Pecas.class);
            return pecasRepository.save(pecasAtualizada);
        } else {
            throw new PecasNaoEncontradoException("Pecas não encontradas");
        }

    }
}
