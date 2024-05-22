package br.com.javeirosavante.palcopronto.service;

import br.com.javeirosavante.palcopronto.mapper.EspacoMapper;
import br.com.javeirosavante.palcopronto.model.Espaco;
import br.com.javeirosavante.palcopronto.repository.EspacoRepository;
import br.com.javeirosavante.palcopronto.validator.EspacoExistenteException;
import br.com.javeirosavante.palcopronto.validator.EspacoNaoExistenteException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EspacoServiceImpl implements EspacoService{

    @Autowired
    private final EspacoRepository repository;

    @Override
    public List<Espaco> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Espaco> findById(Long idEspaco) {
        return repository.findById(idEspaco);
    }



//    @Override
//    public Optional<Espaco> findEventoByNameEventoContainingIgnoreCase(String nomeEspaco) {
//        return Optional.empty();
//    }

    @Override
    public Espaco criarEspaco(Espaco espacoDto) {
        if(repository.findById(espacoDto.getIdEspaco()).isPresent())
            throw new EspacoExistenteException("Espaço já cadastrado");

        return repository.save(espacoDto);
    }

    @Override
    public Optional<Espaco> atualizarEspaco(Long idEspaco, Espaco espacoAtualizado) {
        final Optional<Espaco> espacoOptional = repository.findById(idEspaco);
        if (espacoOptional.isPresent()) {
            final Espaco espacoEncontrado = espacoOptional.get();

            EspacoMapper.copy(espacoEncontrado, espacoAtualizado);

            repository.save(espacoAtualizado);

            return Optional.of(espacoAtualizado);
        }

        return Optional.empty();
    }

    @Override
    public void deletarEspaco(Long idEspaco) {
        final Optional<Espaco> espacoOptional = repository.findById(idEspaco);

        if(espacoOptional.isPresent())
            repository.delete(espacoOptional.get());

        throw  new EspacoNaoExistenteException("O espaço não existe!");
    }

}
