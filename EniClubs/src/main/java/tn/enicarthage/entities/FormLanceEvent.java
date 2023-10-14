package tn.enicarthage.entities;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
public class FormLanceEvent implements Serializable {
	private static final long serialVersionUID = 1L;
public FormLanceEvent () {}
@Column(name="FormLanceEvent_ID")
@GeneratedValue(strategy= GenerationType.IDENTITY)
@Id
public int id ;
@Column(name="FormLanceEvent_nomClub")
public String nomClub;
@Column(name="FormLanceEvent_nomEvent")
public String nomEvent ;
@Column(name="FormLanceEvent_typeEvent")
public  typeEvent type;
@Column(name="FormLanceEvent_dateEvent")
@Temporal(TemporalType.DATE)
public String dateEvent;
@Column(name="FormLanceEvent_dureeEvent")
public String dureeEvent;
@Column(name="FormLanceEvent_descriptionEvent")
public String description;
@Column(name="FormLanceEvent_objectifsEvent")
public String objectifsEvent;
@Column(name="FormLanceEvent_placeEvent")
public String place;
@Column(name="FormLanceEvent_budgetEvent")
public int budget; 
@Column(name="FormLanceEvent_MailDemandeur")
public String mailDemandeur ;
@Column(name="FormLanceEvent_telDemandeur")
public String telDemandeur ;
@Column(name="FormLanceEvent_dateDemande")
@Temporal(TemporalType.DATE)
public Date dateDemande;
@Column(name="FormLanceEvent_urlImage")
public String urlImage;
//association entre formLanceEvent et repsonsable club
		//les formulaires de lancement des events sont associés à un seul responsable club
@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
private responsableClub responsable;
}
