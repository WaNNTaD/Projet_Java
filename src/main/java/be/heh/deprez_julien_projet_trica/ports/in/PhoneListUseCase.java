package be.heh.deprez_julien_projet_trica.ports.in;

import be.heh.deprez_julien_projet_trica.domain.model.Phone;
import be.heh.deprez_julien_projet_trica.domain.port.in.PhonePortIn;
import be.heh.deprez_julien_projet_trica.domain.port.out.PhonePortOut;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

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
