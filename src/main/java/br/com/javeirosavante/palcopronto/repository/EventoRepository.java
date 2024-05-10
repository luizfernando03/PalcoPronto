package br.com.javeirosavante.palcopronto.repository;

import br.com.javeirosavante.palcopronto.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer> {

    // Fazer apos que a galera entregar public void findByEventoByIdEvento(@Param("id evento") Integer id evento);

    //public List <Evento> findallBy

}
