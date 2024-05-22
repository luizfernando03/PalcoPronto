package br.com.javeirosavante.palcopronto.dto;

import br.com.javeirosavante.palcopronto.model.Evento;
import br.com.javeirosavante.palcopronto.model.Ingresso;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TransacaoDto extends IngressoDto {

    @Id
    private Long idTransacao;

    private LocalDataTime dataTransacao;

    private Evento evento;

    private Ingresso ingresso;

}
