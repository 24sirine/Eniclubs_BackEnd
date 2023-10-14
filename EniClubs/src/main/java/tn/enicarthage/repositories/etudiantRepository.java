package tn.enicarthage.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import tn.enicarthage.entities.etudiant;
@Repository
public interface etudiantRepository  extends CrudRepository<etudiant, Long>{
	@Query(value="SELECT * FROM T_etudiant c WHERE c.NUM_CARTE=?1 ",nativeQuery=true)
	etudiant findByUserCode(int num_carteEtd);
}