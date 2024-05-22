package br.com.javeirosavante.palcopronto.repository;

import br.com.javeirosavante.palcopronto.model.Ingresso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface IngressoRepository extends JpaRepository<Ingresso , String > {

    public List<Ingresso> findByEventoIdEvento(Long idEvento);

    Optional<Ingresso> findById(Long idIngresso);

    void deleteById(Long idIngresso);
}
