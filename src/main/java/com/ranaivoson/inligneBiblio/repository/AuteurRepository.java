package com.ranaivoson.inligneBiblio.repository;

import com.ranaivoson.inligneBiblio.entity.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuteurRepository extends JpaRepository<Auteur, Integer> {

}

