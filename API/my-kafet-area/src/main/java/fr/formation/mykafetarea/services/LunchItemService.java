package fr.formation.mykafetarea.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;

import fr.formation.mykafetarea.dtos.LunchItemCreateDto;
import fr.formation.mykafetarea.entities.LunchItem;


public interface LunchItemService {
	
	/**
	 * <p> Save lunch item to DB</p>
	 * 
	 *@param dto
	 *			 Dto populate the new lunchitem with
	 */
	public void create(LunchItemCreateDto dto);

	public List<LunchItemCreateDto> findAll();
	
//	public Optional<LunchItem> findById(Long itemId);
//	public List<LunchItemCreateDto> findByItemId(Long itemId);
}
