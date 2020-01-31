package fr.formation.mykafetarea.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.mykafetarea.dtos.LunchItemCreateDto;
import fr.formation.mykafetarea.services.LunchItemService;

@RestController
@RequestMapping("/lunchitems")
public class LunchItemController {
	
	
	 private final LunchItemService lunchItemService;
	 
	 public LunchItemController(LunchItemService lunchItemService) {
		 this.lunchItemService = lunchItemService;
	 }
	 
	 /**
     * Endpoint to create starters with given inputs.
     *
     * ' @param dto ' represents the inputs related to starter to create
     * 
     */
	 
	 @PostMapping()
	 public void create(@Valid @RequestBody LunchItemCreateDto dto) {
		 lunchItemService.create(dto);
	 }
	 
	 /**
	     * Endpoint to retrieve the informations of all starters .
	     *
	     * @return the informations of all saved starters
	     */

		@GetMapping()
		ResponseEntity<List<LunchItemCreateDto>> findAll() {
			List<LunchItemCreateDto> item = lunchItemService.findAll();
			return new ResponseEntity<>(item, HttpStatus.OK);
				
			
		}
		/**
	     * Endpoint to retrieve lunch item informations.
	     *
	     * @return the informations of an saved lunch item
	     */
		
//		@GetMapping("/{id}")
//		ResponseEntity<List<LunchItemCreateDto>> findByItemId(Long itemId) {
//			List<LunchItemCreateDto> item = lunchItemService.findByItemId(itemId);
//			return new ResponseEntity<>(item, HttpStatus.OK);
//		}
		
	 
	

}
