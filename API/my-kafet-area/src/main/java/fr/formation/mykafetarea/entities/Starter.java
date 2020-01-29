package fr.formation.mykafetarea.entities;
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
import javax.validation.constraints.Positive;

@Entity
@Table(name = "starters")
public class Starter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   	@Column(nullable = false)
	private Long id;
	
	@Column(nullable =false)
	private String name;
	
	@Column(nullable =false)
	private String description;
	
	@Column(nullable =false)
	private String allergens;
	
	
	@Column(nullable =false)
	@Positive
	private int price;
	
	


	/**
	 * Default Constructor no args
	 */
	public Starter() {
	}


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the allergens
	 */
	public String getAllergens() {
		return allergens;
	}


	/**
	 * @param allergens the allergens to set
	 */
	public void setAllergens(String allergens) {
		this.allergens = allergens;
	}


	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Starter [id=" + id + ", name=" + name + ", description=" + description + ", allergens=" + allergens
				+ ", price=" + price + "]";
	}
	
	
	

}
