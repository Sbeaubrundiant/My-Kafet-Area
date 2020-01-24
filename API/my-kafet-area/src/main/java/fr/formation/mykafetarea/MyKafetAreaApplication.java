package fr.formation.mykafetarea;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



import fr.formation.mykafetarea.services.DessertServiceImpl;

import fr.formation.mykafetarea.services.DishServiceImpl;
import fr.formation.mykafetarea.services.StarterServiceImpl;



@SpringBootApplication
public class MyKafetAreaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyKafetAreaApplication.class, args);
	}
	
	@Bean
	protected ModelMapper mapper () {
		ModelMapper mapper = new ModelMapper();
		
		return mapper;
	}
	
	@Bean
	protected DishServiceImpl dishService () {
		DishServiceImpl dishService = new DishServiceImpl();
		return dishService;
	}
	
	@Bean
	protected StarterServiceImpl starterService () {
		StarterServiceImpl starterService = new StarterServiceImpl();
		return starterService;
	
}
	@Bean
	protected DessertServiceImpl dessertService () {
		DessertServiceImpl dessertService = new DessertServiceImpl();
		return dessertService;
	}
	
	
}