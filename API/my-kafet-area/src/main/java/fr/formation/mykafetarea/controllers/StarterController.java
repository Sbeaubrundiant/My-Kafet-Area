package fr.formation.mykafetarea.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.mykafetarea.dtos.StarterCreateDto;
import fr.formation.mykafetarea.entities.Starter;
import fr.formation.mykafetarea.services.StarterService;

@RestController
@RequestMapping("/starters")
public class StarterController {

	private final StarterService starterService;
	
	public StarterController(StarterService starterService) {
		this.starterService = starterService;
	}
	
	/**
     * Endpoint to create starters with given inputs.
     *
     * ' @param dto ' represents the inputs related to starter to create
     * 
     */
	
	@PostMapping()
	public void create(@Valid @RequestBody StarterCreateDto dto) {
		starterService.create(dto);
		
	}
	
	/**
     * Endpoint to retrieve the informations of all starters .
     *
     * @return the informations of all saved starters
     */

	@GetMapping()
	ResponseEntity<List<StarterCreateDto>> findAll() {
		List<StarterCreateDto> starter = starterService.findAll();
		return new ResponseEntity<>(starter, HttpStatus.OK);
			
		
	}
	
	/**
     * Endpoint to retrieve starter informations of an saved starter.
     *
     * @return the informations of an saved starter
     */
	
//	@GetMapping("/{id}")
//	ResponseEntity<List<StarterCreateDto>> findStarterById(Long id) {
//		List<StarterCreateDto> starter = starterService.findStarterbyId(id);
//		return new ResponseEntity<>(starter, HttpStatus.OK);
//	}
	
}
