package fr.gtm.DAO;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import fr.gtm.entities.Acteur;




public class ActeurDAO extends AbstractDAO<Acteur, Long>{
		private EntityManagerFactory emf ;
	public ActeurDAO(EntityManagerFactory emf) {
		super(emf, Acteur.class);
		this.emf = this.getEntityManagerFactory();

	}
	
	public List<Acteur> getAllActeur(){
		
		EntityManager em = emf.createEntityManager();
		List<Acteur> acteurs = em.createNamedQuery("findAllActeur", Acteur.class)
								.getResultList();
		em.close();
		return acteurs;
		
	}

	
		
}
