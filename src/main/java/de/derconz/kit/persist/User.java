package de.derconz.kit.persist;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@Column(name="user_id")
	private String userID;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;

	@Column(name="email")
	private String email;
	
	public User() {
		super();
	}
	
	public User(String userID, String username, String password) {
		super();
		this.userID = userID;
		this.username = username;
		this.password = password;
	}
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
