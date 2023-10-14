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

import tn.enicarthage.entities.club;
import tn.enicarthage.services.IclubService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class clubRestControlImpl {
	@Autowired
	IclubService clubService;
	
	
	//http://localhost:8082/SpringMVC/servlet/retrieve-all-clubs
	@GetMapping("/retrieve-all-clubs")
	public List<club> retrieveAllClubs() {
	List<club> list = clubService.ConsulterlistesClubs();
	return list;
	}
		
			//http://localhost:8082/SpringMVC/servlet/add-club
			@PostMapping("/add-club")
			@ResponseBody
			public club addClub(@RequestBody club c ) {
			return clubService.ajouterclub(c);

			}
			
			
			//http://localhost:8082/SpringMVC/servlet/remove-club/{club-id}
			@DeleteMapping("/remove-club/{club-id}")
			@ResponseBody
			public void removeClub(@PathVariable("club-id") int clubId) {
			clubService.supprimerclubById(clubId);
			}
			
			
			//http://localhost:8082/SpringMVC/servlet/modify-club/{id}
			@PutMapping("/modify-club/{id}")
			@ResponseBody
			public club updateClub(@RequestBody club c,@PathVariable("id") long id) {
			return clubService.modifierclub(c,id);
			
			}
			
			@GetMapping("/getclubbyid/{id}")
		    public club getclubbyid(@PathVariable("id") int id){
		        return clubService.getclubbyId(id);
		    }
}
