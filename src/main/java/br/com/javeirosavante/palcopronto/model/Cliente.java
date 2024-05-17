package br.com.javeirosavante.palcopronto.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nome;

    @NotNull
    @CPF
    private String cpf;

    @NotNull
    @Email
    private String email;

    @OneToMany(mappedBy = "cliente")
    private List<Transacao> transacoes;

}
