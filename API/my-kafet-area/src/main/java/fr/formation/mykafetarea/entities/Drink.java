package fr.formation.mykafetarea.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Positive;

public class Drink {
	@Entity
	@Table(name = "drinks")
	public class Starter {
		
		@Id
		@Column(nullable = false)
		private String id;
		
		@Column(nullable =false)
		private String name;
		
		@Column(nullable =false)
		private String description;
		
		@Column(nullable =false)
		private String allergens;
		
		
		@Column(nullable =false)
		@Positive
		private Long price;
}}
