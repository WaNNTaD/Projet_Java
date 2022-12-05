package com.heh.projetjava.domain.port.out;

import java.util.List;

import com.heh.projetjava.domain.model.Phone;

public interface PhonePortOut {
    public List<Phone> getPhoneList();

    public List<Phone> getPhoneListById(List<Integer> list);

    public void addPhone(Phone phone);

    void updatePhone(Phone phone);

    public void deletePhone(Long id);

    public Phone selectId(Long id);
}
