package fr.formation.mka.services;

import java.util.List;

import javax.validation.Valid;

import fr.formation.mka.dtos.StarterCreateDto;

public interface StarterService {

	public void create(@Valid StarterCreateDto dto);

	public List<StarterCreateDto> findAll();

	public List<StarterCreateDto> findById(String id);

}
