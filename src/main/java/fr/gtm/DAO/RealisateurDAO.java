package fr.gtm.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import fr.gtm.entities.Realisateur;

public class RealisateurDAO extends AbstractDAO<Realisateur, Long> {
	private EntityManagerFactory emf ;

	public RealisateurDAO(EntityManagerFactory emf, Class<Realisateur> entityClass) {
		super(emf, Realisateur.class);
		this.emf = this.getEntityManagerFactory();
		
	}
	
	public List<Realisateur> getAllRealisateur(){
		
		EntityManager em = emf.createEntityManager();
		List<Realisateur> realisateurs = em.createNamedQuery("findAllRealisateur", Realisateur.class)
								.getResultList();
		return realisateurs;
		
		
	}
	

}
