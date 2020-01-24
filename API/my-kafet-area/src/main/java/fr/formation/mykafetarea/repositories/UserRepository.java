<<<<<<< HEAD
package fr.formation.mykafetarea.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.mykafetarea.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {




}
=======
package fr.formation.mykafetarea.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.formation.mykafetarea.entities.User;



public interface UserRepository extends JpaRepository<User, Long> {




}
>>>>>>> branch 'master' of https://github.com/Sbeaubrundiant/My-Kafet-Area.git
