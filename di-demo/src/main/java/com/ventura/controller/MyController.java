package com.ventura.controller;

import org.springframework.stereotype.Controller;

import com.ventura.service.SaludoService;

@Controller
public class MyController {
	
	private SaludoService saludoService;
	
	
	
	public MyController(SaludoService saludoService) {
	
		this.saludoService = saludoService;
	}



	public String hola() {
		
		System.out.println("Hola !!!! :");
		return saludoService.decirSaludo();
	}

}
