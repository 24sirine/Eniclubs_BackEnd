package tn.enicarthage.services;

import tn.enicarthage.entities.etudiant;

public interface IetudiantService {
	public void ajouterEtudiant(etudiant e);
	
	public int validateEtd(String num_carteEtd);

}
