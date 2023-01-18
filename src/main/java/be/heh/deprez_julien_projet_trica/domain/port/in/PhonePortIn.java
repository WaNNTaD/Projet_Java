package be.heh.deprez_julien_projet_trica.domain.port.in;

import java.util.List;
import be.heh.deprez_julien_projet_trica.domain.model.Phone;

/* PhonePortIn est l'interface qui définit les opérations de base pour les téléphones
 Ces méthodes sont utilisées pour récupérer, ajouter, mettre à jour et supprimer des téléphones
 La méthode selectId est utilisée pour sélectionner un téléphone par ID*/

public interface PhonePortIn {

    //récupère la liste des téléphones
    public List<Phone> getPhoneList();

    //ajoute un téléphone
    public void addPhone(Phone phone);

    //supprime un téléphone
    public void deletePhone(Long id);

    //met à jour un téléphone
    void updatePhone(Phone phone);

    //sélectionne un téléphone par ID
    Phone selectId(Long id);
}
