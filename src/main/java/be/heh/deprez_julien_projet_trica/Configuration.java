package be.heh.deprez_julien_projet_trica;

import be.heh.deprez_julien_projet_trica.adapter.out.PhoneMapper;
import be.heh.deprez_julien_projet_trica.adapter.out.PhonePersistenceAdaptater;
import be.heh.deprez_julien_projet_trica.adapter.out.PhoneRepository;
import be.heh.deprez_julien_projet_trica.domain.port.in.PhonePortIn;
import be.heh.deprez_julien_projet_trica.domain.port.out.PhonePortOut;
import be.heh.deprez_julien_projet_trica.ports.in.PhoneListUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

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
