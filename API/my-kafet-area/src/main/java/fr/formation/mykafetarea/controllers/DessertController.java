package fr.formation.mykafetarea.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.mykafetarea.dtos.DessertCreateDto;
import fr.formation.mykafetarea.services.DessertService;

@RestController
@RequestMapping("/desserts")
public class DessertController {
	
	private final DessertService dessertService;
	
	protected DessertController(@RequestBody DessertService dessertService) {
		this.dessertService = dessertService;
	}
	
	

	public void save(@Valid @RequestBody DessertCreateDto dto) {
		dessertService.save(dto);
		
	}
	@GetMapping("/all")
	ResponseEntity<List<DessertCreateDto>> findAll(){
		List<DessertCreateDto> dessert = dessertService.findAll();
		return new ResponseEntity<>(dessert, HttpStatus.OK);
	
}
}