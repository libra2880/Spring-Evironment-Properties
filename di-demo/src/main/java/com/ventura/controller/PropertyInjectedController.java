package com.ventura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.ventura.service.SaludoServiceImpl;

@Controller
public class PropertyInjectedController {

	@Autowired
	@Qualifier("saludoServiceImpl")
	public SaludoServiceImpl saludoService;
	
	
	public String decirHola() {
		return saludoService.decirSaludo();
	}
	
}
