package br.com.javeirosavante.palcopronto.repository;

import br.com.javeirosavante.palcopronto.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface TransacaoRepository extends JpaRepository<Transacao, Long > {

    //public void findVendaBy?

}
