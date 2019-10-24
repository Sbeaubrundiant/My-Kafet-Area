package fr.formation.mykafetarea.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
	
	@Id
	@Column
	private Boolean idRoles;
	
	@Column
	private Boolean isCollaborator;
	
	@Column	
	private Boolean isCateringTeam;
	
	@Column
	private Boolean isAdmin;
	

}
