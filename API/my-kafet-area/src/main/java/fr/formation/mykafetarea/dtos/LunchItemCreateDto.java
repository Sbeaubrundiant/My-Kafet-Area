package fr.formation.mykafetarea.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class LunchItemCreateDto {
	
	@NotBlank
	@Size(max = 65, message = "{E_MAX_LENGTH_EXCEEDED}")
	private String type;
	
	@NotBlank
	@Size(max = 65, message = "{E_MAX_LENGTH_EXCEEDED}" )
	private String name;
	
	@NotBlank
	@Size(max = 400, message = "{E_MAX_LENGTH_EXCEEDED}")
	private String description;
	
	@NotBlank
	@Size(max = 80, message = "{E_MAX_LENGTH_EXCEEDED}")
	private String allergens;
	
	@NotNull
	@Positive
	private Double price;

	
	public LunchItemCreateDto() {
		/**
		 * Default Constructor no args
		 */
		
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
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
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "LunchItemCreateDto [type=" + type + ", name=" + name + ", description=" + description + ", allergens="
				+ allergens + ", price=" + price + "]";
	}

	
	
	
	

}
