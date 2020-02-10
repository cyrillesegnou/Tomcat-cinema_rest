package fr.gtm.web;

import java.util.logging.Logger;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import fr.gtm.DAO.ActeurDAO;
import fr.gtm.DAO.FilmDAO;
import fr.gtm.entities.Acteur;

/**
 * Application Lifecycle Listener implementation class ApplicationListner
 *
 */
public class ApplicationListener implements ServletContextListener {

	private static Logger LOG = Logger.getLogger(ApplicationListener.class.getName());

	
    public void contextDestroyed(ServletContextEvent sce)  { 
    	LOG.info(">>> arrêt de l'application");
    	ServletContext application = sce.getServletContext();
    	EntityManagerFactory emf = (EntityManagerFactory) application.getAttribute("EMF");
    	emf.close();
  
    }


    public void contextInitialized(ServletContextEvent sce)  { 
       
        LOG.info(">>> démarrage de l'application");
        // contexte applicatif
        ServletContext application = sce.getServletContext();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cinema");
        application.setAttribute("EMF", emf);
        FilmDAO filmDao = new FilmDAO(emf);
        application.setAttribute("FILM_DAO", filmDao);
        ActeurDAO acteurDao = new ActeurDAO(emf);
        application.setAttribute("ActeurDAO", acteurDao);
        
        
       
    }
	
}
