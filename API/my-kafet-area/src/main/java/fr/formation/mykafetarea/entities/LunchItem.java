package fr.formation.mykafetarea.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Steven  BEAUBRUN EN FAMILLE DIANT
 *
 */
@Entity
@Table(name = "lunch_items")
public class LunchItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long itemId;
	
	@Column(nullable = false)
	private String type;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String description;
	
		
	@Column(nullable = false)
	private String allergens;
	
	@Column(nullable = false)
	private Double price;

	/**
	 * Default constructo no args
	 */
	public LunchItem() {
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return itemId;
	}

	/**
	 * @param itemId 
	 * the itemId to set
	 */
	public void setId(Long itemId) {
		this.itemId = itemId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name 
	 * the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the allergens
	 */
	public String getAllergens() {
		return allergens;
	}

	/**
	 * @param allergens 
	 * 
	 * the allergens to set
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
	 * @param price 
	 * 
	 * the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
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
	 * @return the itemId
	 */
	public Long getItemId() {
		return itemId;
	}

	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(Long itemId) {
		this.itemId = itemId;
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

	@Override
	public String toString() {
		return "LunchItem [id=" + itemId + ", type=" + type + ", name=" + name + ", allergens=" + allergens + ", price="
				+ price + "]";
	}

	
	
	
	
	

}