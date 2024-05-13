package br.com.javeirosavante.palcopronto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ingresso")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ingresso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIngresso;

    private TipoIngresso tipoIngresso;

    private Boolean ingressoDisponivel;

    private Double precoIngresso;

    private Long quantidadeMaxima;

    @ManyToMany
    @JoinColumn(name = "idEvento")
    private Evento evento;

}
