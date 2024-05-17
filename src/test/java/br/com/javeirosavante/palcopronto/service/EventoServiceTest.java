package br.com.javeirosavante.palcopronto.service;

import br.com.javeirosavante.palcopronto.model.Evento;
import br.com.javeirosavante.palcopronto.repository.EventoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class EventoServiceTest {

    private EventoServiceImpl service;

    private EventoRepository repository;

    @BeforeEach
    public void preparar() {
        repository = Mockito.mock(EventoRepository.class);
        service = new EventoService(repository);
    }
    @Test
    void testeListarEvento() {
        List<Evento> listarEvento = TesteDados.listarEvento();
    }

}
