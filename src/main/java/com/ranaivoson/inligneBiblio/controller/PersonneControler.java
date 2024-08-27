package com.ranaivoson.inligneBiblio.controller;

import com.ranaivoson.inligneBiblio.entity.Personne;
import com.ranaivoson.inligneBiblio.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personnes")
public class PersonneControler {

    @Autowired
    private PersonneService personneService;


    @PostMapping("/ajouter")
    public ResponseEntity<Personne> ajouter(@RequestBody Personne personne) {
        Personne nouvellePersonne = personneService.ajouter(personne);
        return ResponseEntity.status(HttpStatus.CREATED).body(nouvellePersonne);
    }


    @DeleteMapping("/supprimer/{id}")
    public ResponseEntity<Void> supprimer(@PathVariable Long id) {
        personneService.supprimer(id);
        return ResponseEntity.noContent().build();
    }
}
