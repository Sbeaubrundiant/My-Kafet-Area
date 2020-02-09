package fr.formation.mykafetarea.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.mykafetarea.dtos.LunchItemDto;
import fr.formation.mykafetarea.services.LunchItemService;

@CrossOrigin(origins = {"http://localhost:3000" })
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
	 public void create(@Valid @RequestBody LunchItemDto dto) {
		 lunchItemService.create(dto);
	 }
	 
	 /**
	     * Endpoint to retrieve the informations of all starters .
	     *
	     * @return the informations of all saved starters
	     */
	 
	 	

//		@GetMapping("/all")
//		ResponseEntity<List<LunchItemCreateDto>> findAll() {
//			List<LunchItemCreateDto> item = lunchItemService.findAll();
//			return new ResponseEntity<>(item, HttpStatus.OK);
//				
//			
//		}
		
	 
	 	@GetMapping("/all")
	 	protected List<LunchItemDto> list() {
	 		return lunchItemService.findAll();
	 	}
	 	
	 	
	 	
	 	
	 	
		@GetMapping("/{reservable}")
		protected List<LunchItemDto> findByReservable(@PathVariable Boolean reservable) {
			List<LunchItemDto> item = lunchItemService.findByReservable(reservable);
			return  item;
			
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
