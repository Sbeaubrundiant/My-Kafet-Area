package fr.formation.mykafetarea.services;

import java.util.List;

import javax.validation.Valid;

import fr.formation.mykafetarea.dtos.LunchItemCreateDto;


public interface LunchItemService {
	
	/**
	 * <p> Save lunch item to DB</p>
	 * 
	 * @return {@code List<LunchItemCreateDto>}
	 */
	public void create(@Valid LunchItemCreateDto dto);

	public List<LunchItemCreateDto> findAll();
	public List<LunchItemCreateDto> findById(Long itemId);
//	public List<LunchItemCreateDto> findByItemId(Long itemId);
}
