package fr.formation.mykafetarea.services;

import java.util.List;

import fr.formation.mykafetarea.dtos.LunchItemDto;


public interface LunchItemService {

	/**
	 * <p> Save lunch item to DB </p>
	 *
	 *@param dto
	 *			 Dto populate the new lunchitem with
	 */
	public void create(LunchItemDto dto);

	public List<LunchItemDto> findAll();
	public List<LunchItemDto> findByReservable(Boolean reservable);

//	public Optional<LunchItem> findById(Long itemId);
//	public List<LunchItemCreateDto> findByItemId(Long itemId);
}
