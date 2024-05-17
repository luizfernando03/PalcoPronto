package br.com.javeirosavante.palcopronto.dto;

import br.com.javeirosavante.palcopronto.model.Ingresso;

import java.time.LocalDateTime;

public class VendaDto {

    private Long id;

    private LocalDateTime dataVenda;

    private Cliente cliente;

    private Ingresso ingresso;

}
