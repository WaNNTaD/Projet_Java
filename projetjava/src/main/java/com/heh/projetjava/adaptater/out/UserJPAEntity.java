package com.heh.projetjava.adaptater.out;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Utilisateur")
public class UserJPAEntity {


    

    @Column(name = "mail")
    private String mail;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "mdp")
    private String mdp;

    @Column(name = "fonction")
    private Boolean fonction;


}