package com.ranaivoson.inligneBiblio.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LivreDTO {
    private Long id;
    private String titre;
    private Long auteurId;
    private String editeur;
    private String edition;
    private int anneeEdition;
    private Long categorieId;
    private Date dateSortie;
    private Date datePublication;
    private String description;
    private String imageCouverture;
    private String fichier;
    private String langue;
}
