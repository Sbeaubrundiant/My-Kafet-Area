package fr.formation.mykafetarea.services;

import java.util.List;

import javax.validation.Valid;

import fr.formation.mykafetarea.dtos.StarterCreateDto;

public interface StarterService {

	public void save(@Valid StarterCreateDto dto) ;
		// TODO Auto-generated method stub
		
	

	public List<StarterCreateDto> findAll() ;

	
}
