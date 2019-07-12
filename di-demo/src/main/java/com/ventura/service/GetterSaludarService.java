package com.ventura.service;

import org.springframework.stereotype.Service;

@Service
public class GetterSaludarService implements SaludoService{

	@Override
	public String decirSaludo() {
		
		return "Hola - Me inyectaron a traves del getter";
	}

}
