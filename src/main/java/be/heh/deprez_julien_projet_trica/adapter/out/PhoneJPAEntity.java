package be.heh.deprez_julien_projet_trica.adapter.out;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
//Indique que cette classe est une entité pour JPA (Java Persistence API)
@Data
//Génère les getters, setters, toString, equals, hashCode de manière automatique
@NoArgsConstructor
//Génère un constructeur sans argument
@AllArgsConstructor
//Génère un constructeur avec tous les arguments
@Table(name = "phones")
//Indique le nom de la table dans la base de données correspondant à cette entité
public class PhoneJPAEntity {

    @Id
    //Indique que cette propriété est la clé primaire de la table
    @Column(name = "id")
    private Long id;

    @Column(name = "marque")
    private String marque;

    @Column(name = "modele")
    private String modele;

    @Column(name = "capacite")
    private Integer capacite;

}

