package com.julioranaivoson.biblio.model;

import jakarta.persistence.*;

@Entity
public class Lecteur extends Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    public String heureConex;


    public void consulter(){

    }

    public void recherher(){

    }
    public void trier(){

    }
}
