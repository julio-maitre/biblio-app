package com.ranaivoson.inligneBiblio.service;

import com.ranaivoson.inligneBiblio.entity.Livre;
import com.ranaivoson.inligneBiblio.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivreService {

    @Autowired
    private LivreRepository livreRepository;

    public Livre ajouter(Livre livre) {
        return livreRepository.save(livre);
    }

    public void supprimer(Integer id) {
        livreRepository.deleteById(Long.valueOf(id));
    }

    public Optional<Livre> findById(Integer id) {
        return livreRepository.findById(Long.valueOf(id));
    }

    public List<Livre> findAll() {
        return livreRepository.findAll();
    }
}
