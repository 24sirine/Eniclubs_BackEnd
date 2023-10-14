package tn.enicarthage.services;

import tn.enicarthage.entities.responsableClub;

public interface IresponsableClubService {
	public void ajouterRespClub(responsableClub r);
	public int validateResp( String code);

}
