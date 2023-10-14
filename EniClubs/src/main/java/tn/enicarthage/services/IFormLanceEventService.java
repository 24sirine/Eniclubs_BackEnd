package tn.enicarthage.services;

import java.util.List;

import tn.enicarthage.entities.FormLanceEvent;



public interface IFormLanceEventService {
	public FormLanceEvent ajouterFormLanceEvent(FormLanceEvent f);
	public List<FormLanceEvent> ConsulterlistesFormLanceEvent();
	public void supprimerFormById(int id);

}
