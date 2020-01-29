package fr.formation.mykafetarea.services;

import java.util.List;

import javax.validation.Valid;

import fr.formation.mykafetarea.dtos.StarterCreateDto;

/** <p>This interface defines methods for {@code StarterService}
 * @see StarterCreateDto*/
public interface StarterService {

	public void create(@Valid StarterCreateDto dto);

	/**
	 * <p>Retrieve all saved starters from DB</p>
	 * 
	 * @return {@code List<StarterCreateDto>}
	 */
	public List<StarterCreateDto> findAll();

//	public List<StarterCreateDto> findById(String id);

	

	

//	public List<StarterCreateDto> findStarterbyId(Long id);

}
