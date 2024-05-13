package br.com.javeirosavante.palcopronto.config;

import br.com.javeirosavante.palcopronto.model.Evento;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventoConfig {

    public List<ClienteDto> repositorioCliente() {
        return new ArrayList<>();

    }

}
