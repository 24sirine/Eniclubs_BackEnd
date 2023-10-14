package tn.enicarthage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.repositories.personneRepository;

@Service
public class personneService implements IpersonneService{
	@Autowired
	personneRepository personneRepository ;
	
	public personneService() {
	}
}
