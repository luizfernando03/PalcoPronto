package br.com.javeirosavante.palcopronto.config;

import br.com.javeirosavante.palcopronto.model.Evento;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventoConfig {

    @Bean
    public Evento evento(){
        Evento evento = new Evento();
        evento.setid();
        evento.setnome();
        evento.setdata();
        evento.sethora();

    }

}
