package br.com.javeirosavante.palcopronto.model;

import br.com.javeirosavante.palcopronto.dto.TipoIngresso;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "ingresso")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ingresso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIngresso;


    private TipoIngresso tipoIngresso;

    private Boolean ingressoDisponivel;

    private BigDecimal precoIngresso;

    private Long quantidadeMaxima;

    @ManyToMany
    @JoinColumn(name = "idEvento")
    private Evento evento;

}
