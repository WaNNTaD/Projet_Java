package be.heh.deprez_julien_projet_trica.adapter.out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* Ce code déclare l'interface 'PhoneRepository' qui étend l'interface JpaRepository.
 JpaRepository fournit des méthodes de base pour les opérations CRUD sur les entités JPA.
En spécifiant 'PhoneJPAEntity' comme type d'entité et 'Long' comme type de clé primaire,
cela signifie que cette interface sera utilisée pour gérer les entités PhoneJPAEntity dans la base de données avec un ID de type Long.*/
@Repository
public interface PhoneRepository extends JpaRepository<PhoneJPAEntity,Long> {

}
