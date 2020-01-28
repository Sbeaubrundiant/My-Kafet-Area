fr.formation.mykafetarea.controllers

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.mka.dtos.StarterCreateDto;
import fr.formation.mka.services.StarterService;

@RestController
@RequestMapping("/starters")
public class StarterController {

	private final StarterService starterService;
	
	protected StarterController(StarterService starterService) {
		this.starterService = starterService;
	}
	
	/**
     * Endpoint to create starters with given inputs.
     *
     * ' @param dto ' represents ths inputs related to starter to create
     * 
     */
	
	@PostMapping("/createstarters")
	public void create(@Valid @RequestBody StarterCreateDto dto) {
		starterService.create(dto);
		
	}
	
	/**
     * Endpoint to retrieve the informations of all starters .
     *
     * @return the informations of all saved starters
     */
	
	
	
	@GetMapping("/starters")
	ResponseEntity<List<StarterCreateDto>> findAll() {
		List<StarterCreateDto> starter = starterService.findAll();
		return new ResponseEntity<>(starter, HttpStatus.OK);
			
		
	}
	
	/**
     * Endpoint to retrieve starter informations of an saved starter.
     *
     * @return the informations of an saved starter
     */
	
	@GetMapping("/byid/{id}")
	ResponseEntity<List<StarterCreateDto>> findById(String id) {
		List<StarterCreateDto> starter = starterService.findById(id);
		return new ResponseEntity<>(starter, HttpStatus.OK);
	}
	
}
