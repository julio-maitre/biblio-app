package com.ranaivoson.inligneBiblio.controller;

import com.ranaivoson.inligneBiblio.entity.Lecteur;
import com.ranaivoson.inligneBiblio.service.LecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lecteurs")
public class LecteurControler {

    @Autowired
    private LecteurService lecteurService;

    @PostMapping("/ajouter")
    public ResponseEntity<Lecteur> ajouter(@RequestBody Lecteur lecteur) {
        Lecteur nouveauLecteur = lecteurService.ajouter(lecteur);
        return ResponseEntity.status(HttpStatus.CREATED).body(nouveauLecteur);
    }

    @DeleteMapping("/supprimer/{id}")
    public ResponseEntity<Void> supprimer(@PathVariable Integer id) {
        lecteurService.supprimer(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lecteur> obtenir(@PathVariable Integer id) {
        return lecteurService.findById(id)
                .map(lecteur -> ResponseEntity.ok(lecteur))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Lecteur>> obtenirTous() {
        return ResponseEntity.ok(lecteurService.findAll());
    }
}
