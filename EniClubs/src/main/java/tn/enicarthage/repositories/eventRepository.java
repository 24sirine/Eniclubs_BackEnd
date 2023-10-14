package tn.enicarthage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.event;
@Repository
public interface eventRepository extends CrudRepository<event, Long>{

}
