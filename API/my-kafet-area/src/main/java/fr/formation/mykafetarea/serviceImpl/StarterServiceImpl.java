package fr.formation.mka.serviceImpl;



import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.validation.Valid;

import fr.formation.mka.dtos.StarterCreateDto;
import fr.formation.mka.entities.Starter;
import fr.formation.mka.repositories.StarterRepository;
import fr.formation.mka.services.StarterService;

@Service
public class StarterServiceImpl implements StarterService {
	
	@Autowired
	private StarterRepository starterRepository;
	private ModelMapper mapper;
	
	public  StarterServiceImpl (ModelMapper mapper, StarterRepository starterRepository) {
		this.starterRepository = starterRepository;
		this.mapper = mapper;
	

		
	}

	@Override
	public void create(@Valid StarterCreateDto dto) {
		Starter starter = mapper.map(dto, Starter.class);
		starterRepository.save(starter);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StarterCreateDto> findAll() {
		return (List<StarterCreateDto>) starterRepository;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StarterCreateDto> findById(String id) {
		return (List<StarterCreateDto>) starterRepository;
	}
		

	

	
}