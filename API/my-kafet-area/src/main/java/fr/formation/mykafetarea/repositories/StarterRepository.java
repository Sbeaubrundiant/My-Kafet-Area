package fr.formation.mka.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.mka.entities.Starter;

@Repository
public interface StarterRepository extends JpaRepository<Starter, String> {
	
	
	

}
