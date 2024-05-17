package br.com.javeirosavante.palcopronto.controller;

import br.com.javeirosavante.palcopronto.model.Espaco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/espaco")
public class EspacoController {

    @Autowired
    private EspacoService espacoService;

    @GetMapping
    public List<Espaco> getAllEspacos() {
        return espacoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Espaco> getEspacoById(@PathVariable Long id) { Optional<Espaco> espaco = espacoService.findById(id); return espaco.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Espaco createEspaco(@RequestBody Espaco espaco) { return espacoService.criarEspaco(espaco);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Espaco> updateEspaco(@PathVariable Long id, @RequestBody Espaco espaco) { Optional<Espaco> updatedEspaco = espacoService.atualizarEspaco(id, espaco); return updatedEspaco.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEspaco(@PathVariable Long id) { try { espacoService.deletarEspaco(id); return ResponseEntity.noContent().build();
    } catch (Exception e) {
        return ResponseEntity.notFound().build();
    }
    }

}
