package com.heh.projetjava.model;



import lombok.Getter;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class User {

    @Getter
    private final String mail;
    @Getter
    private final String nom;
    @Getter
    private final String prenom;
    @Getter
    private final String mdp;
    @Getter
    private final Boolean fonction;



}
