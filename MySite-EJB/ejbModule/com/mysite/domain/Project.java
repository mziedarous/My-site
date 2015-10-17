package com.mysite.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * 
 * @author AROUS Med Zied
 * @category Entity
 * @version 1.0
 */
@Entity
public class Project implements Serializable {

	// Entity Attributes
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private Date startDate;
	private Date endDate;
	private String description;
	// RelationShip Entities
	private User user;
	private List<Technologie> technologies;

	public Project() {
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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

	/**
	 * @return the technologies
	 */
	@ManyToMany
	@JoinTable(name = "t_Projet_technologies", joinColumns = { @JoinColumn(name = "project_fk") }, inverseJoinColumns = { @JoinColumn(name = "technologie_fk") })
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
