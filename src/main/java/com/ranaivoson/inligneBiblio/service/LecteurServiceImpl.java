package com.ranaivoson.inligneBiblio.service;

import com.ranaivoson.inligneBiblio.dto.LecteurDTO;
import com.ranaivoson.inligneBiblio.entity.Lecteur;
import com.ranaivoson.inligneBiblio.repository.LecteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class LecteurServiceImpl implements LecteurService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    private final LecteurRepository lecteurRepository;

    @Autowired
    public LecteurServiceImpl(LecteurRepository lecteurRepository) {
        this.lecteurRepository = lecteurRepository;
    }

    @Override
    public Lecteur findByEmail(String email) {
        return lecteurRepository.findByEmail(email);
    }

    @Override
    public Lecteur save(LecteurDTO lecteurDTO) {
        Lecteur lecteur = new Lecteur();
        lecteur.setNom(lecteurDTO.getNom());
        lecteur.setPrenom(lecteurDTO.getPrenom());
        lecteur.setGenre(lecteurDTO.getGenre());
        lecteur.setEmail(lecteurDTO.getEmail());
        lecteur.setPassword(passwordEncoder.encode(lecteurDTO.getPassword()));
        lecteur.setPhone(lecteurDTO.getPhone());
        lecteur.setDateCreation(new Date());
        lecteur.setUpdate(new Date());
        lecteur.setHeureConnexion(new Date());
        lecteur.setRole("lecteur");
        return lecteurRepository.save(lecteur);
    }
}
