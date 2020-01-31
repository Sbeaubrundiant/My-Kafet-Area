package fr.formation.mykafetarea;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.formation.mykafetarea.controllers.LunchItemController;
import fr.formation.mykafetarea.services.LunchItemService;
import fr.formation.mykafetarea.services.impl.LunchItemServiceImpl;


@SpringBootApplication
public class MkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MkaApplication.class, args);
	}

	
	
	
	@Bean
	protected ModelMapper mapper () {
		ModelMapper mapper = new ModelMapper();
		return mapper;
	}
	
//	@Bean
//	protected LunchItemServiceImpl serviceImpl () {
//		LunchItemServiceImpl serviceImpl = new LunchItemServiceImpl(mapper, lunchItemRepository);
//		return serviceImpl;
//	}
//	
//	@Bean
//	protected LunchItemController lunchItemController () {
//		LunchItemController lunchItemController = new LunchItemController(lunchItemService);
//		return lunchItemController;
//	}
	
	

	

}
