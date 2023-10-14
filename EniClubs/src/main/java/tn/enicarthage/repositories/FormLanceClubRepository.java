package tn.enicarthage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.FormLanceClub;
@Repository
public interface FormLanceClubRepository  extends CrudRepository<FormLanceClub, Long>{

}
