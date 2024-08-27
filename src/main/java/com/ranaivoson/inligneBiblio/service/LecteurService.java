package com.ranaivoson.inligneBiblio.service;

import com.ranaivoson.inligneBiblio.entity.Lecteur;
import com.ranaivoson.inligneBiblio.repository.LecteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LecteurService {

    @Autowired
    private LecteurRepository lecteurRepository;

    public Lecteur ajouter(Lecteur lecteur) {
        return lecteurRepository.save(lecteur);
    }

    public void supprimer(Integer id) {
        lecteurRepository.deleteById(id);
    }

    public Optional<Lecteur> findById(Integer id) {
        return lecteurRepository.findById(id);
    }

    public List<Lecteur> findAll() {
        return lecteurRepository.findAll();
    }
}
