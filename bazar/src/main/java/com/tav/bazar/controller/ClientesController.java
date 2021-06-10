package com.tav.bazar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tav.bazar.Repository.ClientesRepository;
import com.tav.bazar.model.Clientes;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
	
	@Autowired
	private ClientesRepository clientesRepository;
	
	@GetMapping("/user")
	public List<Clientes> consultar(){
		
		return clientesRepository.findAll();
		
	}
	
}
