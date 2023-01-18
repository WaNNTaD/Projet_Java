package be.heh.deprez_julien_projet_trica.adapter.out;

import be.heh.deprez_julien_projet_trica.domain.model.Phone;

import java.util.ArrayList;
import java.util.List;


public class PhoneMapper {

    List<Phone> PhoneMapToDomainEntity(List<PhoneJPAEntity> phone){
        List<Phone> phoneList = new ArrayList<>();

        for (PhoneJPAEntity phoneJPAEntity: phone) {
            phoneList.add(new Phone(phoneJPAEntity.getId(),phoneJPAEntity.getMarque(),phoneJPAEntity.getModele(),phoneJPAEntity.getCapacite()));
        }
        return phoneList;
    }

    public PhoneJPAEntity PhoneMapDomainToJpa(Phone phone){
        return new PhoneJPAEntity(phone.getId(), phone.getMarque(), phone.getModele(), phone.getCapacite());
    }
    public Phone PhoneMapJpaToDomain(PhoneJPAEntity phoneJPAEntity){
        return new Phone(phoneJPAEntity.getId(), phoneJPAEntity.getMarque(), phoneJPAEntity.getModele(), phoneJPAEntity.getCapacite());
    }
}
