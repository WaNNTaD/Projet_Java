package com.heh.projetjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.heh.projetjava.adaptater.out.PhoneMapper;
import com.heh.projetjava.adaptater.out.PhonePersistenceAdaptater;
import com.heh.projetjava.adaptater.out.PhoneRepository;
import com.heh.projetjava.domain.port.in.PhonePortIn;
import com.heh.projetjava.domain.port.out.PhonePortOut;
import com.heh.projetjava.ports.in.PhoneListUseCase;

@org.springframework.context.annotation.Configuration
@EnableJpaRepositories
public class Configuration {
    @Autowired
    private PhoneRepository phoneRepository;

    private PhoneMapper phoneMapper = new PhoneMapper();
    private PhonePersistenceAdaptater phonePersistenceAdaptater;

    @Bean
    public PhonePortOut getPhonePortOut(){
        return new PhonePersistenceAdaptater(phoneRepository,phoneMapper);
    }
    @Bean
    public PhonePortIn getPhonePortIn(){
        phonePersistenceAdaptater = new PhonePersistenceAdaptater(phoneRepository, phoneMapper);
        return new PhoneListUseCase(phonePersistenceAdaptater);
    }
}
