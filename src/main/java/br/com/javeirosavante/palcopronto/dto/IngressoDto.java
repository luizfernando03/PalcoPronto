package br.com.javeirosavante.palcopronto.dto;

import jakarta.persistence.Id;

public class IngressoDto {

    @Id
    private Long idIngresso;

    private TipoIngresso tipoIngresso;

    private Boolean ingressoDisponivel;

    private Double precoIngresso;

    private Long quantidadeMaxima;
}
