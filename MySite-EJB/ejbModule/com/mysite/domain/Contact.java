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
public class Contact implements Serializable {

	// Entity attributs
	private static final long serialVersionUID = 1L;
	private int id;
	private String nameAndFirstName;
	private String email;
	private String object;
	private String text;
	// Relationship between Entities
	private User user;

	public Contact() {
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameAndFirstName() {
		return nameAndFirstName;
	}

	public void setNameAndFirstName(String nameAndFirstName) {
		this.nameAndFirstName = nameAndFirstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the user
	 */
	@OneToOne
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
