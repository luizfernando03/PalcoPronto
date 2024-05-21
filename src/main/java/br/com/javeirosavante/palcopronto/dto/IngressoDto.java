package br.com.javeirosavante.palcopronto.dto;

import br.com.javeirosavante.palcopronto.model.Espaco;
import br.com.javeirosavante.palcopronto.model.Evento;
import br.com.javeirosavante.palcopronto.model.Transacao;
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
