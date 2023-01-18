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

@org.springframework.context.annotation.Configuration //indique que cette classe est une classe de configuration pour Spring
@EnableJpaRepositories //active les fonctionnalités de JPA pour les repositories
public class Configuration {
    @Autowired //injection de dépendance automatique pour l'interface PhoneRepository
    private PhoneRepository phoneRepository;

    private PhoneMapper phoneMapper = new PhoneMapper(); //crée une instance de la classe PhoneMapper
    private PhonePersistenceAdaptater phonePersistenceAdaptater;

    @Bean //permet de déclarer un bean pour Spring
    public PhonePortOut getPhonePortOut(){
        //retourne une nouvelle instance de PhonePersistenceAdaptater en utilisant phoneRepository et phoneMapper comme arguments
        return new PhonePersistenceAdaptater(phoneRepository,phoneMapper);
    }
    @Bean //permet de déclarer un bean pour Spring
    public PhonePortIn getPhonePortIn(){
        //crée une nouvelle instance de PhonePersistenceAdaptater en utilisant phoneRepository et phoneMapper comme arguments
        phonePersistenceAdaptater = new PhonePersistenceAdaptater(phoneRepository, phoneMapper);
        //retourne une nouvelle instance de PhoneListUseCase en utilisant phonePersistenceAdaptater comme argument
        return new PhoneListUseCase(phonePersistenceAdaptater);
    }

}
