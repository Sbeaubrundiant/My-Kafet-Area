package fr.formation.mykafetarea.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.formation.mykafetarea.entities.Starter;


@Repository
public interface StarterRepository extends JpaRepository<Starter, String> {
	List<Starter> findById(Long id);

	
//	@Query("SELECT s.id FROM starter s where s.id = :id") 
//    List<Starter> findStarterById(@Param("id") Long id);
	

}
