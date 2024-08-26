package com.julioranaivoson.biblio.model;

import jakarta.persistence.*;

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


    public void ajouter() {

    }
    public void modifier() {

    }
    public void supprimer() {

    }

}

