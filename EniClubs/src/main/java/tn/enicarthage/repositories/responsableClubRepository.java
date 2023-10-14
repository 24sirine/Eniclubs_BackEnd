package tn.enicarthage.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.responsableClub;
@Repository
public interface responsableClubRepository  extends CrudRepository<responsableClub, Long>{
	@Query(value="SELECT * FROM T_RESPONSABLE_CLUB c WHERE c.resp_code=?1 ",nativeQuery=true)
	responsableClub findByUserCode(int code);
}
