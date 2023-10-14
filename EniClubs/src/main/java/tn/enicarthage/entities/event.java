package tn.enicarthage.entities;

import java.io.Serializable;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

@Table(name="T_EVENT")
@Entity
public class event implements Serializable{
	private static final long serialVersionUID = 1L;
	public event () {}
	public event(String titre, String type, String description, LocalDate date, String place, String url_img) {
		
	}
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="EVENT_ID")
	@Id
	int id ;
	@Column(name="EVENT_TITRE")
	String titre ; 
	@Column(name="EVENT_TYPE")
	@Enumerated(EnumType.STRING)
	 typeEvent type;
	@Column(name="EVENT_DESCRIPTION")
	String description ; 
	@Column(name="EVENT_DATE")
	@Temporal(TemporalType.DATE)
	LocalDate date;
	@Column(name="EVENT_PLACE")
	String place ;
	@Column(name="EVENT_URLImg")
	String url_img;
//plusieurs events peuvent apartenir à un seule club
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
			private club club;
}
