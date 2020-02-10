package fr.gtm.DAO;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


import fr.gtm.entities.Film;



public class FilmDAO extends AbstractDAO<Film, Long>{
	
	private EntityManagerFactory emf ;

	
	public FilmDAO(EntityManagerFactory emf) {
		super (emf, Film.class);
		this.emf = this.getEntityManagerFactory();
		
		
	}
	
	
	public List<Film> getFilmByTitre(String titre){
		String sql = "SELECT f FROM Film f WHERE c.titre= :titre";
		EntityManager em = emf.createEntityManager();
		List<Film> films = em.createQuery(sql, Film.class)
										.setParameter("titre", titre)
										.getResultList();
		em.close();
		return films;
	}

	public List<Film> findAllFilms() {
		EntityManager em = emf.createEntityManager();
		List<Film> films = em.createNamedQuery("film.getAll", Film.class)
										.getResultList();
		em.close();
		return films;
	}

//	public List<Film> findAll(){
//		return em.createNamedQuery("Film.findAll", Film.class)
//									.getResultList();
//	}
//	
	public List<Film> findByYear(int year){
		EntityManager em = emf.createEntityManager();
		List<Film> films = em.createNamedQuery("Film.findByYear", Film.class)
									.setParameter("year", year)
									.getResultList();
		return films;
	}
//	
//	public Film findRealisaateurByFilm (Realisateur realisateur){
//		return (Film) em.createNamedQuery("findRealisateurbyFilm", Realisateur.class)
//					.setParameter("realisateur", realisateur)
//					.getResultList();
//		
//		
//	}

}

		
