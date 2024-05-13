package br.com.javeirosavante.palcopronto.dto;

import jakarta.persistence.Id;

public class EspacoDto {

    @Id
    private Long idEspaco;

    private String descricao;

    private Integer capacidadeMaxima;

    private Boolean disponibilidade;

}
