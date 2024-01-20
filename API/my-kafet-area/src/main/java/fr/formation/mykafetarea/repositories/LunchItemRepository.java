package fr.formation.mykafetarea.repositories;

import java.util.Optional;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.mykafetarea.entities.LunchItem;

/**
 * The LunchItemRepository interface provides methods for accessing and manipulating LunchItem entities in the database.
 */
@Repository
public interface LunchItemRepository extends JpaRepository<LunchItem, Long> {

	List<LunchItem> findByReservable(Boolean reservable);

	Optional<LunchItem> findById(Long id);

}
