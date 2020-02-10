package fr.gtm.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@DiscriminatorValue("A")
@NamedQuery(name = "findAllActeur",
			query = "SELECT a FROM Acteur a")
public class Acteur extends Personne implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Acteur(Civilite civilite, String nom, String prenom, LocalDate dateNaissance, LocalDate dateDeces,
			String type) {
		super(civilite, nom, prenom, dateNaissance, dateDeces, type);
		// TODO Auto-generated constructor stub
	}

}
