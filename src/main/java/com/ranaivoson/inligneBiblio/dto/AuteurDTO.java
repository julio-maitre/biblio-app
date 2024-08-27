package com.ranaivoson.inligneBiblio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuteurDTO {
    private int id;
    private String nom;
    private String prenom;
    private String pseudo;
}
