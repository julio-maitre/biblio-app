    package com.ranaivoson.inligneBiblio.entity;

    import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.GenerationType;
    import jakarta.persistence.Id;

    @Entity
    public class Auteur extends Personne {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        public String pseudo;
    
    

    }
