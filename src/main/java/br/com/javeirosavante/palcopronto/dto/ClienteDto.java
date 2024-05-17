package br.com.javeirosavante.palcopronto.dto;

import br.com.javeirosavante.palcopronto.model.Transacao;
import org.hibernate.validator.constraints.br.CPF;

public class ClienteDto {

    @CPF
    private String cpf;

    private Transacao venda;
}
