package fr.formation.mykafetarea.services.impl;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import fr.formation.mykafetarea.dtos.LunchItemDto;
import fr.formation.mykafetarea.entities.LunchItem;
import fr.formation.mykafetarea.repositories.LunchItemRepository;
import fr.formation.mykafetarea.services.LunchItemService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;

/**
 * The implementation of the LunchItemService interface.
 */
@Service
public class LunchItemServiceImpl implements LunchItemService {

	private LunchItemRepository lunchItemRepository;
	private ModelMapper mapper;

	public LunchItemServiceImpl(ModelMapper mapper, LunchItemRepository lunchItemRepository) {
		this.lunchItemRepository = lunchItemRepository;
		this.mapper = mapper;
	}

	/**
	 * Creates a new lunch item.
	 *
	 * @param dto the DTO representing the lunch item
	 */
	@Override
	public void create(@Valid LunchItemDto dto) {
		LunchItem item = mapper.map(dto, LunchItem.class);
		lunchItemRepository.save(item);
	}

	/**
	 * Retrieves all lunch items.
	 *
	 * @return a list of DTOs representing all lunch items
	 */
	@Override
	public List<LunchItemDto> findAll() {
		List<LunchItem> entities = lunchItemRepository.findAll();
		List<LunchItemDto> allDtoLunchItem = new ArrayList<>();
		for (LunchItem lunchItem : entities) {
			LunchItemDto dto = mapper.map(lunchItem, LunchItemDto.class);
			allDtoLunchItem.add(dto);
		}
		return allDtoLunchItem;
	}

	/**
	 * Retrieves a lunch item by its ID.
	 *
	 * @param id the ID of the lunch item
	 * @return the DTO representing the lunch item
	 * @throws EntityNotFoundException if the lunch item is not found
	 */
	@Override
	public LunchItemDto findById(Long id) {
		LunchItem entity = lunchItemRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("LunchItem not found with id: " + id));
		return mapper.map(entity, LunchItemDto.class);
	}

	/**
	 * Retrieves lunch items by their reservable status.
	 *
	 * @param reservable the reservable status of the lunch items
	 * @return a list of DTOs representing the lunch items
	 */
	@Override
	public List<LunchItemDto> findByReservable(Boolean reservable) {
		List<LunchItem> entities = lunchItemRepository.findByReservable(reservable);
		List<LunchItemDto> reservableItemDto = new ArrayList<>();
		for (LunchItem lunchItem : entities) {
			LunchItemDto dto = mapper.map(lunchItem, LunchItemDto.class);
			reservableItemDto.add(dto);
		}
		return reservableItemDto;
	}

}
