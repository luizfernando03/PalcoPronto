package br.com.javeirosavante.palcopronto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ingresso")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngressoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToMany
    @JoinColumn(name = "evento_id")
    private EventoModel eventoModel;

    private boolean vip;

    private double preco;

}
