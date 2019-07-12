package com.ventura.service;

import org.springframework.stereotype.Service;

@Service
public class SaludoServiceImpl implements SaludoService{

	
	
	public static final String HOLA_GURUS="Hola Gurus !!!";
	
	@Override
	public String decirSaludo() {
		// TODO Auto-generated method stub
		return HOLA_GURUS;
	}

}
