package com.aurelo.render.springredisexample;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringRedisExampleApplication {

	private final MenuRepo menuRepo;
	public static void main(String[] args) {
		SpringApplication.run(SpringRedisExampleApplication.class, args);
	}

	@Bean
	CommandLineRunner clr() {
		return args -> {

			menuRepo.save(new Menu(1, "Chicken", 15));
			menuRepo.save(new Menu(2, "Potato", 5));
			menuRepo.save(new Menu(3, "Salad", 3));
		};
	}
}
