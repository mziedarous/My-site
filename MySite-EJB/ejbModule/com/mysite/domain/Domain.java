package com.mysite.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * 
 * @author AROUS Med Zied
 * @category Entity
 * @version 1.0
 */
@Entity
public class Domain implements Serializable {

	// Entity attribues
	private static final long serialVersionUID = 1L;
	private int id;
	private String domain;
	// RelationShip between Entities
	private User user;
	private List<Technologie> technologies;

	public Domain() {
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * @return the user
	 */
	@ManyToOne
	@JoinColumn(name = "domain_fk")
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

	/**
	 * @return the technologies
	 */
	@OneToMany(mappedBy = "domain")
	public List<Technologie> getTechnologies() {
		return technologies;
	}

	/**
	 * @param technologies
	 *            the technologies to set
	 */
	public void setTechnologies(List<Technologie> technologies) {
		this.technologies = technologies;
	}

}
