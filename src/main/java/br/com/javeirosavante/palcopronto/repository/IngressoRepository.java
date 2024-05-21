package br.com.javeirosavante.palcopronto.repository;

import br.com.javeirosavante.palcopronto.model.Ingresso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IngressoRepository extends JpaRepository<Ingresso , String > {

    public List<Ingresso> findByEventoIdEvento(Long idEvento);

}
