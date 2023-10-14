package tn.enicarthage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.FormRenouvellement;


@Repository
public interface FormRenouvellementRepository extends CrudRepository<FormRenouvellement, Long>{

}
