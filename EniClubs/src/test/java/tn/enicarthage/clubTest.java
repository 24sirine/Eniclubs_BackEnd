package tn.enicarthage;




import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import tn.enicarthage.entities.club; 
import tn.enicarthage.repositories.clubRepository;
import tn.enicarthage.services.clubService;


import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.*;


@SpringBootTest
public class clubTest {




    @Autowired
    private clubService clService;

    @MockBean
    private clubRepository clRepo;

    @Test
    public void getCLUBSTest() {
    	LocalDate d8 = LocalDate.of(2023, 7, 7);
        when(clRepo.findAll()).thenReturn(Stream
                .of(new club("melkart", d8, "descr", 150,"nologo","club_social","sirine"), new club("tunivision", d8, "description", 30,"nologo","club_social","yasmine")).collect(Collectors.toList()));
        Assertions.assertEquals(2, clService.ConsulterlistesClubs().size());
    }

   

    @Test
    public void saveClubTest() {
    LocalDate d8 = LocalDate.of(2023, 7, 7);
        club cl = new club("melkart", d8, "descr", 150,"nologo","club_social","sirine");
        when(clRepo.save(cl)).thenReturn(cl);
        Assertions.assertEquals(cl, clService.ajouterclub(cl));
    }

  

}
