package br.com.javeirosavante.palcopronto.repository;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataIngestion implements CommandLineRunner {

    private final IngressoRepository ingressoRepository;

    private final EspacoRepository espacoRepository;

    private final EventoRepository eventoRepository;

    //CRIAR EVENTOS NO BANCO DE DADOS
    @Override
    public void run(String... args) throws Exception {
        
    }
}
