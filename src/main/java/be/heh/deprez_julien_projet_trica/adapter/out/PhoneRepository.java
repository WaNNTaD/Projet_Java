package be.heh.deprez_julien_projet_trica.adapter.out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends JpaRepository<PhoneJPAEntity,Long> {

}
