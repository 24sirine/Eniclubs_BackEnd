package tn.enicarthage.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tn.enicarthage.entities.FormLanceClub;
import tn.enicarthage.services.IFormLanceClubService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FormLanceClubRestControlImpl {
	@Autowired
	IFormLanceClubService FormLanceClubService;
	
	
	//http://localhost:8082/SpringMVC/servlet/retrieve-all-FormLanceClub
	@GetMapping("/retrieve-all-FormLanceClub")
	public List<FormLanceClub> retrieveAllLanceClub() {
		List<FormLanceClub> list = FormLanceClubService.ConsulterlistesFormLanceClub();
	return list;
	}
	//http://localhost:8082/SpringMVC/servlet/add-FormLanceClub
	@PostMapping("/add-FormLanceClub")
	@ResponseBody
	public FormLanceClub addFormLanceClub(@RequestBody FormLanceClub f ) {
		return FormLanceClubService.ajouterFormLanceClub(f);

	}
	//http://localhost:8082/SpringMVC/servlet/remove-event/{event-id}
		@DeleteMapping("/remove-formL/{FormLanceClub_ID}")
		@ResponseBody
		public void removeL(@PathVariable("FormLanceClub_ID") int formId) {
			FormLanceClubService.supprimerFormById(formId);
		}
}
