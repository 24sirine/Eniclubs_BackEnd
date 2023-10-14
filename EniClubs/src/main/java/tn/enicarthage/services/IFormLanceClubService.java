package tn.enicarthage.services;

import java.util.List;

import tn.enicarthage.entities.FormLanceClub;

public interface IFormLanceClubService {
	public FormLanceClub ajouterFormLanceClub(FormLanceClub f);
	public List<FormLanceClub> ConsulterlistesFormLanceClub();
	
	public void supprimerFormById(int formId);

}
