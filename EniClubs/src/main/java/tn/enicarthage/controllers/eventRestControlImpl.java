package tn.enicarthage.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.entities.event;
import tn.enicarthage.services.IeventService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class eventRestControlImpl {
	@Autowired
	IeventService eventService;
	
	
	//http://localhost:8082/SpringMVC/servlet/retrieve-all-events
	@GetMapping("/retrieve-all-events")
	public List<event> retrieveAllevents() {
	List<event> list = eventService.ConsulterlistesEvents();
	return list;
	}
		
			//http://localhost:8082/SpringMVC/servlet/add-event
			@PostMapping("/add-event")
			@ResponseBody
			public event addEvent(@RequestBody event e  ) {
			return eventService.ajouterevent(e);

			}
			
			
			//http://localhost:8082/SpringMVC/servlet/remove-event/{event-id}
			@DeleteMapping("/remove-event/{event-id}")
			@ResponseBody
			public void removeEvent(@PathVariable("event-id") int eventId) {
			eventService.supprimereventById(eventId);
			}
			
			
			//http://localhost:8082/SpringMVC/servlet/modify-event/{id}
			@PutMapping("/modify-event/{id}")
			@ResponseBody
			public event updateEvent(@RequestBody event e,@PathVariable("id") long id) {
			return eventService.modifierevent(e,id);
			
			}
			
			
			
			@GetMapping("/geteventbyid/{id}")
		    public event geteventbyid(@PathVariable("id") int id){
		        return eventService.geteventbyId(id);
		    }
}
