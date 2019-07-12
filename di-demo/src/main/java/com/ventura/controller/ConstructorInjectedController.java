package com.ventura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.ventura.service.SaludoService;

@Controller
public class ConstructorInjectedController {
	
	private SaludoService saludoService;

	@Autowired
	public ConstructorInjectedController(@Qualifier("constructorSaludarService") SaludoService saludoService) {
		
		this.saludoService = saludoService;
	}
	
	public String decirHola() {
		return saludoService.decirSaludo();
	}

}
