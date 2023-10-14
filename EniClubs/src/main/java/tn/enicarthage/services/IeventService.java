package tn.enicarthage.services;

import java.util.List;

import tn.enicarthage.entities.event;



public interface IeventService {
	public event ajouterevent(event e);

	public event modifierevent(event e, long id);

	public void supprimerevent(event e);

	public void supprimereventById(int id);
	
	public List<event> ConsulterlistesEvents();

	public event geteventbyId(int id);
}
