package com.ranaivoson.inligneBiblio.service;

import com.ranaivoson.inligneBiblio.dto.LecteurDTO;
import com.ranaivoson.inligneBiblio.entity.Lecteur;
import org.springframework.stereotype.Service;

@Service
public interface LecteurService {
    Lecteur findByEmail(String email);
    Lecteur save(LecteurDTO lecteurDTO);
}
