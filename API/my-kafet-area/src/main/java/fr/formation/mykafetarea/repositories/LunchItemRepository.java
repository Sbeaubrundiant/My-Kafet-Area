package fr.formation.mykafetarea.repositories;



import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.formation.mykafetarea.dtos.LunchItemCreateDto;
import fr.formation.mykafetarea.entities.LunchItem;

@Repository
public interface LunchItemRepository extends JpaRepository<LunchItem, Long>{
	
//	@Query(value ="SELECT l FROM lunch_items l WHERE l.item_id =:item_id")
//	List<LunchItemCreateDto> findByItemId(@Param("itemId") Long itemID);
	

//	Optional<LunchItem> findLunchItemById(Long id);
	
	
	
//	@Query("SELECT s.id FROM starter s where s.id = :id") 
//  List<Starter> findStarterById(@Param("id") Long id);

}
