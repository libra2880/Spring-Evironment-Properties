package com.ventura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.ventura.service.SaludoService;

@Controller
public class GetterInjectedController {

	private SaludoService saludoService;
	
	public String decirHola() {
		return saludoService.decirSaludo();
	}

	@Autowired
	public GetterInjectedController(@Qualifier("getterSaludarService") SaludoService saludoService) {
		
		this.saludoService = saludoService;
	}
	
	
	
}
