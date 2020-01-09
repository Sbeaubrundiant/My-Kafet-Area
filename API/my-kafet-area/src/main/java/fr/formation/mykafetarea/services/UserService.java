package fr.formation.mykafetarea.services;

import org.springframework.stereotype.Component;

import fr.formation.mykafetarea.dtos.UserCreateDto;


@Component
public interface UserService {
    public void save(UserCreateDto dto);
    

}
