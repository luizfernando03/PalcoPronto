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
public class EspacoDto {

    @Id
    private Long idEspaco;

    private String descricao;

    private Integer capacidadeMaxima;

    private Boolean disponibilidade;

}
