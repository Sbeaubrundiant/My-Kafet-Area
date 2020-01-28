package fr.formation.mykafetarea.serviceImpl;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.mykafetarea.dtos.StarterCreateDto;
import fr.formation.mykafetarea.repositories.StarterRepository;
import fr.formation.mykafetarea.services.StarterService;


@Service
public class StarterServiceImpl implements StarterService{
	
	@Autowired
	private StarterRepository starterRepository;
	private ModelMapper mapper;
	
	public  StarterServiceImpl (ModelMapper mapper, StarterRepository starterRepository) {
		this.starterRepository = starterRepository;
		this.mapper = mapper;
	}

	@Override
	public void create(@Valid StarterCreateDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<StarterCreateDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StarterCreateDto> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
