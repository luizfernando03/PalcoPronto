package br.com.javeirosavante.palcopronto.model;

import br.com.javeirosavante.palcopronto.dto.TipoIngresso;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
    private Long id;

    private int quantidadeDisponivel;

    @NotNull
    private TipoIngresso tipo;

    @NotNull
    private BigDecimal precoUnitario;

    @ManyToOne
    private Evento evento;

    @ManyToOne
    private Transacao transacao;

}
