package fr.formation.mykafetarea.dtos;


import jakarta.validation.constraints.Positive;
import jdk.jfr.BooleanFlag;
/**
 * A composed DTO that represents useful data and validation rules in order to
 * create a lunchItem	.
 */
public class LunchItemDto {

	private String type;


	private String name;


	private String description;


	private String allergens;


	@Positive
	private Double price;

	@BooleanFlag
	private Boolean reservable;




	public LunchItemDto() {
	//Default Constructor no args
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
	/**
	 * @return the reservable
	 */
	public Boolean getReservable() {
		return reservable;
	}

	/**
	 * @param reservable the reservable to set
	 */
	public void setReservable(Boolean reservable) {
		this.reservable = reservable;
	}

	/**
     * Returns a string representation of this {@code lunchItemDto}.
     *
     * @return a string representation of this {@code lunchItemDto}
     */
	@Override
	public String toString() {
		return "LunchItemCreateDto [type=" + type + ", name=" + name + ", description=" + description + ", allergens="
				+ allergens + ", price=" + price + ", reservable=" + reservable + "]";
	}








}
