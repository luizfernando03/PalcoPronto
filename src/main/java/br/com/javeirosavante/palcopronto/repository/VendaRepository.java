package br.com.javeirosavante.palcopronto.repository;

import br.com.javeirosavante.palcopronto.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VendaRepository extends JpaRepository<Transacao, String > {
    //public void findVendaBy?

}
