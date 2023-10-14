package tn.enicarthage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.entities.FormLanceEvent;
import tn.enicarthage.repositories.FormLanceEventRepository;

@Service
public class FormLanceEventService implements IFormLanceEventService{
	@Autowired
	FormLanceEventRepository FormLanceventRepository ;
	
	public FormLanceEventService() {
	}

	public FormLanceEvent ajouterFormLanceEvent(FormLanceEvent f) {
		
		return (FormLanceventRepository.save(f)); 
	}
	public List<FormLanceEvent> ConsulterlistesFormLanceEvent() {
		
		
		List<FormLanceEvent> l = null;
		try {
			l =  (List<FormLanceEvent>) FormLanceventRepository.findAll();
		} catch (Exception e) {
		
			System.out.println("erreur");
		}
		
		return l;
	}
public void supprimerFormById(int id) {
		
		FormLanceventRepository.deleteById((long) id);
	}

}
