package be.heh.deprez_julien_projet_trica.adapter.out;

import be.heh.deprez_julien_projet_trica.domain.model.Phone;
import be.heh.deprez_julien_projet_trica.domain.port.out.PhonePortOut;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PhonePersistenceAdaptater implements PhonePortOut {

    private final PhoneRepository phoneRepository;
    private final PhoneMapper phoneMapper;
    @Override
    public List<Phone> getPhoneList() {

        List<PhoneJPAEntity> phoneJPAEntityList = phoneRepository.findAll();
        return phoneMapper.PhoneMapToDomainEntity(phoneJPAEntityList);
    }
    @Override
    public List<Phone> getPhoneListById(List<Integer> list) {
        return null;
    }

    @Override
    public void addPhone(Phone phone) {
        phoneRepository.save(phoneMapper.PhoneMapDomainToJpa(phone));
    }
    @Override
    public void updatePhone(Phone phone){
        phoneRepository.save(phoneMapper.PhoneMapDomainToJpa(phone));
    }

    @Override
    public void deletePhone(Long id){
        phoneRepository.deleteById(id);
    }

    @Override
    public Phone selectId(Long id) {
        PhoneJPAEntity phoneJPAEntity= phoneRepository.findById(id).get();
        if(phoneJPAEntity.equals(null)){
            return null;
        }else{
            return phoneMapper.PhoneMapJpaToDomain(phoneJPAEntity);
        }
    }

}
