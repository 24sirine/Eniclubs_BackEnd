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
import tn.enicarthage.entities.FormLanceEvent;
import tn.enicarthage.services.IFormLanceEventService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FormLanceEventRestControlImpl {
	@Autowired
	IFormLanceEventService FormLanceEventService;
	
	
	//http://localhost:8082/SpringMVC/servlet/retrieve-all-FormLanceEvent
	@GetMapping("/retrieve-all-FormLanceEvent")
	public List<FormLanceEvent> retrieveAllLanceEvent() {
		return  FormLanceEventService.ConsulterlistesFormLanceEvent();
	
	}
	//http://localhost:8082/SpringMVC/servlet/add-FormLanceEvent
	@PostMapping("/add-FormLanceEvent")
	
	@ResponseBody
	public FormLanceEvent addFormLanceEvent(@RequestBody FormLanceEvent f ) {
		
		 return FormLanceEventService.ajouterFormLanceEvent(f);

	}
	//http://localhost:8082/SpringMVC/servlet/remove-event/{event-id}
		@DeleteMapping("/remove-form/{FormLanceEvent_ID}")
		@ResponseBody
		public void removeE(@PathVariable("FormLanceEvent_ID") int formId) {
			FormLanceEventService.supprimerFormById(formId);
		}
}
