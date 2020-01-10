package fr.formation.mykafetarea.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"fr.formation.mykafetarea"})
@SpringBootApplication
public class MyKafetAreaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyKafetAreaApplication.class, args);
	}

}
