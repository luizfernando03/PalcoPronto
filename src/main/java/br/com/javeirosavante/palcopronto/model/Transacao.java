package br.com.javeirosavante.palcopronto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "transacao")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private LocalDateTime dataHoraTrasacao;



    @ManyToOne
    @JoinColumn(name = "ingresso_id")
    private Ingresso ingresso;

    @ManyToMany
    @JoinColumn(name = "idEvento")
    private Evento evento;

}
