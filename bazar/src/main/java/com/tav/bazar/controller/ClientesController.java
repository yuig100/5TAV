package com.tav.bazar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientesController {
	
	@GetMapping("/clientes")
	public String clientes() {
		
		return "clientes";
		
	}
	
}
