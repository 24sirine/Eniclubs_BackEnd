package tn.enicarthage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.club;



@Repository
public interface clubRepository extends CrudRepository<club, Long> {

}
