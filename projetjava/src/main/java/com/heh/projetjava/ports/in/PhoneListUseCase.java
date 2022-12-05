package com.heh.projetjava.ports.in;

import java.util.List;

import com.heh.projetjava.domain.model.Phone;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import com.heh.projetjava.domain.port.out.*;
import com.heh.projetjava.domain.port.in.*;

@RequiredArgsConstructor
public class PhoneListUseCase implements PhonePortIn {
    @Getter
    private final PhonePortOut phonePortOut;

    @Override
    public List<Phone> getPhoneList(){
        return getPhonePortOut().getPhoneList();
    }


    @Override
    public void addPhone(Phone phone) {

        List<Phone> phones = phonePortOut.getPhoneList();
        boolean bool = true;
        for(Phone pr : phones){
            if(pr.getMarque().equals(phone.getMarque())){
                bool=false;
            }
        }
        if(bool){
            phonePortOut.addPhone(phone);
        }
    }

    @Override
    public void updatePhone(Phone phone){
        phonePortOut.updatePhone(phone);
    }

    @Override
    public void deletePhone(Long id){
        phonePortOut.deletePhone(id);
    }

    @Override
    public Phone selectId(Long id) {
        return phonePortOut.selectId(id);
    }
}
