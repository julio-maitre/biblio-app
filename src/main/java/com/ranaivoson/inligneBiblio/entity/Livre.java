package com.ranaivoson.inligneBiblio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titre;
    private int auteurId;
    private String editeur;
    private String edition;
    private int anneeEdition;
    private int categorieId;
    private Date dateSortie;
    private Date datePublication;
    private String description;
    private String imageCouverture;
    private String fichier;
    private String langue;




}

