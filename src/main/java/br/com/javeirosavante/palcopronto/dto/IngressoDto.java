package br.com.javeirosavante.palcopronto.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class IngressoDto {

    @Id
    private Long idIngresso;

    private TipoIngresso tipoIngresso;

    private Boolean ingressoDisponivel;

    private Double precoIngresso;

    private Long quantidadeMaxima;
}
