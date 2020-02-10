package fr.gtm.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.Table;


@Entity
@Table(name="personnes")
@NamedQueries({
	
})

public class Personne implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Civilite civilite ;
	private String nom ;
	private String Prenom ;
	@Column(name = "date_naissance")
	private LocalDate dateNaissance ;
	@Column(name = "date_deces")
	private LocalDate dateDeces ;
	private String type ;
	public Personne(Civilite civilite, String nom, String prenom, LocalDate dateNaissance, LocalDate dateDeces,
			String type) {
		super();
		this.civilite = civilite;
		this.nom = nom;
		Prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.dateDeces = dateDeces;
		this.type = type;
	}
	public Civilite getCivilite() {
		return civilite;
	}
	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public LocalDate getDateDeces() {
		return dateDeces;
	}
	public void setDateDeces(LocalDate dateDeces) {
		this.dateDeces = dateDeces;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
}
