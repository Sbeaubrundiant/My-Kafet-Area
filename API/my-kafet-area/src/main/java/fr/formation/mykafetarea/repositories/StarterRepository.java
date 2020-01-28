package fr.formation.mykafetarea.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.mykafetarea.entities.Starter;


@Repository
public interface StarterRepository extends JpaRepository<Starter, String> {
	
	
	

}
