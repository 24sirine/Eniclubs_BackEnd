package tn.enicarthage;




import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import tn.enicarthage.entities.event;

import tn.enicarthage.repositories.eventRepository;

import tn.enicarthage.services.eventService;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.*;


@SpringBootTest
public class eventTest {




    @Autowired
    private eventService evService;

    @MockBean
    private eventRepository evRepo;

    @Test
    public void getCLUBSTest() {
    	LocalDate d8 = LocalDate.of(2023, 7, 7);
        when(evRepo.findAll()).thenReturn(Stream
                .of(new event("formation", "sur_campus", "descr", d8,"enicar","nologo"), new event("formation2", "sur_campus", "descr2", d8,"enicarthage","nologo")).collect(Collectors.toList()));
        Assertions.assertEquals(2, evService. ConsulterlistesEvents().size());
    }

   

    @Test
    public void saveClubTest() {
    LocalDate d = LocalDate.of(2023, 7, 7);
        event ev = new event("formation", "sur_campus", "descr", d,"enicar","nologo");
        when(evRepo.save(ev)).thenReturn(ev);
        Assertions.assertEquals(ev, evService.ajouterevent(ev));
    }

  

}
