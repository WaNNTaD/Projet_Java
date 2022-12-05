package com.heh.projetjava.domain.model;



import lombok.Getter;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class Phone {

    @Getter
    private final Long id;
    @Getter
    private final String marque;
    @Getter
    private final String modele;
    @Getter
    private final Integer capacite;
   


}
