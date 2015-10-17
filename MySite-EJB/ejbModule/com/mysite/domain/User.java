package com.mysite.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author AROUS Med Zied
 * @category Entity
 * @version 1.0
 */
@Entity
@Table(name = "t_user")
public class User implements Serializable {

	// Entity attributs
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String firstName;
	private Date birthday;
	private String town;
	private String country;
	private String email;
	private Long num;
	private String street;
	private String infoPlus;
	// RelationShip between Entities
	private List<Formation> formations;
	private List<Project> projects;
	private List<Domain> domains;
	private Summarize summarize;
	private List<Hobbie> hobbies;
	private Contact contact;

	public User() {

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

	@Column(name = "first_name")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Column(name = "info_plus")
	public String getInfoPlus() {
		return infoPlus;
	}

	public void setInfoPlus(String infoPlus) {
		this.infoPlus = infoPlus;
	}

	/**
	 * @return the formations
	 */
	@OneToMany(mappedBy = "user")
	public List<Formation> getFormations() {
		return formations;
	}

	/**
	 * @param formations
	 *            the formations to set
	 */
	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}

	/**
	 * @return the projects
	 */
	@OneToMany(mappedBy = "user")
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

	/**
	 * @return the domains
	 */
	@OneToMany(mappedBy = "user")
	public List<Domain> getDomains() {
		return domains;
	}

	/**
	 * @param domains
	 *            the domains to set
	 */
	public void setDomains(List<Domain> domains) {
		this.domains = domains;
	}

	/**
	 * @return the summarize
	 */
	@OneToOne(mappedBy = "user")
	public Summarize getSummarize() {
		return summarize;
	}

	/**
	 * @param summarize
	 *            the summarize to set
	 */
	public void setSummarize(Summarize summarize) {
		this.summarize = summarize;
	}

	/**
	 * @return the hobbies
	 */
	@OneToMany(mappedBy = "user")
	public List<Hobbie> getHobbies() {
		return hobbies;
	}

	/**
	 * @param hobbies
	 *            the hobbies to set
	 */
	public void setHobbies(List<Hobbie> hobbies) {
		this.hobbies = hobbies;
	}

	/**
	 * @return the contact
	 */
	@OneToOne(mappedBy = "user")
	public Contact getContact() {
		return contact;
	}

	/**
	 * @param contact
	 *            the contact to set
	 */
	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
