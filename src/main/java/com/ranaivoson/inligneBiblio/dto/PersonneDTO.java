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
public class PersonneDTO {
    private Long id;
    private String nom;
    private String prenom;
    private String genre;
    private String email;
    private String password;
    private String phone;
    private Date dateCreation;
    private Date dateUpdate;
}
