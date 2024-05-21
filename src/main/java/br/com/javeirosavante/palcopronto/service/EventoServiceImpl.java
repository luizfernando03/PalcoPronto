package br.com.javeirosavante.palcopronto.service;

import br.com.javeirosavante.palcopronto.mapper.EventoMapper;
import br.com.javeirosavante.palcopronto.model.Evento;
import br.com.javeirosavante.palcopronto.repository.EventoRepository;
import br.com.javeirosavante.palcopronto.validator.EventoExistenteException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EventoServiceImpl implements EventoService {

    @Autowired
    private EventoRepository repository;

    @Override
    public List<Evento> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Evento> findById(Long idEvento) {
        return repository.findById(idEvento);
    }

    @Override
    public Optional<Evento> findEventoByNameEventoContainingIgnoreCase(String nomeEvento) {
        return Optional.empty();
    }

    @Override
    public Evento criarEvento(Evento eventoDto) {
        if(repository.findById(eventoDto.getIdEvento()).isPresent()) {
            throw new EventoExistenteException("Evento já cadastrado");
        }
        return repository.save(eventoDto);
    }
    @Override
    public Optional<Evento> atualizarEvento(Long idEvento, Evento eventoAtualizado) {
        final Optional<Evento> eventoOptional = repository.findById(idEvento);
        if (eventoOptional.isPresent()) {
            final Evento eventoEncontrado = eventoOptional.get();

            EventoMapper.copy(eventoEncontrado, eventoAtualizado);

            repository.save(eventoAtualizado);

            return Optional.of(eventoAtualizado);
        }

        return Optional.empty();
    }


    @Override
    public void deletarEvento(Long idEvento) {
        final Optional<Evento> eventoOptional = repository.findById(idEvento);

        if(eventoOptional.isPresent()) {
            repository.delete(eventoOptional.get());
        }

        throw  new EventoNaoExistenteException("O evento não existe!");

    }

}
