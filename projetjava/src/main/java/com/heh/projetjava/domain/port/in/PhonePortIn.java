package com.heh.projetjava.domain.port.in;

import java.util.List;

import com.heh.projetjava.domain.model.Phone;

public interface PhonePortIn {

    public List<Phone> getPhoneList();
    public void addPhone(Phone phone);
    public void deletePhone(Long id);
    void updatePhone(Phone phone);

    Phone selectId(Long id);
}
