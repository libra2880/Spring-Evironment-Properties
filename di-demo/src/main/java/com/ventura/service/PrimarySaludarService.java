package com.ventura.service;



import com.ventura.repository.SaludarRepository;


public class PrimarySaludarService implements SaludoService {


	private SaludarRepository saludarRepository;
		
	public PrimarySaludarService(SaludarRepository saludarRepository) {
		
		this.saludarRepository = saludarRepository;
	}





	@Override
	public String decirSaludo() {
		// "Hola -Primary Saludar Servicio"
		return saludarRepository.getEnglishSaludo();
	}

}
