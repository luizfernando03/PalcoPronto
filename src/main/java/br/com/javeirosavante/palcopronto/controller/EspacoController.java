package br.com.javeirosavante.palcopronto.controller;

import br.com.javeirosavante.palcopronto.model.Espaco;
import br.com.javeirosavante.palcopronto.service.EspacoService;
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

    @GetMapping("/{idEspaco}")
    public ResponseEntity<Espaco> getEspacoById(@PathVariable Long idEspaco) {
        Optional<Espaco> espaco = espacoService.findById(idEspaco);

        return espaco.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Espaco createEspaco(@RequestBody Espaco espaco) {
        return espacoService.criarEspaco(espaco);
    }

    @PutMapping("/{idEspaco}")
    public ResponseEntity<Espaco> updateEspaco(@PathVariable Long idEspaco, @RequestBody Espaco espaco) {
        Optional<Espaco> updatedEspaco = espacoService.atualizarEspaco(idEspaco, espaco);
        return updatedEspaco.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{idEspaco}")
    public ResponseEntity<Void> deleteEspaco(@PathVariable Long idEspaco) {
        try {
            espacoService.deletarEspaco(idEspaco);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

}
