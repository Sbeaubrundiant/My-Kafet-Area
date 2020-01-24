package fr.formation.mykafetarea.dtos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class DessertCreateDto {

	@NotNull
    @Size(max = 8, message = "{E_MAX_LENGTH_EXCEEDED}")
	private String id;
	
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


	public DessertCreateDto() {
		super();
	}


	@Override
	public String toString() {
		return "DessertCreateDto [id=" + id + ", name=" + name + ", description=" + description + ", allergens="
				+ allergens + ", price=" + price + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
