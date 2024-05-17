package br.com.javeirosavante.palcopronto.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "espaco")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Espaco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String nome;

    @NotNull
    private String descricao;

    @NotNull
    private Integer capacidadeMaxima;

    private Boolean disponibilidade;
}
