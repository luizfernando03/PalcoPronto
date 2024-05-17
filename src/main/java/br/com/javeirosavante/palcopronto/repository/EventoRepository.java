package br.com.javeirosavante.palcopronto.repository;

import br.com.javeirosavante.palcopronto.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer> {

    public List<Evento> findEventoByIdNomeEvento(@Param("nomeEvento") String nomeEvento);

    //public List <Evento> findallBy

}
