package br.com.javeirosavante.palcopronto.config;


import br.com.javeirosavante.palcopronto.model.Transacao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VendaConfig {

    @Bean
    public Transacao venda() {
        Transacao venda = new Transacao();
        evento.setid();
        evento.setnome();
        evento.setdata();
        evento.sethora();


    }
}