package fr.formation.mykafetarea;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.formation.mykafetarea.controllers.LunchItemController;
import fr.formation.mykafetarea.services.impl.LunchItemServiceImpl;



@SpringBootApplication
public class MkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MkaApplication.class, args);
	}


	@Bean
	protected ModelMapper modelMapper() {
		 return new ModelMapper();

	
	   
   }
   
}
