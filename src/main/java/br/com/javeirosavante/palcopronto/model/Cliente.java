package br.com.javeirosavante.palcopronto.model;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "cliente")
public class Cliente {

    private String cpf;

    @OneToOne
    @JoinColumn(name = "idVenda")
    private Venda venda;

}
