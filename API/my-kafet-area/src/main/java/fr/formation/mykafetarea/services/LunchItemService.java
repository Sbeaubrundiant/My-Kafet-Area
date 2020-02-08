package fr.formation.mykafetarea.services;

import java.util.List;
import fr.formation.mykafetarea.dtos.LunchItemCreateDto;


public interface LunchItemService {
	
	/**
	 * <p> Save lunch item to DB </p>
	 * 
	 *@param dto
	 *			 Dto populate the new lunchitem with
	 */
	public void create(LunchItemCreateDto dto);

	public List<LunchItemCreateDto> findAll();
	
//	public Optional<LunchItem> findById(Long itemId);
//	public List<LunchItemCreateDto> findByItemId(Long itemId);
}
