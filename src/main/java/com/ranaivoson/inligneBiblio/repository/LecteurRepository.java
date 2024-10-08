package com.ranaivoson.inligneBiblio.repository;

import com.ranaivoson.inligneBiblio.entity.Lecteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LecteurRepository extends JpaRepository<Lecteur, Long> {
    Lecteur findByEmail(String email);
}
