package br.com.javeirosavante.palcopronto.service;

import br.com.javeirosavante.palcopronto.model.Transacao;

import java.util.List;
import java.util.Optional;

public interface TransacaoService {

    List<Transacao> findAll();

    Optional<Transacao> findById(final Long idTransacao);


    Transacao criarTransacao(final Evento transacaoDto);


    void cancelarTransacao(final Long idTransacao);

}
