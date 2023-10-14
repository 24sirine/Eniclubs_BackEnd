package tn.enicarthage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.services.IresponsableClubService;
//http://localhost:8090/SpringMVC/servlet/resp/123
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class respClubRestControllmpl {
	@Autowired
	private IresponsableClubService respService ;
	
	@GetMapping("resp/{code}")
	public int respLogin(@PathVariable("code") String code )
	 {	
		int flag = respService.validateResp(code);
		if (flag ==0) {return 0 ;}
		else return flag ;
		

	 }
}
