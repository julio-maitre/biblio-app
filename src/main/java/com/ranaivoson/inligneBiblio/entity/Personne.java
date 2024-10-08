package com.ranaivoson.inligneBiblio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

import java.util.Date;

@Data
@Setter
@Getter
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
public class Personne {
    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "genre")
    private String genre;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "phone")
    private int phone;

    @Column(name = "date_creation")
    private Date dateCreation;

    @Column(name = "date_update")
    private Date update;
}
