package fr.gtm.rest;


import java.util.List;

import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import fr.gtm.DAO.FilmDAO;
import fr.gtm.entities.Film;


@Path("/films")
public class FilmServiceRest {
	
	@Context private ServletContext ctx ;
	
	@POST
	@Path("new")
	@Consumes({ MediaType.APPLICATION_JSON})
	public long saveFilm(Film film) {
		FilmDAO fdao = (FilmDAO) ctx.getAttribute("FILM_DAO");
		
		fdao.create(film);;
		return film.getId();
		}

	@DELETE
	@Path("/delete/{id}")
	public String supprimerFilm(@PathParam("id") long id) {
		FilmDAO fdao = (FilmDAO) ctx.getAttribute("FILM_DAO");
		fdao.delete(id);
		return "film supprimer de la base";
		
	}
	@PUT
	@Path("/update")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Film updateFilm(Film film) {
		FilmDAO fdao = (FilmDAO) ctx.getAttribute("FILM_DAO");
		fdao.update(film);
		return film ;
		
	}
	@GET
	@Path("/All")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Film> getAllFilm(){
		FilmDAO fdao = (FilmDAO) ctx.getAttribute("FILM_DAO");
		return fdao.findAllFilms();
		
	}
	
}