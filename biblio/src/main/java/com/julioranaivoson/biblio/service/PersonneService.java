package com.julioranaivoson.biblio.service;

import com.julioranaivoson.biblio.model.Personne;  // Assurez-vous que le nom de la classe est avec un P majuscule
import com.julioranaivoson.biblio.repository.PersonneRepository;  // Importer le repository
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.Optional;

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
