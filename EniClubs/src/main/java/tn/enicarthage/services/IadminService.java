package tn.enicarthage.services;

import tn.enicarthage.entities.admin;


public interface IadminService {
	public void ValiderDemandeCreation();
	public void ValiderDemandeRenouvellement();
	public void ValiderDemandeLancementEvent();
	public void ajouterAdmin(admin a);
	public int validateAdmin(String prenom, String nom, String email ,  String mdp , String code);

}
