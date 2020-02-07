package fr.formation.mykafetarea.repositories;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.mykafetarea.entities.LunchItem;

@Repository
public interface LunchItemRepository extends JpaRepository<LunchItem, Long>{
	


	Optional<LunchItem> findById(Long id);
	
	
	

}
