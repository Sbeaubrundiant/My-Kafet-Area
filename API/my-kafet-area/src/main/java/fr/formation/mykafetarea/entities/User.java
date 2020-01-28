package fr.formation.mka.entities;

/**
 * @author Steven  BEAUBRUN EN FAMILLE DIANT
 *
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	
	@Id
	@Column(nullable = false)
    private String id;
	
	@Column(nullable =false)
	private String name;
	
	@Column(nullable =false)
	private String firstname;
	
	@Column(nullable =false)
	private String email;
	
	@Column(nullable =false)
	private String password;
	
//	@OneToOne(mappedBy= "Id", fetch = FetchType.LAZY)
//	private Set<Role> roles;

	/**
	 * Default Constructor no args
	 */
	public User() {
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

//	/**
//	 * @return the roles
//	 */
//	public Set<Role> getRoles() {
//		return roles;
//	}
//
//	/**
//	 * @param roles the roles to set
//	 */
//	public void setRoles(Set<Role> roles) {
//		this.roles = roles;
//	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", firstname=" + firstname + ", email=" + email + ", password="
				+ password + "]";
	}
	
	
}
