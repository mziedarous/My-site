package com.mysite.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * 
 * @author AROUS Med Zied
 * @category Entity
 * @version 1.0
 */
@Entity
public class Technologie implements Serializable {

	// Entity Attributes
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	// RelationShips between Entities
	private Domain domain;
	private List<Project> projects;

	public Technologie() {
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

	/**
	 * @return the domain
	 */
	@ManyToOne
	@JoinColumn(name = "domain_fk")
	public Domain getDomain() {
		return domain;
	}

	/**
	 * @param domain
	 *            the domain to set
	 */
	public void setDomain(Domain domain) {
		this.domain = domain;
	}

	/**
	 * @return the projects
	 */
	@ManyToMany(mappedBy = "technologies")
	public List<Project> getProjects() {
		return projects;
	}

	/**
	 * @param projects
	 *            the projects to set
	 */
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
}
