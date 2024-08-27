package com.ranaivoson.inligneBiblio.repository;

import com.ranaivoson.inligneBiblio.entity.Lecteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LecteurRepository extends JpaRepository<Lecteur, Integer> {
}
