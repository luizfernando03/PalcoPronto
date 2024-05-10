package br.com.javeirosavante.palcopronto.config;

import br.com.javeirosavante.palcopronto.model.Ingresso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IngressoConfig {

    @Bean
    public Ingresso ingresso(){
        Ingresso ingresso = new Ingresso();
        ingresso.setid();
        ingresso.settipo();
        ingresso.setpreco();
        ingresso.setquantidademax();

    }

}
