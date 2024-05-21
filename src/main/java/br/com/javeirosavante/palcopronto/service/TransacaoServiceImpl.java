package br.com.javeirosavante.palcopronto.service;

import br.com.javeirosavante.palcopronto.model.Transacao;
import br.com.javeirosavante.palcopronto.repository.TransacaoRepository;
import br.com.javeirosavante.palcopronto.validator.TransacaoExistenteException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.transform.TransformerConfigurationException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TransacaoServiceImpl implements TransacaoServiceImpl {

    @Autowired
    private TransacaoRepository repository;


    @Override
    public List<Transacao> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Transacao> findById(Long idTransacao) {
        return repository.findById(idTransacao);

    }

    @Override
    public Transacao criarTransacao(Transacao transacaoDto) {
        if (repository.findById(transacaoDto.getIdTransacao()).isPresent()) {
            throw new TransacaoExistenteException("Transação já Cadastrado");
        }
        return repository.save(transacaoDto);
    }

    @Override
    public void cancelarTransacao(Long idTransacao) {
        final Optional<Transacao> transacaoOptional = repository.findById(idTransacao);

        if (transacaoOptional.isPresent()) {
            repository.delete(transacaoOptional.get());

            throw new TransacaoNaoExisteException ("A transação não existe");
        }

    }
}
