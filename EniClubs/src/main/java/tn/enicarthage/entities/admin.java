package tn.enicarthage.entities;

import java.io.Serializable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name="T_ADMIN")
public class admin extends personne implements Serializable {
private static final long serialVersionUID = 1L;
public admin() {}

	@Column(name="ADMIN_CODE")
	String code;
	
}
