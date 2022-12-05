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
public class ItemsJPAEntity {

    @Column(name = "id")
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "descr")
    private String descr;

    @Column(name = "prix")
    private Double prix;

    @Column(name = "categorie")
    private String categorie;


}