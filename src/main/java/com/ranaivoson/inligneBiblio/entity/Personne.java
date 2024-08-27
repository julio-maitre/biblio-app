package com.ranaivoson.inligneBiblio.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "personne")
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nom_pers")
    private String nom;

    @Column(name = "prenom_pers")
    private String prenom;

    @Column(name = "genre_prs")
    private String genre;

    @Column(name = "email_prs")
    private String email;

    @Column(name = "password_prs", nullable = false, unique = true)
    private String password;

    @Column(name = "phone_prs")
    private String phone;

    @Column(name = "dateCreation_prs")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;

    @Column(name = "dateUpdate_prs")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdate;
}
