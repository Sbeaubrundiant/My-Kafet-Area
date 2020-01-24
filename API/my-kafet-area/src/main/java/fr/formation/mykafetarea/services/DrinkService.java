package fr.formation.mykafetarea.services;

import java.util.List;

import javax.validation.Valid;

import fr.formation.mykafetarea.dtos.DrinkCreateDto;

public interface DrinkService {

	void save(@Valid DrinkCreateDto dto);

	List<DrinkCreateDto> findAll();

}
