package com.ventura.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorSaludarService implements SaludoService{

	@Override
	public String decirSaludo() {
		// TODO Auto-generated method stub
		return "Hola - Me inyectaron a través del constructor.";
	}

}
