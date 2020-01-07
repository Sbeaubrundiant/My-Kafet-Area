package fr.formation.mykafetarea.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.mykafetarea.services.UserService;

@RestController
@RequestMapping("/mkaUser")
public class UserController {
	
	@Autowired
	private UserService service;

	
	protected UserController(UserService service) {
		this.service = service;
	}

}
