package tn.enicarthage.entities;

import java.io.Serializable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

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
public class FormRenouvellement implements Serializable{
	private static final long serialVersionUID = 1L;
public FormRenouvellement() {}
@Column(name="FormRenouv_id")
@GeneratedValue(strategy= GenerationType.IDENTITY)
@Id
int id ;
@Column(name="FormRenouv_NomClub")
String nomClub ;
@Column(name="FormRenouv_dateFondationClub")
//@Temporal(TemporalType.DATE)
String dateFondationClub;
@Column(name="FormRenouv_ObjecAtteintDerniereAnnee")
String objecAtteintDerniereAnnee;
@Column(name="FormRenouv_planAnneeSuivante")
String planAnneeSuivante ;
@Column(name="FormRenouv_objectifsAnneeSuivante")
String objectifsAnneeSuivante ;
@Column(name="FormRenouv_BudgetAnneeSuivante")
int budgetAnneeSuivante;
@Column(name="FormRenouv_MailDemandeur")
String mailDemandeur ;
@Column(name="FormRenouv_telDemandeur")
int telDemandeur ;
@Column(name="FormRenouv_dateDemande")
//@Temporal(TemporalType.DATE)
String dateDemande;
//association entre formRenouvellement et repsonsable club
		//les formulaires de renouvellement sont associés à un seul responsable club
@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
private responsableClub responsable;
}
