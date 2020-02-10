package fr.gtm.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@DiscriminatorValue("R")
@NamedQuery(name = "findRealisateurbyFilm",
			query = "SELECT f FROM Film WHERE f.realisateur LIKE :nom")
@NamedQuery(name = "findAllRealisateur",
			query = "SELECT r FROM Realisateur r")
public class Realisateur extends Personne implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Realisateur(Civilite civilite, String nom, String prenom, LocalDate dateNaissance, LocalDate dateDeces,
			String type) {
		super(civilite, nom, prenom, dateNaissance, dateDeces, type);
		// TODO Auto-generated constructor stub
	}

}
