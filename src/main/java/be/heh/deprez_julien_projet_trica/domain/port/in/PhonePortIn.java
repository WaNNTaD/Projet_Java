package be.heh.deprez_julien_projet_trica.domain.port.in;

import java.util.List;
import be.heh.deprez_julien_projet_trica.domain.model.Phone;


public interface PhonePortIn {

    public List<Phone> getPhoneList();
    public void addPhone(Phone phone);
    public void deletePhone(Long id);
    void updatePhone(Phone phone);

    Phone selectId(Long id);
}
