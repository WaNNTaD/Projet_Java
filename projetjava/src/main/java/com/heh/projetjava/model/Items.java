package com.heh.projetjava.model;


import lombok.Getter;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class Items {

    @Getter
    private final String nom;
    @Getter
    private final String descr;
    @Getter
    private final Double prix;
    @Getter
    private final String categorie;



}