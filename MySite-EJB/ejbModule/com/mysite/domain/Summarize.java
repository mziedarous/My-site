package com.mysite.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * 
 * @author AROUS Med Zied
 * @category Entity
 * @version 1.0
 */
@Entity
public class Summarize implements Serializable {

	// Entity attributes
	private static final long serialVersionUID = 1L;
	private int id;
	private String information;
	// Relationship between Entities
	private User user;
	public Summarize() {
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	/**
	 * @return the user
	 */
	@OneToOne
	@JoinColumn(name="user_fk")
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

}
