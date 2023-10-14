package tn.enicarthage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.services.IadminService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class adminRestControllmpl {
@Autowired
private IadminService adminService ;

@GetMapping("admin/{prenom}/{nom}/{email}/{mdp}/{code}")
public int adminLogin(@PathVariable("prenom")String prenom1, @PathVariable("nom")String nom1  ,@PathVariable("email") String email ,  @PathVariable("mdp") String mdp ,@PathVariable("code") String code )
 {	
	int flag = adminService.validateAdmin(prenom1, nom1 , email , mdp , code);
	if (flag ==0) {return 0 ;}
	else return flag ;
	

 }
}
