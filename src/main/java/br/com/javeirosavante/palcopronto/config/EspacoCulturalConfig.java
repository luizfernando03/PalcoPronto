package br.com.javeirosavante.palcopronto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EspacoCulturalConfig {

    @Bean
    public EspacoCultural espacoCultural() {
        EspaçoCultura espaco = new EspacoCultural();
        espaco.setid();
        espaco.setdescricao();
        espaco.setcapacidademax();
    }

}
