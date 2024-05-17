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

    @GetMapping("/{id}")
    public ResponseEntity<Evento> getEventoById(@PathVariable Long id) { Optional<Evento> evento = eventoService.findById(id); return evento.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Evento createEvento(@RequestBody Evento evento) { return eventoService.criarEvento(evento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Evento> updateEvento(@PathVariable Long id, @RequestBody Evento evento) { Optional<Evento> updatedEvento = eventoService.atualizarEvento(id, evento); return updatedEvento.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvento(@PathVariable Long id) { try { eventoService.deletarEvento(id); return ResponseEntity.noContent().build();
    } catch (Exception e) {
        return ResponseEntity.notFound().build();
    }
    }

}
