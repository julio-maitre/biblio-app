package com.ranaivoson.inligneBiblio.controller;

import com.ranaivoson.inligneBiblio.entity.Livre;
import com.ranaivoson.inligneBiblio.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livres")
public class LivreControleur {

    @Autowired
    private LivreService livreService;

    @PostMapping("/ajouter")
    public ResponseEntity<Livre> ajouter(@RequestBody Livre livre) {
        Livre nouveauLivre = livreService.ajouter(livre);
        return ResponseEntity.status(HttpStatus.CREATED).body(nouveauLivre);
    }

    @DeleteMapping("/supprimer/{id}")
    public ResponseEntity<Void> supprimer(@PathVariable Integer id) {
        livreService.supprimer(Math.toIntExact(Long.valueOf(id)));
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livre> obtenir(@PathVariable Integer id) {
        return livreService.findById(id)
                .map(livre -> ResponseEntity.ok(livre))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Livre>> obtenirTous() {
        return ResponseEntity.ok(livreService.findAll());
    }
}
