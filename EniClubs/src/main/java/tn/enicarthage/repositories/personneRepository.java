package tn.enicarthage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.personne;

@Repository
public interface personneRepository  extends CrudRepository<personne, Long>{

}
