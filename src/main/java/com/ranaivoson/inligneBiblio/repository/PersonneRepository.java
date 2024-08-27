package com.ranaivoson.inligneBiblio.repository;

import com.ranaivoson.inligneBiblio.entity.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Long> {

}
