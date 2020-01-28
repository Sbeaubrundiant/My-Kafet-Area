package fr.formation.mykafetarea.dtos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class StarterCreateDto {
	

	
	@NotNull
    @Size(max = 65, message = "{E_MAX_LENGTH_EXCEEDED}")
	private String name;
	
	@NotNull
    @Size(max = 400, message = "{E_MAX_LENGTH_EXCEEDED}")
	private String description;
	
	@NotNull
    @Size(max = 40, message = "{E_MAX_LENGTH_EXCEEDED}")
	private String allergens;
	
	
	@NotNull
    @Size(max = 4, message = "{E_MAX_LENGTH_EXCEEDED}")
	@Positive
	private Long price;

	
	
	/**
	 * Default Constructor no args
	 */
	public StarterCreateDto() {
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
	public Long getPrice() {
		return price;
	}



	/**
	 * @param price the price to set
	 */
	public void setPrice(Long price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "StarterCreateDto [name=" + name + ", description=" + description + ", allergens="
				+ allergens + ", price=" + price + "]";
	}
	
	
	
}
