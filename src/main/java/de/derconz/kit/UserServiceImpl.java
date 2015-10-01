package de.derconz.kit;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import de.derconz.kit.persist.User;

public class UserServiceImpl implements IUserService {

	private EntityManagerFactory entityManagerFactory;
	
	public UserServiceImpl() {
		entityManagerFactory = Persistence.createEntityManagerFactory("Haushalt");
	}
	
	@Override
	public List<User> getUserList() {
		EntityManager em = entityManagerFactory.createEntityManager();
		
		TypedQuery<User> query = em.createQuery("SELECT u FROM User u", User.class);
		List<User> userList = query.getResultList();
		em.close();
		return userList;
	}
}
