package be.heh.deprez_julien_projet_trica.domain.port.out;

import java.util.List;

import be.heh.deprez_julien_projet_trica.domain.model.Phone;

/*Interface qui définit les méthodes pour gérer les téléphones en sortie.*/
public interface PhonePortOut {

    /*Récupère la liste de tous les téléphones.
     @return la liste de tous les téléphones.*/
    public List<Phone> getPhoneList();

    /*Récupère la liste des téléphones correspondant aux identifiants donnés.
     @param list la liste des identifiants des téléphones recherchés.
     @return la liste des téléphones correspondant aux identifiants donnés.*/
    public List<Phone> getPhoneListById(List<Integer> list);

    /*Ajoute un téléphone.
     @param phone le téléphone à ajouter.*/
    public void addPhone(Phone phone);

    /*Met à jour un téléphone.
     @param phone le téléphone à mettre à jour.*/
    void updatePhone(Phone phone);

    /*Supprime un téléphone.
     @param id l'identifiant du téléphone à supprimer.*/
    public void deletePhone(Long id);

    /*Récupère un téléphone.
     @param id l'identifiant du téléphone recherché.
     @return le téléphone correspondant à l'identifiant donné.*/
    public Phone selectId(Long id);
}
