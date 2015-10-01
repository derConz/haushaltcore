package de.derconz.kit;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.derconz.kit.persist.User;

public class UserServiceImpl implements IUserService {

	private EntityManagerFactory entityManagerFactory;

    @PersistenceUnit
    public void setEntityManagerFactory(EntityManagerFactory emf) {
        this.entityManagerFactory = emf;
    }
	
	@Override
	public List<User> getUserList() {
		EntityManager em = entityManagerFactory.createEntityManager();
		
		TypedQuery<User> query = em.createQuery("SELECT u FROM User u", User.class);
		List<User> userList = query.getResultList();
		em.close();
		return userList;
	}
	
	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(UserServiceImpl.class);
		logger.trace("Trace");
		logger.debug("Debug");
		logger.info("Info");
		logger.warn("Warning");
		logger.error("Error");
		logger.fatal("Fatal");
	}
}
