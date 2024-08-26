package com.julioranaivoson.biblio.model;

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
    @Column(name = "nom_pers")
    public String nom;
    @Column(name = "prenom_pers")
    public String prenom;
    @Column(name = "genre_prs")
    public String genre;
    @Column(name = "email_prs")
    public String email;
    @Column(name = "password_prs", nullable = false, unique = true)
    public String password;
    @Column(name = "phone_prs")
    public int phone;
    @Column(name = "dateCreation_prs")
    public Date dateCreation;
    @Column(name = "dateUpdate_prs")
    public Date dateUpdate;
}