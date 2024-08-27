package com.ranaivoson.inligneBiblio.controller;

import com.ranaivoson.inligneBiblio.entity.Auteur;
import com.ranaivoson.inligneBiblio.service.AuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auteurs")
public class AuteurControleur {

    @Autowired
    private AuteurService auteurService;

    @PostMapping("/ajouter")
    public ResponseEntity<Auteur> ajouter(@RequestBody Auteur auteur) {
        Auteur nouvelAuteur = auteurService.ajouter(auteur);
        return ResponseEntity.status(HttpStatus.CREATED).body(nouvelAuteur);
    }

    @DeleteMapping("/supprimer/{id}")
    public ResponseEntity<Void> supprimer(@PathVariable Integer id) {
        auteurService.supprimer(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Auteur> obtenir(@PathVariable Integer id) {
        return auteurService.findById(id)
                .map(auteur -> ResponseEntity.ok(auteur))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Auteur>> obtenirTous() {
        return ResponseEntity.ok(auteurService.findAll());
    }
}
