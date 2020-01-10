package fr.formation.mykafetarea.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.mykafetarea.dtos.UserCreateDto;
import fr.formation.mykafetarea.entities.User;
import fr.formation.mykafetarea.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    @Autowired 
    private UserRepository userRepository;
   	private ModelMapper mapper;
   

   
    public UserServiceImpl(UserRepository userRepository, ModelMapper mapper) {
        this.mapper = mapper;
        this.userRepository = userRepository;
    }


	@Override
	public void save(UserCreateDto dto) {
		User user = mapper.map(dto, User.class);
        userRepository.save(user);
		
	}


	


}