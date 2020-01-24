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

import fr.formation.mykafetarea.dtos.DishesCreateDto;
import fr.formation.mykafetarea.services.DishService;

@RestController
@RequestMapping("/dishes")
public class DishesController {
	
	
	private final DishService dishService;
	
	protected DishesController(@RequestBody DishService dishService) {
		this.dishService = dishService;
		
	}
	@PostMapping
	public void save(@Valid @RequestBody DishesCreateDto dto) {
		dishService.save(dto);
	}
	
	 @GetMapping("/all")
	 ResponseEntity<List<DishesCreateDto>> findAll() {
		 List<DishesCreateDto> dish = dishService.findAll();
		 return new ResponseEntity<>(dish, HttpStatus.OK);
	 }
}
