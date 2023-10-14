package tn.enicarthage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.services.IetudiantService;
@RestController

public class etudiantRestControllmpl {
	@Autowired
	private IetudiantService etdService ;
	@CrossOrigin(origins="http://localhost:4200/")
	@GetMapping("etd/{num_carteEtd}")
	public int etdLogin(@PathVariable("num_carteEtd") String num_carteEtd )
	 {	
		int flag = etdService.validateEtd(num_carteEtd);
		if (flag ==0) {return 0 ;}
		else return flag ;
		

	 }
}
