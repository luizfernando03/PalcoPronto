package br.com.javeirosavante.palcopronto.config;


import br.com.javeirosavante.palcopronto.dto.ClienteDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;
import java.util.ArrayList;

@Configuration
public class ClienteConfig {

    @Bean
    public List<ClienteDto> repositorioCliente() {
        return new ArrayList<>();

    }

}
