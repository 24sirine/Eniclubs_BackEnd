package tn.enicarthage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.FormLanceEvent;


@Repository
public interface FormLanceEventRepository extends CrudRepository<FormLanceEvent, Long>{

}
