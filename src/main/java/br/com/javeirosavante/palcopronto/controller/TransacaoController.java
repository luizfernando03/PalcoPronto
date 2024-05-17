package br.com.javeirosavante.palcopronto.controller;


import br.com.javeirosavante.palcopronto.model.Transacao;
import br.com.javeirosavante.palcopronto.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/vendas")
public class TransacaoController {

    @Autowired
    private TransacaoService transacaoService;

    @GetMapping
    public List<Transacao> getAllTransacoes() { return transacaoService.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<Transacao> getTransacaoById(@PathVariable Long id) { Optional<Transacao> transacao = transacaoService.findById(id); return transacao.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Transacao createTransacao(@RequestBody Transacao transacao) { return transacaoService.criarTransacao(transacao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTransacao(@PathVariable Long id) { try { transacaoService.cancelarTransacao(id);
        return ResponseEntity.noContent().build();
    } catch (Exception e) {
        return ResponseEntity.notFound().build();
    }
    }

}
