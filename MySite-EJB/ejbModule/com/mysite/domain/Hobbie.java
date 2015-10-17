package com.mysite.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 
 * @author AROUS Med Zied
 * @category Entity
 * @version 1.0
 */
@Entity
public class Hobbie implements Serializable {

	// Entity attribues
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String description;
	// Realitionship between Entities
	private User user;

	public Hobbie() {
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the user
	 */
	@ManyToOne
	@JoinColumn(name = "user_fk")
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

}
