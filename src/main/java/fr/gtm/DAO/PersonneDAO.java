package fr.gtm.DAO;

import javax.persistence.EntityManagerFactory;

import fr.gtm.entities.Personne;

public class PersonneDAO extends AbstractDAO<Personne, Long>{
	private EntityManagerFactory emf ;
	

	public PersonneDAO(EntityManagerFactory emf, Class<Personne> entityClass) {
		super(emf, Personne.class);
		this.emf = this.getEntityManagerFactory() ;
		
	}
	
	
	
	
//	
//	public List<Realisateur> findAllRealisateurs(){
//
//		List<Realisateur> realisateurs = em.createQuery("SELECT r FROM Realisateur r",Realisateur.class)
//											.getResultList();
//		em.close();
//		return realisateurs;
//	}
}
