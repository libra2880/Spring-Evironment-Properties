package com.ventura.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimarySaludarService implements SaludoService {

	@Override
	public String decirSaludo() {
		// TODO Auto-generated method stub
		return "Hola -Primary Saludar Servicio";
	}

}
