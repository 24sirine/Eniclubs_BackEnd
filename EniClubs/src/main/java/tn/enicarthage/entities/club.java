package tn.enicarthage.entities;


import java.io.Serializable;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name="T_club")
public class club implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public club() {}
	public club(String nom, LocalDate date_creation, String description, int nb_membre, String url_logo, String type, String responsable) {
		
	}
	@Id
	@Column(name="CLUB_ID")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int id ;
	@Column(name="CLUB_NOM")
	String nom ;
	@Column(name="CLUB_DATECreation")
	@Temporal(TemporalType.DATE)
	LocalDate date_creation ; 
	@Column(name="CLUB_DESCRIPTION")
	String description;
	@Column(name="CLUB_NbMembre")
	int nb_membre; 
	@Column(name="CLUB_UrlLogo")
	String url_logo;
	@Column(name="CLUB_TYPE")
	@Enumerated(EnumType.STRING)
	 typeClub type; 
	@Column(name="CLUB_RESPONSABLE")
	String responsable;
	// un club peut avoir plusieurs évennements
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "club")
	private Set<event> EVENT;
	
	//association entre club et responsable club
		//un  club posséde  un seule responsable club
		@OneToOne
		 private responsableClub resp;
}
