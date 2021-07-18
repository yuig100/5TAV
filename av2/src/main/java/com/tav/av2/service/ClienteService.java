package com.tav.av2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tav.av2.repository.ClienteRepository;


@Service
public class ClienteService {
	
	@Autowired
	static
	ClienteRepository clienterepository;
	
}
