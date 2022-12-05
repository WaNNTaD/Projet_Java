package com.heh.projetjava.adaptater.out;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepository extends JpaRepository<ItemsJPAEntity,Long> {

}
