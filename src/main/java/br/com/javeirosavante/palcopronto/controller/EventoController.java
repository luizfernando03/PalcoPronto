package br.com.javeirosavante.palcopronto.controller;

import br.com.javeirosavante.palcopronto.model.Evento;
import br.com.javeirosavante.palcopronto.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class EventoController {

    @Autowired
    private EventoService eventoService;

    @GetMapping
    public List<Evento> getAllEventos() {
        return eventoService.findAll();
    }

    @GetMapping("/{idEvento}")
    public ResponseEntity<Evento> getEventoById(@PathVariable Long idEvento) {
        Optional<Evento> evento = eventoService.findById(idEvento);

        return evento.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/listarevento/{idEspaco}")
    public ResponseEntity<List<Evento>> findAllEventoByEspaco(@PathVariable Long idEspaco) {

        return ResponseEntity.ok(eventoService.findAllEventoByEspaco(idEspaco));
    }

    @PostMapping
    public Evento createEvento(@RequestBody Evento evento) {
        return eventoService.criarEvento(evento);
    }

    @PutMapping("/{idEvento}")
    public ResponseEntity<Evento> updateEvento(@PathVariable Long idEvento, @RequestBody Evento evento) {
        Optional<Evento> updatedEvento = eventoService.atualizarEvento(idEvento, evento); return updatedEvento.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{idEvento}")
    public ResponseEntity<Void> deleteEvento(@PathVariable Long idEvento) {
        try {
            eventoService.deletarEvento(idEvento); return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

}
