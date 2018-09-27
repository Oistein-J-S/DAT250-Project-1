package ejb;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.jms.JMSException;
import javax.naming.NamingException;

import entities.User;

@Singleton
@Startup
public class Initialize {
	
	@EJB
	UserDao userDao;
	
	@PostConstruct
	public void initialize() {
		
		User user = new User("test@test.no", "Test Testson", "12341234");
		
		try {
			userDao.persist(user);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
