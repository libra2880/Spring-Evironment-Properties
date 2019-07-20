package com.ventura.service;

import com.ventura.repository.SaludarRepository;

public class SaludoServiceFactory {

	private SaludarRepository saludarRepository;

	public SaludoServiceFactory(SaludarRepository saludarRepository) {
		
		this.saludarRepository = saludarRepository;
	}
	
	
	public SaludoService createSaludarService(String lang) {
		
		switch (lang) {
		case "es":
			return new PrimaryEspañolSaludarService(saludarRepository);
		case "de":
			 return new PrimaryGermanGreetingService(saludarRepository);

		case "en":
		 return new PrimarySaludarService(saludarRepository);
			
		 default:
			 return new PrimarySaludarService(saludarRepository);
		}
	}
	
	
	
}
