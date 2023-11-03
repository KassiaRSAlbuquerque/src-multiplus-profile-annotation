package io.github.kassiarsalbuquerque.Vendas.configuration;

import org.springframework.context.annotation.Bean;

import io.github.kassiarsalbuquerque.Vendas.annotation.DevelopmentProfile;

@DevelopmentProfile
public class VendasConfiguration {

	@Bean
	public String applicationName() {
		return "Vendas Application";
	}
	
	@Bean
	public String otherApplicationName() {
		return "Other Application Name";
	}
}