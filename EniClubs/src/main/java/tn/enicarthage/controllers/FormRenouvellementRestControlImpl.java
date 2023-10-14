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
import tn.enicarthage.entities.FormRenouvellement;
import tn.enicarthage.services.IFormRenouvellementSevice;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FormRenouvellementRestControlImpl {
	@Autowired
	IFormRenouvellementSevice FormRenouvellementService;
	
	
	//http://localhost:8081/SpringMVC/servlet/retrieve-all-FormRenouvellement
	@GetMapping("/retrieve-all-FormRenouvellement")
	public List<FormRenouvellement> retrieveAllFormRenouv() {
		return FormRenouvellementService.ConsulterlistesFormRenouv();
	
	}
	//http://localhost:8081/SpringMVC/servlet/add-FormRenouvellement
	@PostMapping("/add-FormRenouvellement")
	@ResponseBody
	public FormRenouvellement addFormRenouvellement(@RequestBody FormRenouvellement f ) {
		return FormRenouvellementService.ajouterFormRenouv(f);

	}
	//http://localhost:8082/SpringMVC/servlet/remove-event/{event-id}
		@DeleteMapping("/remove-formR/{FormRenouv_id}")
		@ResponseBody
		public void removeR(@PathVariable("FormRenouv_id") int formId) {
			FormRenouvellementService.supprimerFormById(formId);
		}
}
