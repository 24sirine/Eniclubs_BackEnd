package tn.enicarthage.services;
import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import tn.enicarthage.entities.admin;
import tn.enicarthage.entities.club;
import tn.enicarthage.entities.etudiant;
import tn.enicarthage.entities.event;
import tn.enicarthage.entities.responsableClub;
import tn.enicarthage.entities.typeClub;
import tn.enicarthage.entities.typeEvent;

@Component
public class StartupDataInitializer implements CommandLineRunner {

    private final adminService adminser;
    private final etudiantService etudiantser;
    private final responsableClubService responsableser;
    private final clubService clubser;
    private final eventService eventser;

    public StartupDataInitializer(adminService adminser,etudiantService etudiantser, responsableClubService responsableser, clubService clubser,eventService eventser) {
        this.adminser = adminser;        
        this.etudiantser=etudiantser;
        this.responsableser=responsableser;
        this.eventser=eventser;
        this.clubser=clubser;
    }

    @Override
    public void run(String... args) throws Exception {
    //Ajout de l'admin au niveau de la BDD	  
        admin admin1 = new admin();
       admin1.setCode("123");   
       admin1.setNom("Bourbiaa");
       admin1.setPrenom("Sirine");
       admin1.setEmail("sirine.bourbiaa11@gmail.com");
       admin1.setMdp("sirine123");
      adminser.ajouterAdmin(admin1);

      
  //Ajout des étudiants au niveau de la BDD   
     etudiant etd1 = new etudiant();
     etd1.setNom("ben yakhlef");
     etd1.setPrenom("amal");
     etd1.setEmail("amalbenyakhlef@yahoo.com");
     etd1.setNum_carteEtd(123456789);
     etd1.setMdp("amal123");
     etudiantser.ajouterEtudiant(etd1);
     
     etudiant etd2 = new etudiant();
     etd2.setNom("ben salah");
     etd2.setPrenom("chehine");
     etd2.setEmail("chehinebensalah@hotmail.com");
     etd2.setNum_carteEtd(987654321);
     etd2.setMdp("chehine123");
     etudiantser.ajouterEtudiant(etd2);
     
     etudiant etd3 = new etudiant();
     etd3.setNom("Limeme");
     etd3.setPrenom("oumaima");
     etd3.setEmail("limeme12oumaima@hotmail.com");
     etd3.setNum_carteEtd(134679258);
     etd3.setMdp("oumaima123");
     etudiantser.ajouterEtudiant(etd3);
     
     etudiant etd4 = new etudiant();
     etd4.setNom("fekih");
     etd4.setPrenom("mariem");
     etd4.setEmail("mariemfekih17@yahoo.com");
     etd4.setNum_carteEtd(191223344);
     etd4.setMdp("mariem123");
     etudiantser.ajouterEtudiant(etd4);
     
     etudiant etd5 = new etudiant();
     etd5.setNom("ben mouloud");
     etd5.setPrenom("manel");
     etd5.setEmail("manel17@gmail.com");
     etd5.setNum_carteEtd(178945623);
     etd5.setMdp("manel123");
     etudiantser.ajouterEtudiant(etd5);
     
     etudiant etd6 = new etudiant();
     etd6.setNom("saoud");
     etd6.setPrenom("mohamed");
     etd6.setEmail("mohmedsaoud20@gmail.com");
     etd6.setNum_carteEtd(937182456);
     etd6.setMdp("mohamed123");
     etudiantser.ajouterEtudiant(etd6);
     
     etudiant etd7 = new etudiant();
     etd7.setNom("ben mbarek");
     etd7.setPrenom("achref");
     etd7.setEmail("benmbarek@yahoo.com");
     etd7.setNum_carteEtd(192635874);
     etd7.setMdp("achref123");
     etudiantser.ajouterEtudiant(etd7);
     
     etudiant etd8 = new etudiant();
     etd8.setNom("ben belgacem");
     etd8.setPrenom("aya");
     etd8.setEmail("aya123@hotmail.com");
     etd8.setNum_carteEtd(172458963);
     etd8.setMdp("aya123");
     etudiantser.ajouterEtudiant(etd8);
     
     etudiant etd9 = new etudiant();
     etd9.setNom("mtibaa");
     etd9.setPrenom("jihen");
     etd9.setEmail("mtibaajihen@hotmail.com");
     etd9.setNum_carteEtd(197845623);
     etd9.setMdp("jihen123");
     etudiantser.ajouterEtudiant(etd9);
     
     etudiant etd10 = new etudiant();
     etd10.setNom("Aoun");
     etd10.setPrenom("oumaima");
     etd10.setEmail("oumaima@yahoo.com");
     etd10.setNum_carteEtd(779955113);
     etd10.setMdp("oumaima123");
     etudiantser.ajouterEtudiant(etd10);
     
 //ajout des responsables club au niveau de la BDD
     responsableClub resp = new responsableClub();
     resp.setNom("ben yakhlef");
     resp.setPrenom("amal");
     resp.setCode(123);
     resp.setEmail("amalbenyakhlef@yahoo.com");
     resp.setNum_carteEtd(123456789);
     resp.setMdp("amal123");
     responsableser.ajouterRespClub(resp);
     
     responsableClub res = new responsableClub();
     res.setNom("Aoun");
     res.setPrenom("oumaima");
     res.setCode(456);
     res.setEmail("oumaima@yahoo.com");
     res.setNum_carteEtd(779955113);
     res.setMdp("oumaima123");
     responsableser.ajouterRespClub(res);
     
     responsableClub re = new responsableClub();
     re.setNom("mtibaa");
     re.setPrenom("jihen");
     re.setCode(789);
     re.setEmail("mtibaajihen@hotmail.com");
     re.setNum_carteEtd(197845623);
     re.setMdp("jihen123");
     responsableser.ajouterRespClub(re);
   //ajout clubs
     //1
     club e = new club();
     e.setNom("GDSC"); 
     e.setType(typeClub.Club_académique);
     e.setDescription("Google Developer Student Clubs");
     LocalDate d1 = LocalDate.of(2017, 3, 10);
    // Date d = new Date(1018,1,1);
     e.setDate_creation(d1);
     e.setNb_membre(50);
     e.setResponsable("jihen");
     e.setUrl_logo("../assets/img/theme/GDSC.png");
     clubser.ajouterclub(e);

//2
     club e2 = new club();
     e2.setNom("MELKART"); 
     e2.setType(typeClub.Club_professionnel);
     e2.setDescription("Junior Entreprise");
    LocalDate d2 = LocalDate.of(2017, 3, 10);
    // Date d = new Date(1018,1,1);
     e2.setDate_creation(d2);
     e2.setNb_membre(70);
     e2.setResponsable("amal");
     e2.setUrl_logo("../assets/img/theme/melk.png");
     clubser.ajouterclub(e2);
     
     //3
     club e3 = new club();
     e3.setNom("JOKER INFO"); 
     e3.setType(typeClub.Club_académique);
     e3.setDescription("sécurité informatique et logiciel");
     LocalDate d3 = LocalDate.of(2020, 5, 5);
    // Date d = new Date(1018,1,1);
     e3.setDate_creation(d3);
     e3.setNb_membre(50);
     e3.setResponsable("oumaima");
     e3.setUrl_logo("../assets/img/theme/joker.png");
     clubser.ajouterclub(e3);
     
    //ajout des events
     event e1 = new event();
     e1.setTitre("workshop"); 
     e1.setType(typeEvent.sur_campus);
     e1.setDescription("design graphique");
      LocalDate d7 = LocalDate.of(2023, 6, 5);

    // Date d1 = new Date(2023,6,5);
     e1.setDate(d7);
     e1.setPlace("Amphi");
     e1.setUrl_img("../assets/img/theme/tunilance.jpg");

     eventser.ajouterevent(e1);
     
     event e4 = new event();
     e4.setTitre("Formation "); 
     e4.setType(typeEvent.sur_campus);
     e4.setDescription("Spring et angular");
      LocalDate d8 = LocalDate.of(2023, 7, 7);

   
     e4.setDate(d8);
     e4.setPlace("Amphi");
     e4.setUrl_img("../assets/img/theme/images.jpg");

     eventser.ajouterevent(e4); 
     
     event e5 = new event();
     e5.setTitre("iftar Time"); 
     e5.setType(typeEvent.sur_campus);
     e5.setDescription("Ramadhan");
      LocalDate d9 = LocalDate.of(2023, 5, 3);

   
     e5.setDate(d9);
     e5.setPlace("Amphi");
     e5.setUrl_img("../assets/img/theme/iftar.jpg");

     eventser.ajouterevent(e5); 
   }
    }
