package fr.formation.mykafetarea.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.mykafetarea.dtos.LunchItemDto;
import fr.formation.mykafetarea.services.LunchItemService;
import jakarta.validation.Valid;

@CrossOrigin(origins = {"http://localhost:8080", "http://localhost:3000"}) 
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
     * ' @param dto ' represents the inputs related to lunch item to create
     *
     */

	 @PostMapping("/LunchItemCreate")
	 public void create(@Valid @RequestBody LunchItemDto dto) {
		 lunchItemService.create(dto);
	 }

	 /**
	     * Endpoint to retrieve the informations of all lunch items .
	     *
	     * @return the informations of all saved lunch items
	     */


	 	@GetMapping("/all")
	 	protected List<LunchItemDto> list() {
	 		return lunchItemService.findAll();
	 	}



	 	/**
	     * Endpoint to retrieve the informations of available lunch items .
	     *
	     * @return the informations of all saved lunch items
	     */

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
