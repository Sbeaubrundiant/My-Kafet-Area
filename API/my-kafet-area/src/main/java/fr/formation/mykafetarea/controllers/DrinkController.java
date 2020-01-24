package fr.formation.mykafetarea.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fr.formation.mykafetarea.dtos.DrinkCreateDto;
import fr.formation.mykafetarea.services.DrinkService;

public class DrinkController {

	private final DrinkService drinkService;
	
	protected DrinkController(@RequestBody DrinkService drinkService) {
		this.drinkService = drinkService;
	}
	
	@PostMapping
	public void save(@Valid @RequestBody DrinkCreateDto dto) {
		drinkService.save(dto);
	}
	@GetMapping("/all")
	ResponseEntity<List<DrinkCreateDto>> findAll() {
		List<DrinkCreateDto> drink = drinkService.findAll();
		return new ResponseEntity<>(drink, HttpStatus.OK);
	}
}
