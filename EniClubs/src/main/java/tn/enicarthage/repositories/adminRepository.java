package tn.enicarthage.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.admin;
@Repository
public interface adminRepository  extends CrudRepository<admin, Long>{
	@Query(value="SELECT * FROM T_ADMIN c WHERE c.PERSONNE_nom=?1 ",nativeQuery=true)
	admin findByUsername(String nom);
	@Query(value="SELECT * FROM T_ADMIN c WHERE c.PERSONNE_prenom=?1 ",nativeQuery=true)
	admin findByUserPrenom(String prenom);
	@Query(value="SELECT * FROM T_ADMIN c WHERE c.PERSONNE_email=?1 ",nativeQuery=true)
	admin findByUserEmail(String email);
	@Query(value="SELECT * FROM T_ADMIN c WHERE c.PERSONNE_mdp=?1 ",nativeQuery=true)
	admin findByUserMdp(String mdp);
	@Query(value="SELECT * FROM T_ADMIN c WHERE c.ADMIN_CODE=?1 ",nativeQuery=true)
	admin findByUserCode(int code);

}
