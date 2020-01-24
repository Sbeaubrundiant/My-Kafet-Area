package fr.formation.mykafetarea.services;



import java.util.List;

import javax.validation.Valid;

import fr.formation.mykafetarea.dtos.UserCreateDto;



public interface UserService {
    public void save(@Valid UserCreateDto dto);

	public List<UserCreateDto> findAll();
	public List<UserCreateDto> findById();
    

}
