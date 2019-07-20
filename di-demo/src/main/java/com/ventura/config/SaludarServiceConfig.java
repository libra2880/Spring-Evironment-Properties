package com.ventura.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.ventura.repository.SaludarRepository;
import com.ventura.service.SaludoService;
import com.ventura.service.SaludoServiceFactory;

@Configuration
public class SaludarServiceConfig {
	
	@Bean
	SaludoServiceFactory saludoServiceFactory(SaludarRepository repository) {
		
		return new SaludoServiceFactory(repository);
	}
	
	@Bean
	@Primary
	@Profile({"default","en"})
	SaludoService primarySaludarService(SaludoServiceFactory saludoServiceFactory) {
		return saludoServiceFactory.createSaludarService("en");
	}
	@Bean
	@Primary
	@Profile("es")
	SaludoService primaryEspañolSaludarService(SaludoServiceFactory saludoServiceFactory) {
		
		return saludoServiceFactory.createSaludarService("es");
	}

	@Bean
	@Primary
	@Profile("de")
	SaludoService primaryGermanSaludarService(SaludoServiceFactory saludoServiceFactory) {
		return saludoServiceFactory.createSaludarService("de");
	}
	
	
}
