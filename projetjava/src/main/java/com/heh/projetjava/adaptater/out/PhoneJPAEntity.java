package com.heh.projetjava.adaptater.out;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Telephone")
public class PhoneJPAEntity {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "marque")
    private String marque;

    @Column(name = "modele")
    private String modele;

    @Column(name = "capacite")
    private Integer capacite;


}