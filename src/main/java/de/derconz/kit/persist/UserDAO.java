package de.derconz.kit.persist;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

import de.derconz.kit.IUser;

/**
 * DataAccessObject des Users. 
 * Erstellt, findet und löscht User.
 * @author fmu
 *
 */
public class UserDAO {
	
//	private EntityManagerFactory entityManagerFactory;
//
//    @PersistenceUnit
//    public void setEntityManagerFactory(EntityManagerFactory emf) {
//        this.entityManagerFactory = emf;
//    }
	
	@Autowired
	EntityManager em;
	
	public List<User> getUserList() {
//		EntityManager em = entityManagerFactory.createEntityManager();
		TypedQuery<User> query = em.createQuery("SELECT u FROM User u", User.class);
		List<User> userList = query.getResultList();
		em.close();
		return userList;
	}
	
	public IUser getUser(String userID) {
		return new User();
	}
	
	public IUser createUser() {
		return new User();
	}
	
	public void deleteUser(IUser user) {
		
	}
}
