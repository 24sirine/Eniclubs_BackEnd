package tn.enicarthage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.entities.event;
import tn.enicarthage.repositories.eventRepository;
@Service
public class eventService implements IeventService{
	@Autowired
	eventRepository eventRepository ;
	
	public eventService() {
	}

	public event ajouterevent(event e) {
		
		return eventRepository.save(e); 
	}

	public event modifierevent(event e, long id) {
		event e1 =eventRepository.findById(id).get();
		
		e1.setDescription(e.getDescription());
		e1.setPlace(e.getPlace());
		e1.setTitre(e.getTitre());
		e1.setDate(e.getDate());
		
		return eventRepository.save(e1);
	}

	public void supprimerevent(event e) {
	
		eventRepository.delete(e);
	}

	public void supprimereventById(int id) {
	
		eventRepository.deleteById((long) id);
	}

	public List<event> ConsulterlistesEvents() {
		
		
		List<event> l = null;
		try {
			l =  (List<event>) eventRepository.findAll();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		return l;
	}
	public event geteventbyId(int id)
	{ return eventRepository.findById((long) id).get();}

	
}
