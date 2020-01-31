package fr.formation.mykafetarea.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import fr.formation.mykafetarea.dtos.LunchItemCreateDto;
import fr.formation.mykafetarea.entities.LunchItem;
import fr.formation.mykafetarea.repositories.LunchItemRepository;
import fr.formation.mykafetarea.services.LunchItemService;

@Service
public class LunchItemServiceImpl implements LunchItemService {
	
	private LunchItemRepository lunchItemRepository;
	private ModelMapper mapper;
	
	
	public LunchItemServiceImpl(ModelMapper mapper, LunchItemRepository lunchItemRepository) {
		this.lunchItemRepository = lunchItemRepository;
		this.mapper = mapper;
	}

	@Override
	public void create(@Valid LunchItemCreateDto dto) {
		
		//LunchItem mapped with dto
		LunchItem item = mapper.map(dto, LunchItem.class);
		lunchItemRepository.save(item);

	}

	@Override
	public List<LunchItemCreateDto> findAll(){
		List<LunchItem> entities = lunchItemRepository.findAll();
		List<LunchItemCreateDto> allDtoLunchItem = new ArrayList<>();
		for (LunchItem lunchItem : entities) {
			LunchItemCreateDto dto = mapper.map(lunchItem, LunchItemCreateDto.class);
			allDtoLunchItem.add(dto);
		}
		return allDtoLunchItem;
		

//		@Override
//		public List<StarterCreateDto> findStarterbyId(Long id) {
//			List<Starter> entities = starterRepository.findStarterById(id);
//			return (List<StarterCreateDto>) starterRepository;
//		}

	}

	@Override
	public List<LunchItemCreateDto> findById(Long itemId) {
		
		return null;
	}

	

//	@Override
//	public List<LunchItemCreateDto> findByItemId(Long itemId) {
//			List<LunchItemCreateDto> entities  =  lunchItemRepository.findByItemId(itemId);
//			return (List<LunchItemCreateDto>) lunchItemRepository;
//	}
	
	

}
