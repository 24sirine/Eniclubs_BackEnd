package tn.enicarthage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.enicarthage.entities.FormRenouvellement;
import tn.enicarthage.repositories.FormRenouvellementRepository;

@Service
public class FormRenouvellementSevice implements IFormRenouvellementSevice{
	@Autowired
	FormRenouvellementRepository FormRenouvellementRepository ;
	
	public FormRenouvellementSevice (){
	}

	public FormRenouvellement ajouterFormRenouv(FormRenouvellement f) {
		
		return FormRenouvellementRepository.save(f); 
	}
	
	public List<FormRenouvellement> ConsulterlistesFormRenouv() {
		
		
		List<FormRenouvellement> l = null;
		try {
			l =  (List<FormRenouvellement>) FormRenouvellementRepository.findAll();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		return l;
	}
	public void supprimerFormById(int id) {
		
		FormRenouvellementRepository.deleteById((long) id);
		}
}
