package ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.JMSSessionMode;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.User;


@Stateless
public class UserDao {
	
    // Injected database connection:
	@PersistenceContext(unitName="AuctionApplicationPU")
    private EntityManager em;
	
	
	@Inject
	@JMSConnectionFactory("jms/dat250/ConnectionFactory")
	@JMSSessionMode(JMSContext.AUTO_ACKNOWLEDGE)
	private JMSContext context;
	
	
    public void persist(User user) throws NamingException, JMSException {
        em.persist(user);
        em.flush();
    }
    
    public User find(int id) {
    	return em.find(User.class, id);
    }

    // Retrieves all the users:
	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() {
        Query query = em.createQuery("SELECT u FROM User u");
        List<User> users = new ArrayList<User>();
        users = query.getResultList(); // TODO: fix this crappy code.
        return users;
    }
}