package be.heh.deprez_julien_projet_trica.ports.in;

import be.heh.deprez_julien_projet_trica.domain.model.Phone;
import be.heh.deprez_julien_projet_trica.domain.port.in.PhonePortIn;
import be.heh.deprez_julien_projet_trica.domain.port.out.PhonePortOut;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PhoneListUseCase implements PhonePortIn {

    // injecter une instance de PhonePortOut
    @Getter
    private final PhonePortOut phonePortOut;

    @Override
    public List<Phone> getPhoneList(){
        // retourne la liste des téléphones obtenue à partir de PhonePortOut
        return getPhonePortOut().getPhoneList();
    }


    @Override
    public void addPhone(Phone phone) {
        // obtenir la liste des téléphones existants
        List<Phone> phones = phonePortOut.getPhoneList();
        // initialiser un booléen pour vérifier si le téléphone à ajouter est déjà présent
        boolean bool = true;
        // parcourir la liste des téléphones existants
        for(Phone pr : phones){
            // vérifier si le téléphone à ajouter a la même marque qu'un téléphone déjà présent
            if(pr.getMarque().equals(phone.getMarque())){
                // si oui, mettre le booléen à faux
                bool=false;
            }
        }
        // vérifier si le booléen est vrai
        if(bool){
            // si oui, ajouter le téléphone
            phonePortOut.addPhone(phone);
        }
    }

    // Appelle la méthode updatePhone du phonePortOut pour mettre à jour un téléphone existant
    @Override
    public void updatePhone(Phone phone){
        phonePortOut.updatePhone(phone);
    }

    // Appelle la méthode deletePhone du phonePortOut pour supprimer un téléphone existant
    @Override
    public void deletePhone(Long id){
        phonePortOut.deletePhone(id);
    }

    // Appelle la méthode selectId du phonePortOut pour sélectionner un téléphone existant par son ID
    @Override
    public Phone selectId(Long id) {
        return phonePortOut.selectId(id);
    }

}
