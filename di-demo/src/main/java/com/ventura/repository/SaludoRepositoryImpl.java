package com.ventura.repository;

import org.springframework.stereotype.Component;

@Component
public class SaludoRepositoryImpl implements SaludarRepository{

	@Override
	public String getEnglishSaludo() {
		// TODO Auto-generated method stub
		return "Hello - Primary Greeting service";
	}

	@Override
	public String getSpanishSaludo() {
		// TODO Auto-generated method stub
		return "Servicio de Saludo Primario";
	}

	@Override
	public String getGermanSaludo() {
		// TODO Auto-generated method stub
		return "Primärer Grußdienst";
	}

}
