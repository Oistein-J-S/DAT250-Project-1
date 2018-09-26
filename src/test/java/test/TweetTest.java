package test;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.User;

public class TweetTest {

	private static final String PERSISTENCE_UNIT_NAME = "DAT250TweetAdvanced";
	private static EntityManagerFactory factory;

	public static void main(String[] args) {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		
		Logger logger = Logger.getLogger("TweetTest");
		// read the existing entries and write to console
		Query q = em.createQuery("select s from User s");
		@SuppressWarnings("unchecked")
		List<User> users = q.getResultList();
		for (User user : users) {
			logger.info("USER: " + user.getName());
		}
	}

}
