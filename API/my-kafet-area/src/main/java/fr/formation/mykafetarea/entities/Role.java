package fr.formation.mka.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
	
	@Id
	@Column
	private Boolean idRoles;
	
	@Column
	private Boolean isCollaborator;
	
	@Column	
	private Boolean isBrigade;
	
	@Column
	private Boolean isAdmin;
	

}
