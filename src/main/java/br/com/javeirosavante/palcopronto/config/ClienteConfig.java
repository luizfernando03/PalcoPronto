package br.com.javeirosavante.palcopronto.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClienteConfig {

    @Bean
    public Cliente cliente(){
        Cliente cliente = new Cliente();
        cliente.setcpf();


    }

}
