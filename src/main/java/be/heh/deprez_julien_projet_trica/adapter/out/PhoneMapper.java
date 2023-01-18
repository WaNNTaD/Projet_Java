package be.heh.deprez_julien_projet_trica.adapter.out;

import be.heh.deprez_julien_projet_trica.domain.model.Phone;

import java.util.ArrayList;
import java.util.List;


public class PhoneMapper {

    //Méthode pour transformer une liste d'entités JPA en une liste d'entités de domaine Phone
    List<Phone> PhoneMapToDomainEntity(List<PhoneJPAEntity> phone){
        List<Phone> phoneList = new ArrayList<>();

        //boucle pour itérer sur chaque élément de la liste d'entités JPA
        for (PhoneJPAEntity phoneJPAEntity: phone) {
            //ajout d'un nouvel objet Phone à la liste, en utilisant les valeurs de l'entité JPA courante
            phoneList.add(new Phone(phoneJPAEntity.getId(),phoneJPAEntity.getMarque(),phoneJPAEntity.getModele(),phoneJPAEntity.getCapacite()));
        }
        return phoneList;
    }

    //Méthode pour transformer une entité de domaine Phone en une entité JPA
    public PhoneJPAEntity PhoneMapDomainToJpa(Phone phone){
        return new PhoneJPAEntity(phone.getId(), phone.getMarque(), phone.getModele(), phone.getCapacite());
    }
    //Méthode pour transformer une entité JPA en une entité de domaine Phone
    public Phone PhoneMapJpaToDomain(PhoneJPAEntity phoneJPAEntity){
        return new Phone(phoneJPAEntity.getId(), phoneJPAEntity.getMarque(), phoneJPAEntity.getModele(), phoneJPAEntity.getCapacite());
    }
}
