package com.ranaivoson.inligneBiblio.service;

import com.ranaivoson.inligneBiblio.entity.Auteur;
import com.ranaivoson.inligneBiblio.repository.AuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuteurService {

    @Autowired
    private AuteurRepository auteurRepository;

    public Auteur ajouter(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    public void supprimer(Integer id) {
        auteurRepository.deleteById(id);
    }

    public Optional<Auteur> findById(Integer id) {
        return auteurRepository.findById(id);
    }

    public List<Auteur> findAll() {
        return auteurRepository.findAll();
    }
}
