package fr.formation.mykafetarea.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.mykafetarea.dtos.UserCreateDto;
import fr.formation.mykafetarea.services.UserService;

import javax.validation.Valid;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/mkaUser")
public class UserController {


	private final UserService userService;

	protected UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping
	public void save(@Valid @RequestBody UserCreateDto dto) {
		userService.save(dto);
	}
	

}
