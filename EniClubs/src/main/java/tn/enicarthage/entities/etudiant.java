package tn.enicarthage.entities;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Entity
@Table(name="T_etudiant")
public class etudiant extends personne implements Serializable {
	private static final long serialVersionUID = 1L;
	public etudiant(){}
	@Id
	@Column(name="ETUDIANT_ID")
	@GeneratedValue(strategy= GenerationType.TABLE)
	int id ;
	@Column(name="NUM_CARTE")
	int num_carteEtd;
//association entre un etudiant et un formulaire de lancement d'un club
	// un etudiant effectuer plusieurs formulaires de lancement d'un noveau club
	@OneToMany( cascade = CascadeType.ALL , mappedBy = "etd")
	private Set <FormLanceClub> FormLanceClub ;
}
