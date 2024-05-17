package br.com.javeirosavante.palcopronto.repository;

import br.com.javeirosavante.palcopronto.model.Espaco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EspacoRepository extends JpaRepository<Espaco, Integer> {

    public List<Espaco> findEspacoByCapacidadeMaximaContainingIgnoreCase
            (@Param("capacidadeMaxima") Integer capacidadeMaxima);

    //public List <Evento> findallBy


}
