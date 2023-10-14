package tn.enicarthage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.entities.club;
import tn.enicarthage.repositories.clubRepository;



@Service
public class clubService implements IclubService {
	@Autowired
	clubRepository clubRepository ;
	
	public clubService() {
	}

	
	public club ajouterclub(club c) {
		
	
		return clubRepository.save(c); 
	}

	
	public club modifierclub(club c , long i) {
		club c1 =clubRepository.findById(i).get();
		c1.setDescription(c.getDescription());
		c1.setNb_membre(c.getNb_membre());		
		c1.setResponsable(c.getResponsable());
		c1.setType(c.getType());

		return clubRepository.save(c1);
	}

	
	public void supprimerclub(club c) {
	
		clubRepository.delete(c);
	}

	
	public void supprimerclubById(int id) {
	
		clubRepository.deleteById((long) id);
	}


	public List<club> ConsulterlistesClubs() {
		
		
		List<club> l = null;
		try {
			l =  (List<club>) clubRepository.findAll();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		return l;
	}
	
	public club getclubbyId(int id)
	{ return clubRepository.findById((long) id).get();}
}
