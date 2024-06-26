package br.com.javeirosavante.palcopronto.dto;

import br.com.javeirosavante.palcopronto.model.Espaco;
import br.com.javeirosavante.palcopronto.model.Evento;
import br.com.javeirosavante.palcopronto.model.Transacao;
import br.com.javeirosavante.palcopronto.validator.IngressoEsgotadoException;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class IngressoDto extends @Valid TransacaoDto {

    @Id
    private Long idIngresso;

    private TipoIngresso tipoIngresso;

    private Boolean ingressoDisponivel;

    private Double precoIngresso;

    private @NotNull Integer quantidadeMaxima;

    private Evento evento;

    private Transacao transacao;

    public void setIngressoDisponivel(Boolean ingressoDisponivel) {
        if(getQuantidadeMaxima() >= 1) {
            this.ingressoDisponivel = ingressoDisponivel;
        } else {
            throw new IngressoEsgotadoException("Ingressos esgotados para este evento");
        }
    }

    public void setQuantidadeMaxima(Integer quantidadeMaxima) {

        this.quantidadeMaxima = Espaco.builder().build().getCapacidadeMaxima();
    }
}
