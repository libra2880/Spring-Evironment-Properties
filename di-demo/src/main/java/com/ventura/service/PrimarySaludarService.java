package com.ventura.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en","default"})
public class PrimarySaludarService implements SaludoService {

	@Override
	public String decirSaludo() {
		// TODO Auto-generated method stub
		return "Hola -Primary Saludar Servicio";
	}

}
