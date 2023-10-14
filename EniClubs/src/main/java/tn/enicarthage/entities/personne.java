package tn.enicarthage.entities;

import java.io.Serializable;



import jakarta.persistence.Column;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;

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

@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass
public abstract class personne implements Serializable{
	private static final long serialVersionUID = 1L;
	public personne() {}
	@Id
	@Column(name="PERSONNE_ID")
	@GeneratedValue(strategy= GenerationType.AUTO)
	int id ;
	
	@Column(name="PERSONNE_nom")
	String nom;
	@Column(name="PERSONNE_prenom")
	String prenom;
	
	@Column(name="PERSONNE_email")
	String email;
	@Column(name="PERSONNE_mdp")
	String mdp;
	


}
