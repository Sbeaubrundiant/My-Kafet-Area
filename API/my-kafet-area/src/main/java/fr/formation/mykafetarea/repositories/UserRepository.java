package fr.formation.mykafetarea.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import fr.formation.mykafetarea.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {



}