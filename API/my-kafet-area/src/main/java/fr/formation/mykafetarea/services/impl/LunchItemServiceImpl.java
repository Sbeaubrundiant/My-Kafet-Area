package fr.formation.mykafetarea.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import fr.formation.mykafetarea.dtos.LunchItemDto;
import fr.formation.mykafetarea.entities.LunchItem;
import fr.formation.mykafetarea.repositories.LunchItemRepository;
import fr.formation.mykafetarea.services.LunchItemService;
import jakarta.validation.Valid;

@Service
public class LunchItemServiceImpl implements LunchItemService{

	private LunchItemRepository lunchItemRepository;
	private ModelMapper mapper;


	public LunchItemServiceImpl(ModelMapper mapper, LunchItemRepository lunchItemRepository) {
		this.lunchItemRepository = lunchItemRepository;
		this.mapper = mapper;

	}

	@Override
	public void create(@Valid LunchItemDto dto) {

		//LunchItem mapped with dto
		LunchItem item = mapper.map(dto, LunchItem.class);
		lunchItemRepository.save(item);

	}

	@Override
	public List<LunchItemDto> findAll(){
		List<LunchItem> entities = lunchItemRepository.findAll();
		List<LunchItemDto> allDtoLunchItem = new ArrayList<>();
		for (LunchItem lunchItem : entities) {
			LunchItemDto dto = mapper.map(lunchItem, LunchItemDto.class);
			allDtoLunchItem.add(dto);
		}
		return allDtoLunchItem;



	}

//	@Override
//	public <reservableRepository> List<LunchItemCreateDto> findByReservable(Boolean reservable) {
//		List<LunchItem> entities = reservableRepository.findByReservable(reservable);
//		List<LunchItemCreateDto> reservableItemDto = new ArrayList<>();
//		for (LunchItem lunchItem : entities) {
//			LunchItemCreateDto dto = mapper.map(lunchItem, LunchItemCreateDto.class);
//			reservableItemDto.add(dto);
//		}
//		return reservableItemDto;
//	}



	@Override
	public List<LunchItemDto> findByReservable(Boolean reservable) {
		List<LunchItem> entities = lunchItemRepository.findByReservable(reservable);
		List<LunchItemDto> reservableItemDto = new ArrayList<>();
		for(LunchItem lunchItem : entities) {
			LunchItemDto dto = mapper.map(lunchItem, LunchItemDto.class);
			reservableItemDto.add(dto);
		}
		return reservableItemDto;
	}





}
