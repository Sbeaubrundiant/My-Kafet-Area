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
	private Long id;
	
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
	 * Default constructor no args
	 */
	public LunchItem() {
	}

	/**
	 * @param id
	 * @param type
	 * @param name
	 * @param description
	 * @param allergens
	 * @param price
	 */
	public LunchItem(Long id, String type, String name, String description, String allergens, Double price) {
		this.id = id;
		this.type = type;
		this.name = name;
		this.description = description;
		this.allergens = allergens;
		this.price = price;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id 
	 * the id to set
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
		return "LunchItem [id=" + id + ", type=" + type + ", name=" + name + ", allergens=" + allergens + ", price="
				+ price + "]";
	}

	
	
	
	
	

}
