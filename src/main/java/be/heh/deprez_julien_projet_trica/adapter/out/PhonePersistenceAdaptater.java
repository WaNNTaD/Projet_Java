package be.heh.deprez_julien_projet_trica.adapter.out;

import be.heh.deprez_julien_projet_trica.domain.model.Phone;
import be.heh.deprez_julien_projet_trica.domain.port.out.PhonePortOut;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PhonePersistenceAdaptater implements PhonePortOut {
    // Injection de dépendance de PhoneRepository pour accéder à la base de données
    private final PhoneRepository phoneRepository;
    // Injection de dépendance de PhoneMapper pour la conversion des entities JPA en objets de domaine et vice versa
    private final PhoneMapper phoneMapper;

    // Méthode pour récupérer la liste de tous les téléphones enregistrés
    @Override
    public List<Phone> getPhoneList() {

        // Récupération de la liste des téléphones enregistrés en utilisant PhoneRepository
        List<PhoneJPAEntity> phoneJPAEntityList = phoneRepository.findAll();
        // Conversion de la liste des entités JPA en objets de domaine
        return phoneMapper.PhoneMapToDomainEntity(phoneJPAEntityList);
    }
    // Méthode pour récupérer la liste de téléphones enregistrés par ID
    @Override
    public List<Phone> getPhoneListById(List<Integer> list) {
        return null;
    }

    // Méthode pour ajouter un nouveau téléphone
    @Override
    public void addPhone(Phone phone) {
        // Conversion de l'objet de domaine en entité JPA
        phoneRepository.save(phoneMapper.PhoneMapDomainToJpa(phone));
    }
    // Méthode pour mettre à jour les informations d'un téléphone
    @Override
    public void updatePhone(Phone phone){
        // Conversion de l'objet de domaine en entité JPA
        phoneRepository.save(phoneMapper.PhoneMapDomainToJpa(phone));
    }

    // Méthode pour supprimer un téléphone enregistré
    @Override
    public void deletePhone(Long id){
        phoneRepository.deleteById(id);
    }

    // Méthode pour récupérer les informations d'un téléphone enregistré par ID
    @Override
    public Phone selectId(Long id) {
        // Récupération de l'entité JPA correspondant à l'ID spécifié
        PhoneJPAEntity phoneJPAEntity= phoneRepository.findById(id).get();
        if(phoneJPAEntity.equals(null)){
            return null;
        }else{
            // Conversion de l'entité JPA en objet de domaine
            return phoneMapper.PhoneMapJpaToDomain(phoneJPAEntity);
        }
    }

}
