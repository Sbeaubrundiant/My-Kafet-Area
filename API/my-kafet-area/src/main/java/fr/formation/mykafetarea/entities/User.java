package fr.formation.mykafetarea.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
	

	@OneToOne
	private Role role;

	//Default constructor
	public User() {
		
	}
	
	public User(String id, String name, String firstname, String email, String password){
		this.id = id;
		this.name = name;
		this.firstname = firstname;
		this. email = email;
		this.password = password;
		
	}
	
	
	public String getId(String id) {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	

	@Override
	public String toString() {
		return "User [email=" + email + ", firstname=" + firstname + ", id=" + id + ", name=" + name + ", password="
				+ password + ", role=" + role + "]";
	}

	

	}



	
	

	
	


