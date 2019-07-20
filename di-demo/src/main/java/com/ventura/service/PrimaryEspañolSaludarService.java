package com.ventura.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.ventura.repository.SaludarRepository;


public class PrimaryEspañolSaludarService implements SaludoService {

	private SaludarRepository saludarRepository;
	
	public PrimaryEspañolSaludarService(SaludarRepository saludarRepository) {
		
		this.saludarRepository = saludarRepository;
	}




	@Override
	public String decirSaludo() {
		// TODO Auto-generated method stub
		return saludarRepository.getSpanishSaludo();
	}

}
