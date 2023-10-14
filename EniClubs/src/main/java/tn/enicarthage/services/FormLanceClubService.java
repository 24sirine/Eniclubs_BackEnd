package tn.enicarthage.services;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.repositories.FormLanceClubRepository;
import tn.enicarthage.entities.FormLanceClub;
@Service
public class FormLanceClubService implements IFormLanceClubService{
	@Autowired
	FormLanceClubRepository FormLanceClubRepository ;
	
	public FormLanceClubService (){
	}

	@Override
	public FormLanceClub ajouterFormLanceClub(FormLanceClub f) {
		
		return FormLanceClubRepository.save(f); 
	}
	@Override
	public List<FormLanceClub> ConsulterlistesFormLanceClub() {
		
		
		List<FormLanceClub> l = null;
		try {
			l =  (List<FormLanceClub>) FormLanceClubRepository.findAll();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		return l;
	}
	public void supprimerFormById(int id) {
		
		 FormLanceClubRepository.deleteById((long) id);
			}
}
