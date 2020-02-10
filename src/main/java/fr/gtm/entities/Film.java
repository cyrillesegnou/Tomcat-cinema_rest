package fr.gtm.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "films")

	@NamedQuery(name="Film.getAll",
			query = "SELECT f FROM Film f")
			
	@NamedQuery(name="Film.findByYear",
			query = "SELECT f FROM Film f WHERE YEAR(f.dateSortie) = :year")

	@NamedQuery(name="Film.findByName",
			query = "SELECT f FROM Film f WHERE f.titre Like :titre")
	


public class Film implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "pk_films")
	private long id ;
	private String titre ;
	@Column(name = "date_sortie")
	private LocalDate dateSortie ;
	@Column(name = "prixht")
	private double prixHT ;
	private int duree ;
	
	public Film () {
		
	}
	
	public Film(String titre, LocalDate dateSortie, double prixHT, int duree) {
		super();
		this.titre = titre;
		this.dateSortie = dateSortie;
		this.prixHT = prixHT;
		this.duree = duree;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public LocalDate getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(LocalDate dateSortie) {
		this.dateSortie = dateSortie;
	}

	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	
	
}
