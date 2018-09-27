package rest;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jms.JMSException;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ejb.UserDao;
import entities.User;

//To test rest operations use the url http://localhost:8080/AuctionApplication/rest/tweets

@Path("/user")
@Stateless
public class RestService {
	
	@EJB
	UserDao userDao;

	@PersistenceContext(unitName = "AuctionApplicationPU")
	private EntityManager em;

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response getUsers() {
		Query query = em.createQuery("SELECT u from \"USER\" u");
		return Response.ok(query.getResultList()).build();
	}

	@GET
	@Path("{id}")
	public Response getUser(@PathParam("id") String id) {
		
		int idInt = Integer.parseInt(id);
		User user = em.find(User.class, idInt);
		
		if (user == null) {
			throw new NotFoundException();
		}
		
		return Response.ok(user).build();
	}
	
	@POST
	@Consumes("application/x-www-form-urlencoded")
	public Response createUser(
			@FormParam("email") String email,
			@FormParam("name") String name,
			@FormParam("phone") String phone
			) {
		
		User user = new User(email, name, phone);
		
		try {
			userDao.persist(user);
			return Response.ok(user.getId()).build();
			
		} catch (NamingException | JMSException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
		
	}
}
