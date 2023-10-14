package tn.enicarthage.services;

import java.util.List;

import tn.enicarthage.entities.FormRenouvellement;



public interface IFormRenouvellementSevice {
	public FormRenouvellement ajouterFormRenouv(FormRenouvellement f);
	public List<FormRenouvellement> ConsulterlistesFormRenouv();
	public void supprimerFormById(int id);

}
