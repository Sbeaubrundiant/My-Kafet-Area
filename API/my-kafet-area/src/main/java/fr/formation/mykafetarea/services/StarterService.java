package fr.formation.mykafetarea.services;

import java.util.List;

import javax.validation.Valid;

import fr.formation.mykafetarea.dtos.StarterCreateDto;

public interface StarterService {

	public void create(@Valid StarterCreateDto dto);

	public List<StarterCreateDto> findAll();

	public List<StarterCreateDto> findById(String id);

}
