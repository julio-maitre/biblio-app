    package com.julioranaivoson.biblio.model;
    
    import jakarta.persistence.*;
    
    @Entity
    public class Auteur extends Personne {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        public String pseudo;
    
    
        public void ajouter(){
    
        }
        public void modifier(){
    
        }
        public void supprimer(){
    
        }
    }
