package br.com.javeirosavante.palcopronto.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "evento")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEvento;

    @NotNull
    private String nomeEvento;

    @NotNull
    private String descricaoEvento;

    @NotNull
    private LocalDateTime dataHoraEvento;

    @ManyToMany
    @JoinColumn(name = "idEspaco")
    private Espaco espaco;

}
