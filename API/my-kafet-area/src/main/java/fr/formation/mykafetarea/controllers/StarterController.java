package fr.formation.mykafetarea.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.mykafetarea.dtos.StarterCreateDto;
import fr.formation.mykafetarea.services.StarterService;


@RestController
@RequestMapping("/starters")
public class StarterController {

	private final StarterService starterService;
	
	protected StarterController(@RequestBody StarterService starterService) {
		this.starterService = starterService;
	}
	
	@PostMapping
	public void save(@Valid @RequestBody StarterCreateDto dto) {
		starterService.save(dto);
		
	}
	
	@GetMapping("/all")
	ResponseEntity<List<StarterCreateDto>> findAll() {
		List<StarterCreateDto> starter = starterService.findAll();
		return new ResponseEntity<>(starter, HttpStatus.OK);
			
		
	}
	
}
