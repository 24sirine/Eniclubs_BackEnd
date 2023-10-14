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
@Table(name="T_FormLanceClub")
public class FormLanceClub implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="FormLanceClub_ID")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Id
	int id ;
	@Column(name="FormLanceClub_nomClub")
	String nomClub;
	@Column(name="FormLanceClub_typeClub")
	typeClub type;
	@Column(name="FormLanceClub_nomP")
	String nom_president;
	@Column(name="FormLanceClub_emailP")
	String email_president;
	@Column(name="FormLanceClub_telP")
	int tel_president;
	@Column(name="FormLanceClub_nbMembre")
	int nbMembre;
	@Column(name="FormLanceClub_description")
	String description;
	@Column(name="FormLanceClub_date")
	@Temporal(TemporalType.DATE)
	Date dateLance;
	@Column(name="FormLanceClub_budget")
	int budget; 
	
	public FormLanceClub() {}
	//association entre un etudiant et un formulaire de lancement d'un club
		// plusieurs formulaires de lancement d'un event peuvent etre associé au meme etudiant
	@ManyToOne(cascade = CascadeType.ALL ,fetch = FetchType.EAGER)
			private etudiant  etd;
}
