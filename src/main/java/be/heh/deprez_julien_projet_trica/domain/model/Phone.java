package be.heh.deprez_julien_projet_trica.domain.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Phone {

    // Identifiant unique du téléphone
    @Getter
    private final Long id;
    // Marque du téléphone
    @Getter
    private final String marque;
    // Modèle du téléphone
    @Getter
    private final String modele;
    // Capacité de stockage du téléphone
    @Getter
    private final Integer capacite;
}

