package fr.formation.mykafetarea.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.mykafetarea.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
