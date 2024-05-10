package br.com.javeirosavante.palcopronto.repository;

import br.com.javeirosavante.palcopronto.model.Espaco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspacoRepository extends JpaRepository<Espaco, String> {

    // Fazer apos que a galera entregar public void findByEspacooBy  (@Param("") Integer id evento);

    //public List <Evento> findallBy


}
