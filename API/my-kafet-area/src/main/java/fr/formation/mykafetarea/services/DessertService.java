package fr.formation.mykafetarea.services;

import java.util.List;

import javax.validation.Valid;

import fr.formation.mykafetarea.dtos.DessertCreateDto;

public interface DessertService {

	void save(@Valid DessertCreateDto dto);

	List<DessertCreateDto> findAll();

}
