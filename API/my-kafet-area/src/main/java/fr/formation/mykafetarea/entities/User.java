package fr.formation.mykafetarea.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
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
	
	@OneToOne(mappedBy= "workId", fetch = FetchType.LAZY)
	private Set<Role> roles;

	
	

}
