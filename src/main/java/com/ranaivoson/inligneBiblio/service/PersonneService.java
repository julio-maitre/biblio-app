package com.ranaivoson.inligneBiblio.service;

import com.ranaivoson.inligneBiblio.entity.Personne;
import com.ranaivoson.inligneBiblio.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonneService {

    @Autowired
    private PersonneRepository personneRepository;

    public Personne ajouter(Personne personne) {
        return personneRepository.save(personne);
    }

    public void supprimer(Long id) {
        personneRepository.deleteById(id);
    }
}
