package fr.formation.mykafetarea.services;

import java.util.List;

import javax.validation.Valid;

import fr.formation.mykafetarea.dtos.DishesCreateDto;



public interface DishService {

	public void save(@Valid DishesCreateDto dto);

	

	public List<DishesCreateDto> findAll();

}
