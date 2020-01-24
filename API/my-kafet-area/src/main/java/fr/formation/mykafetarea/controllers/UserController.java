package fr.formation.mykafetarea.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.mykafetarea.dtos.UserCreateDto;
import fr.formation.mykafetarea.services.UserService;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/mkaUser")
public class UserController {

	
	private final UserService userService;

	protected UserController(@RequestBody UserService userService) {
		this.userService = userService;
	}

	@PostMapping
	public void save(@Valid @RequestBody UserCreateDto dto) {
		userService.save(dto);
	}

	@GetMapping("/all")
	ResponseEntity<List<UserCreateDto>> findAll() {	
		List<UserCreateDto> user = userService.findAll();
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	


}
