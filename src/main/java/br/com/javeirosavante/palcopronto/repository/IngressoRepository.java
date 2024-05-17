package br.com.javeirosavante.palcopronto.repository;

import br.com.javeirosavante.palcopronto.model.Ingresso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IngressoRepository extends JpaRepository<Ingresso , String > {


    public void findIngressoByCpf(@Param("cpf") String cpf);

    // public Optional<Ingresso> findIngressoByNomeContainingIgnoreCase(@Param("nomeEvento") String nome_evento);

}
