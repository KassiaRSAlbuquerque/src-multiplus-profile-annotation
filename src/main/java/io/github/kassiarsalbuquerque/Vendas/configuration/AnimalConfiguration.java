package io.github.kassiarsalbuquerque.Vendas.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.kassiarsalbuquerque.Vendas.Animal;

@Configuration
public class AnimalConfiguration {

	@Bean
	Animal cachorro() {
		return new Animal() {
			@Override
			public String fazerBarulho() {
				return "Au au";
			}
		};
	}
	
	@Bean
	Animal gato() {
		return new Animal() {
			@Override
			public String fazerBarulho() {
				return "Miaaaaaaaaau";
			}
		};
	}
}