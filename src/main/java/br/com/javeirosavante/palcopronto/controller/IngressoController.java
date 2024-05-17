package br.com.javeirosavante.palcopronto.controller;

import br.com.javeirosavante.palcopronto.model.Ingresso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ingresso")
public class IngressoController {

    @Autowired
    private IngressoService ingressoService;

    @GetMapping
    public List<Ingresso> getAllIngressos() {
        return ingressoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ingresso> getIngressoById(@PathVariable Long id) {
        Optional<Ingresso> ingresso = ingressoService.findById(id);
        return ingresso.map(ResponseEntity:: ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}