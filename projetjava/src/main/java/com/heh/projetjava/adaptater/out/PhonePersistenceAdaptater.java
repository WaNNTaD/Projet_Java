package com.heh.projetjava.adaptater.out;

import java.util.List;

import com.heh.projetjava.domain.model.Phone;
import com.heh.projetjava.domain.port.out.PhonePortOut;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PhonePersistenceAdaptater implements PhonePortOut {


    private final PhoneRepository phoneRepository;
    /*private List<Phone> phones;*/
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
