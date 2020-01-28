package fr.formation.mka;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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

}
