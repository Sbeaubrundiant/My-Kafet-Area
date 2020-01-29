package fr.formation.mykafetarea.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.formation.mykafetarea.dtos.StarterCreateDto;
import fr.formation.mykafetarea.entities.Starter;
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
		// Starter entity mapped with Dto
		Starter starter = mapper.map(dto, Starter.class);
		starterRepository.save(starter);
		
	}

	@Override
	public List<StarterCreateDto> findAll() {
		List<Starter> entities = starterRepository.findAll();
		List<StarterCreateDto> allDtoStarter = new ArrayList<>();
		for (Starter starter : entities) {
			StarterCreateDto dto = mapper.map(starter, StarterCreateDto.class); 
			allDtoStarter.add(dto);
		}
		return allDtoStarter;
	}


//	@Override
//	public List<StarterCreateDto> findStarterbyId(Long id) {
//		List<Starter> entities = starterRepository.findStarterById(id);
//		return (List<StarterCreateDto>) starterRepository;
//	}

}
