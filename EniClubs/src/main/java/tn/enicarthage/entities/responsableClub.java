package tn.enicarthage.entities;

import java.io.Serializable;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Entity
@Table(name="T_RESPONSABLE_CLUB")
public class responsableClub extends etudiant implements Serializable{
private static final long serialVersionUID = 1L;
	public responsableClub() {}
	@Id
	@Column(name="resp_ID")
	@GeneratedValue(strategy= GenerationType.TABLE)
	int id ;
	@Column(name="resp_code")
	int code;

	//association entre club et responsable club
	//un responsable club est associé à un seule club
	@OneToOne
	 private club c;
	
//association entre formLanceEvent et repsonsable club
	//un responsable club peut effectuer plusieurs formulaire de lancement d'un evenement
	@OneToMany ( cascade = CascadeType.ALL, mappedBy = "responsable")
			private Set<FormLanceEvent> FormLanceEvent;
	
	//association entre formRenouvellement et repsonsable club
		//un responsable club peut effectuer plusieurs formulaire de renouvellement du club au fil des années
   @OneToMany ( cascade = CascadeType.ALL, mappedBy = "responsable")
       private Set<FormRenouvellement> FormRenouvellement;
}
