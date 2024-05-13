package br.com.javeirosavante.palcopronto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EspacoConfig {

    @Bean("dbEspaco")
    public List<EspacoDto> repositorioEspaco() {
        return new ArrayList<>();
    }

}
