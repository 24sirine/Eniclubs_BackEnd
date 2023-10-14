package tn.enicarthage.services;

import java.util.List;

import tn.enicarthage.entities.club;



public interface IclubService {
	public club ajouterclub(club c);

	public club modifierclub(club c , long i);

	public void supprimerclub(club c);

	public void supprimerclubById(int id);
	
	public List<club> ConsulterlistesClubs();

	public club getclubbyId(int id);
}
